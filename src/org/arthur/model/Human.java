package org.arthur.model;

import org.arthur.enums.Gender;

/**
 * Created by adobrya on 9/25/2017.
 */
public abstract class Human  {
    private String name;
    private Integer age;
    private Gender gender;

    public Human(){}
    public Human(String name, Integer age,Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
