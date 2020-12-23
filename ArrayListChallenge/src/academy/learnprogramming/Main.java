package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // CHALLENGE
    // Create a program that implements a simple mobile phone with
    // the following capabilities.
    // Able to store, modify, remove and query contact names.
    // You will want to create a separate class for Contacts (name
    // and phone number),
    // Create a master class (MobilePhone) that holds the ArrayList
    // of Contacts.
    // The MobilePhone class has the functionality listed above.
    // Add a menu of options that are available.
    // Options: Quit, print list of contacts, add new contact, update
    // existing contact, remove contact, and search/find contact.
    // When adding or updating be sure to check if the contact already
    // exists (use name) e.g. no ints, no.get(i) etc.
    // MobilePhone should do everything with Contact object only.
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1210 426 5648");


    public static void main(String[] args) {
	boolean quit = false;
	startPhone();
	printActions();
	while(!quit) {
        System.out.println("\nEnter action: (6 to show available actions)");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch(action) {
            case 0:
                System.out.println("\nShutting down...");
                quit = true;
                break;
            case 1:
                mobilePhone.printContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                updateContact();
                break;
            case 4:
                removeContact();
                break;
            case 5:
                queryContact();
                break;
            case 6:
                printActions();
                break;
        }
    }
    }
    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Can't add, " + name + " already on file.");
        }
    }
    private static void updateContact() {
        System.out.println("Enter existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.print("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Error updating record.");
        }
    }
    public static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() +
                "phone number is " + existingContactRecord.getPhoneNumber());
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Error deleting contact");
        }
    }
    public static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() +
                "phone number is " + existingContactRecord.getPhoneNumber());

        }

    public static void startPhone() {
        System.out.println("Starting phone...");
    }
    public static void printActions() {
        System.out.println("\nAvailable actions:\npress:");
        System.out.println("0 - To shutdown\n" +
                "1 - To print contacts\n" +
                "2 - To add a new contact\n" +
                "3 - To update an existing contact\n" +
                "4 - To remove an existing contact\n" +
                "5 - To query if an existing contact exists\n" +
                "6 - To print a list of available actions");
        System.out.println("Choose your action: ");
    }

}
