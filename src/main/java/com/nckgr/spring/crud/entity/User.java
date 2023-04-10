package com.nckgr.spring.crud.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "job")
    private String job;
    @Column(name = "age")
    private int age;
    @Column(name = "salary")
    private int salary;

    public User() {
    }

    public User(String name, String job, int age, int salary) {
        this.name = name;
        this.job = job;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && salary == user.salary && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(job, user.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, job, age, salary);
    }
}