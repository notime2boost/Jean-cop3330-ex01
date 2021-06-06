package ex01;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
class ex01
{
    public static void main( String[] args )
    {
        Scanner Name = new Scanner(System.in);
        System.out.println("What is your name?");

        String userName = Name.nextLine();
        System.out.println("Hello,"+userName+",nice to meet you!");
    }
}