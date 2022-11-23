package org.t1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Person {

    private String tid;

    @Override
    public void eat() {
        System.out.printf("Teacher eat, id:%s, name:%s, age:%s, tid:%s%n", id, name, age, tid);
    }

    public void teach() {
        System.out.printf("Teacher teach, id:%s, name:%s, age:%s, tid:%s%n", id, name, age, tid);
    }
}
