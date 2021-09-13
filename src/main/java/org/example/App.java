package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 02 Solution
 *  Copyright 2021 Luis Figueroa
 */
import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        String quote1; //declare the name of the string variable
        String author1; //declare the author

        System.out.println( "What is the quote? " );
        quote1 = userInput.nextLine(); //scan the quote input
        System.out.println( "Who said it? " );
        author1 = userInput.nextLine(); //scans the author input
        //prints out string and uses \" to express the quotation marks in the out
        System.out.println( author1 + " says, " + "\"" + quote1 + "\"" );
    }
}