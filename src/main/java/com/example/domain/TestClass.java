package com.example.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by arahansa on 2016-04-02.
 */
@Data
@Entity
public class TestClass {

    @Id
    @GeneratedValue
    private Long id;

    private String msg;

}
