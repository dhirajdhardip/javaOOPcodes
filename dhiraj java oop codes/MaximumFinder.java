/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maximumfinder;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.util.Locale;

public class MaximumFinder
{

    public static double maximum(double x, double y, double z)
    {
        double maximumValue = x;
        if (y > maximumValue)
            maximumValue = y;

        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter three numbers: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum number: " + result);
    }
}
