package OOPS.Abstraction;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayInfo() {
        System.out.println("Student -> Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    void displayInfo() {
        System.out.println("Teacher -> Name: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Abhinav", 20, 101);
        Teacher t = new Teacher("Mr. Sharma", 40, "Computer Science");

        s.displayInfo();
        t.displayInfo();
    }
}

