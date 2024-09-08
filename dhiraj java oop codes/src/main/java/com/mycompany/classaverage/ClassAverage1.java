/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classaverage;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class ClassAverage1
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1)
        {
            total += grade;
            gradeCounter++;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0)
        {
            double average = (double) total / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else
            System.out.println("No grades were entered");
    }
}
