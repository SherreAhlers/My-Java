package com.timbuchalka;

import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static class Main {
        public Main() {
        }

        public static void main(String[] args) {
            Player sherre = new Player("Sherre", 10, 15);
            System.out.println(sherre.toString());
            saveObject(sherre);
            sherre.setHitPoints(8);
            System.out.println(sherre);
            sherre.setWeapon("Stormbringer");
            saveObject(sherre);
            loadObject(sherre);
            System.out.println(sherre);
            ISaveable werewolf = new Monster("Werewolf", 20, 40);
            System.out.println(((Monster)werewolf).getStrength());
            System.out.println(werewolf);
            saveObject(werewolf);
        }

        public static ArrayList<String> readValues() {
            ArrayList<String> values = new ArrayList();
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            int index = 0;
            System.out.println("Choose\n1 to enter a string\n0 to quit");

            while(!quit) {
                System.out.println("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    ++index;
                }
            }

            return values;
        }

        public static void saveObject(ISaveable objectToSave) {
            for(int i = 0; i < objectToSave.write().size(); ++i) {
                PrintStream var10000 = System.out;
                String var10001 = (String)objectToSave.write().get(i);
                var10000.println("Saving " + var10001 + " to storage device");
            }

        }

        public static void loadObject(ISaveable objectToLoad) {
            ArrayList<String> values = readValues();
            objectToLoad.read(values);
        }
    }
}
