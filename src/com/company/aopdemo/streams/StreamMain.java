package com.company.aopdemo.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();


        person.setName("Vibhuti");
        person.setEmail("vibhutipatel3401@gmail.com");
        person.setContact("8490973808");
        person.setAge(21);
        personList.add(person);

        person1.setName("Krupesh");
        person1.setEmail("krupeshmpatel@gmail.com");
        person1.setContact("9033495393");
        person1.setAge(29);
        personList.add(person1);

        person2.setName("Mukesh");
        person2.setEmail("meetmpatel@gmail.com");
        person2.setContact("9173934332");
        person2.setAge(53);
        personList.add(person2);

        List<String> personNameList = personList.stream().map(p -> p.getName()).collect(Collectors.toList());
        System.out.println(personNameList);

        List<Integer> ageGreaterThan20 = personList.stream().filter(p -> p.getAge()>20).map(x -> x.getAge()).collect(Collectors.toList());
        System.out.println(ageGreaterThan20);

//        personList.stream().forEach(p -> System.out.println(
//                p.getName() + "\n" + p.getEmail() + "\n" + p.getContact() + "\n" + p.getAge()));

        personList.stream().forEach(p -> System.out.println(p.toString()));

        double ageTotal = personList.stream().collect(Collectors.summingDouble(p -> p.getAge()));
        System.out.println(ageTotal + " is the total age of all person together");

    }
}
