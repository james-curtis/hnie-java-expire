import org.t1.Person;
import org.t1.Student;
import org.t1.Teacher;
import org.t2.InkPrinter;
import org.t2.LaserPrinter;

public class Test {

    @org.junit.Test
    public void T1() {
        Person person = new Person();
        person.setName("John");
        person.setId("123");
        person.setAge("11");
        person.eat();
        person.sleep();

        Student student = new Student();
        student.setName("John");
        student.setId("123");
        student.setAge("11");
        student.setSno("999");
        student.eat();
        student.sleep();
        student.study();

        Teacher teacher = new Teacher();
        teacher.setName("John");
        teacher.setId("123");
        teacher.setAge("11");
        teacher.setTid("1121");
        teacher.eat();
        teacher.sleep();
        teacher.teach();

        Person person1 = (Person) student;
        Person person2 = (Person) teacher;
        Student student1 = (Student) person1;
        Teacher teacher1 = (Teacher) person2;
    }

    @org.junit.Test
    public void T2() {
        InkPrinter inkPrinter = new InkPrinter();
        inkPrinter.print("test");

        LaserPrinter laserPrinter = new LaserPrinter();
        laserPrinter.print("test");

    }

    @org.junit.Test
    public void T3() {
        org.t3.InkPrinter inkPrinter = new org.t3.InkPrinter();
        System.out.println(inkPrinter.scan());;
    }

}
