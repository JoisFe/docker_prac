
package com.nhnenter.joisfe.repository;

import com.nhnenter.joisfe.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<Person, Integer> {


    List<Person> findByAge(int age);
}
