package com.example.codeclan.employeeservice.models;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {

    @Column
    private String name;

    @Column
    private int age;

    @Column
    private String employeeNum;

    @Column
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Employee(String name, int age, String employeeNum, String email) {
        this.name = name;
        this.age = age;
        this.employeeNum = employeeNum;
        this.email = email;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(String employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
