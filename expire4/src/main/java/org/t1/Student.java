package org.t1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student extends Person {

    private String sno;

    @Override
    public void eat() {
        System.out.printf("Student eat, id:%s, name:%s, age:%s, sno:%s%n", id, name, age, sno);
    }

    public void study() {
        System.out.printf("Student study, id:%s, name:%s, age:%s, sno:%s%n", id, name, age, sno);
    }
}
