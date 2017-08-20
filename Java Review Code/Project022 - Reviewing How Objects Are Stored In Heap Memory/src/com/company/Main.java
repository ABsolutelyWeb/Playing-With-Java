package com.company;

public class Main {

    public static void main(String[] args) {

        int[] studentIds = new int[] {1001, 1002, 1003};

        Student student1 = new Student(studentIds[0], "joan");
        student1.gender = "male";

        Student student2 = new Student(studentIds[1], "raj");
        student2.gender = "male";

        Student student3 = new Student(studentIds[2], "anita");
        student3.gender = "female";

        System.out.println("student1: " + student1.name);
        System.out.println("student2: " + student2.name);
        System.out.println("student3: " + student3.name);

        System.out.println(" ");

        student1.updateProfile("john");
        System.out.println("Updated name of student1: " + student1.name);

        System.out.println(" ");
        System.out.println("Now things get interesting. Let's assign student1 to student 4.");


		Student student4 = student1;
		System.out.println("student1: " + student1.name);
		System.out.println("student4: " + student4.name);

        System.out.println(" ");
        System.out.println("Now let's update student4's name and see how it affects student1.");

		student4.updateProfile("mike");
		System.out.println("student1: " + student1.name);
		System.out.println("student4: " + student4.name);

        System.out.println(" ");
        System.out.println("Now let's assign student2 to student4.");

		student4 = student2;
		System.out.println("student2: " + student2.name);
		System.out.println("student4: " + student4.name);
		System.out.println("student1: " + student1.name);

        System.out.println("");
        System.out.println("Assign student1 to student2.");

        student2 = student1;
        System.out.println("student4: " + student4.name);
		System.out.println("student2: " + student2.name);
		System.out.println("student1: " + student1.name);

		student4 = new Student("Alex");
		System.out.println("Name of student4: " + student4.name);
		System.out.println("Name of student2: " + student2.name);
		System.out.println("Name of student1: " + student1.name);

    }
}
