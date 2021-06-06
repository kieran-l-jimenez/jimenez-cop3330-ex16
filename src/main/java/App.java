import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kieran Jimenez
 */
/*
 *           "Legal Driving Age" output
 *What is your age? 15
 *You are not old enough to legally drive.
 *           Or
 *What is your age? 35
 *You are old enough to legally drive.
 */
public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        String result;
        int drivingAge = 16;
        System.out.print("What is your age? ");
        int age = in.nextInt();

        result = age >= drivingAge ? " " : " not ";

        System.out.println("You are" + result +"old enough to legally drive.");
    }

}