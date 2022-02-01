package com.company;

public class classObject {
    // Java program to demonstrate initializing
// an array of objects using constructor

        public static void main(String args[])
        {

            // Declaring an array of student
            Student1[] arr;

            // Allocating memory for 2 objects
            // of type student
            arr = new Student1[2];

            // Initializing the first element
            // of the array
            arr[0] = new Student1(1701289270, "Satyabrata");

            // Initializing the second element
            // of the array
            arr[1] = new Student1(1701289219, "Omm Prasad");

            // Displaying the student data
            System.out.println(
                    "Student data in student arr 0: ");
            arr[0].display();

            System.out.println(
                    "Student data in student arr 1: ");
            arr[1].display();
        }
    }

    // Creating a student class with
// id and name as a attributes
    class Student1 {

        public int id;
        public String name;

        // Student class constructor
        Student1(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        // display() method to display
        // the student data
        public void display()
        {
            System.out.println("Student id is: " + id + " "
                    + "and Student name is: "
                    + name);
            System.out.println();
        }
    }


