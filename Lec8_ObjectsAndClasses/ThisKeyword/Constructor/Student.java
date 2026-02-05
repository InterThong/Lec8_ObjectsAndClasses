/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec8_ObjectsAndClasses.ThisKeyword.Constructor;

class Student {

    int id;
    String name;

    Student() {
        System.out.println("default constructor is invoked");
    }

    Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student e1 = new Student(111, "Karan");
        Student e2 = new Student(222, "Aryan");
        e1.display();
        e2.display();
    }
}
