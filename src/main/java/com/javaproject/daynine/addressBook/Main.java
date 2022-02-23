package com.javaproject.daynine.addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System\n");

        //Adding the first person
        UserInterface firstPerson = new UserInterface("Harsh", "Choudhary", "KMHS", "ICHALKARANJi", "Maharashtra",
                "harsh@gmail.com", 416115, 1234567890);

        //Adding the Second Person
        UserInterface second = new UserInterface();
        second.setFirstName("Rohit");
        second.setLastName("Jain");
        second.getAddress("BM");
        second.getCity("Ichalkarnaji");
        second.getState("Maharashtra");
        second.getEmail("rohit@gmail.com");
        second.getZipCode(416115);
        second.getPhoneNumber(256655);

        ArrayList<UserInterface> list = new ArrayList<UserInterface>();
        list.add(firstPerson);
        list.add(second);

        //Editing the list

        for (UserInterface name: list) {
            if (name.getFirstName()=="Harsh"){
                name.setFirstName("Rahul");
            }
            if (name.getLastName()=="Choudhary"){
                name.setLastName("Khanna");
            }
            System.out.println(name);
        }

        //Deleting from the list

        list.remove(second);
        System.out.println(list);
    }
}