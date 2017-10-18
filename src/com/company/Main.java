package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Keyboard=new Scanner(System.in);
        Person newPerson= new Person();

        System.out.println("Enter your name");
        newPerson.setFirstName(Keyboard.nextLine());

        Scanner Keyboard1=new Scanner(System.in);
        System.out.println("Enter you LastName");
        newPerson.setLastName(Keyboard1.nextLine());
        System.out.println("Your Fullname is " + newPerson.getFirstName() + newPerson.getLastName());

        Scanner Keyboard2=new Scanner(System.in);
        System.out.println("Enter your address");
        newPerson.setAddress(Keyboard2.nextLine());
        System.out.println("Your address is " + newPerson.getAddress());

        Scanner Keyboard3=new Scanner(System.in);
        System.out.println("Enter your phone number ");
        newPerson.setPhoneNumber(Keyboard3.nextLine());
        System.out.println("Your phone number is " + newPerson.getPhoneNumber());

        Scanner Keyboard4=new Scanner(System.in);
        System.out.println("Enter your email");
        newPerson.setEmail(Keyboard4.nextLine());
        System.out.println("Your email is " + newPerson.getEmail());
        //Keyboard.nextLine();

        System.out.println("---------------------------------------");
        System.out.println("Your full information is:  ");
        System.out.println("Your full name is:  " +newPerson.getFirstName() + newPerson.getLastName()+"Your address is "+ newPerson.getAddress()+ "Your phone number "+ newPerson.getPhoneNumber()+"and your email is "+ newPerson.getEmail() );


    }
}
