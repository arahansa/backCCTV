package com.example.repository;

import com.example.domain.TestClass;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by arahansa on 2016-04-02.
 */
public interface TestClassRepository extends JpaRepository<TestClass, Long> {
}
