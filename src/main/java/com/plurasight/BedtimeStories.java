package com.plurasight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class BedtimeStories {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String prompt = "Enter the number of a story: \n"+
                "1.Goldilocks\n" +
                "2.Hansel and Gretel\n" +
                "3.Mary had a little lamb\n";
        System.out.println(prompt);
        int storyNumber = scanner.nextInt();



        BufferedReader bufReader;
        String story;


        switch (storyNumber){
            case 1 -> {
                bufReader = new BufferedReader(new FileReader("src/main/resources/goldilocks.txt"));
                while((story = bufReader.readLine()) != null){
                    System.out.println(story);
                }
            }
            case 2 ->{
                bufReader = new BufferedReader(new FileReader("src/main/resources/hansel_and_gretel.txt"));
                while((story = bufReader.readLine()) != null){
                    System.out.println(story);
                }
            }
            case 3 ->{
                bufReader = new BufferedReader(new FileReader("src/main/resources/mary_had_a_little_lamb.txt"));
                while((story = bufReader.readLine()) != null){
                    System.out.println(story);
                }
                bufReader.close();
            }

            default -> {
                System.out.println("Your input is not correct!");
            }
        }





    }
}
