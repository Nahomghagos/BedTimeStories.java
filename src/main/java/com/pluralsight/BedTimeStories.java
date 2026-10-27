package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the story: ");
        String storyName = scanner.nextLine();

        if (storyName.equalsIgnoreCase("goldilocks")) {
            storyName = "goldilocks.txt";



        } else if (storyName.equalsIgnoreCase("hansel_and_gretel")) {

            storyName = "hansel_and_gretel.txt";

        }else if (storyName.equalsIgnoreCase("marry_had_a_little_lamp")) {

            storyName= "mary_had_a_little_lamb.txt";
        }


        try (BufferedReader bufReader = new BufferedReader(new FileReader(storyName))) {

            String story;
            int storyNumber = 1;

            while ((story = bufReader.readLine()) != null) {
                System.out.println(storyNumber + ". " + story);
                storyNumber++;
            }

        } catch (Exception ex) {
            System.out.println(" Could not read the file. ");
        }

        scanner.close();
    }
}
