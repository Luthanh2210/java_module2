package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change(); // calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");
        Student s4 = new Student(444, "Thanh");
        Student s5 = new Student(555, "Dat");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
     }
}
