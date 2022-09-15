package com.company.aopdemo.oops;

public class Dog {

    private String breed;
    private String name;
    public String color = "Parent color";
    private int age;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void specialCapabilities() {
        System.out.println("No special capabilities, parent dog");
    }

    public void parentMethod() {
        System.out.println("Method of parent class which is not overridden by child class");
    }
}
