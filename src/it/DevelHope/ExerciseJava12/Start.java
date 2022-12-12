package it.DevelHope.ExerciseJava12;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Person person = new Person();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the name: ");
        person.setName(scanner.nextLine());

        System.out.println("Please insert the surname: ");
        person.setSurname(scanner.nextLine());

        System.out.println("Please insert the height: ");
        person.setHeight(scanner.nextDouble());

        System.out.println("Please insert the age: ");
        person.setAge(scanner.nextInt());

        System.out.printf("The name of this person is %s\n", person.getName());
        System.out.printf("The surname of this person is %s\n", person.getSurname());
        System.out.printf("The height of this person is %.2f\n", person.getHeight());
        System.out.printf("The age of this person is %d", person.getAge());

    }


}
