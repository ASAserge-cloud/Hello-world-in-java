/**This is an advanced hello world program to acquaint the user with input and output functionality in java. 
 * Source code written by Awunjia Serge Atabong in Buea-cameroon on the 17/08/2020, for help, contact me directly
 * at awujiaa2018@gmail.com or whatsApp: +237 651565843. This is an open source project, feel free to use/modify.
 */

package com.ASAtech;

import java.util.Scanner;

//Maim class
public class Main {

    //Main method
    public static void main(String[] args) {

        //Declaring a a variable of type string
        String temp;

        //Declaring scanner object for input
        Scanner read = new Scanner(System.in);

        //Displaying output text
        System.out.println("Hello, world!");
        System.out.println("Enter any key to continue...");

        //Reading data from user
        temp = read.next();

        //Displaying another output text after user has entered a character
        System.out.println("Welcome to Java, a strong OOP language!");

        //Open source is love
    }
}
