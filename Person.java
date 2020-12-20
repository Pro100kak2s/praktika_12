package com.company;

public class Person {
    private String firstName, secondName, middleName;

    Person(String secondName) {
        this.secondName = secondName;
    }

    Person(String surname, String name, String middleName) {
        this.secondName = surname;
        this.firstName = name;
        this.middleName = middleName;
    }

    public String toString() {
        if (firstName == null || middleName == null) {
            return (secondName);
        } else {
            return secondName+" "+firstName.toUpperCase().charAt(0)+". "+middleName.toUpperCase().charAt(0)+".";

        }
    }

    public static void main(String[] args) {
        Person person = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person.toString());
        Person person1 = new Person("Киргизов");
        System.out.println(person1.toString());
    }

}
