package com.sunyx.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.Map;
@ConfigurationProperties(prefix = "person")
@Component
@Validated
public class Person {
    //@Value("${person.last-name}")
    @Email
    private String lastName;
    //@Value("#{5*20}")
    private Integer age;
    private String sex;
    private Date birthday;
    private Map<String,String> maps;
    private List<String> lists;
    private Dog dog;

    public Person(String lastName, Integer age, String sex, Date birthday, Map<String, String> maps, List<String> lists, Dog dog) {
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.maps = maps;
        this.lists = lists;
        this.dog = dog;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
