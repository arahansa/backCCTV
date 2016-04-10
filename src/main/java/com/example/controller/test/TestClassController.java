package com.example.controller.test;

import com.example.domain.TestClass;
import com.example.repository.TestClassRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by arahansa on 2016-04-02.
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestClassController {

    @Autowired
    private TestClassRepository testClassRepository;

    // List
    @RequestMapping("/list")
    public List<TestClass> list(){
        return testClassRepository.findAll();
    }

    // READ
    @RequestMapping(value="/{id}" , method = RequestMethod.GET)
    public TestClass index(@PathVariable Long id){
        log.debug("id : {}" , id);
        return testClassRepository.findOne(id);
    }

    // CREATE
    @RequestMapping(value="/create", method = RequestMethod.GET)
    public TestClass create(TestClass testClass){
        log.debug("testClass : {} ", testClass);
        return testClassRepository.save(testClass);
    }

    // Delete
    @RequestMapping(value="/delete/{id}")
    public String delete(@PathVariable Long id){
        log.debug("id : {}" , id);
        testClassRepository.delete(id);
        return "success";
    }

}
