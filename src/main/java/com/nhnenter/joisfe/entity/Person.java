package com.nhnenter.joisfe.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Entity
@Table(name = "person")
public class Person {

    @Id
    @Column(name = "no")
    private int no;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    // 생성자, Getter/Setter, toString 등 생략
}
