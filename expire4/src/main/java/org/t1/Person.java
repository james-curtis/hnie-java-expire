package org.t1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    protected String id;
    protected String name;
    protected String age;

    public void sleep() {
        System.out.printf("Person sleep, id:%s, name:%s, age:%s%n", id, name, age);
    }

    public void eat() {
        System.out.printf("Person eat, id:%s, name:%s, age:%s%n", id, name, age);
    }
}