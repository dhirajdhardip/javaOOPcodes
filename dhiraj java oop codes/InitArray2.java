/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.initarray2;

/**
 *
 * @author HP
 */
public class InitArray2
{

    public static void main(String[] args)
    {
        if (args.length != 3)
            System.out.printf("Error: Please re-enter the entire command, including%n" + "an array size, initial value, and increment.%n");
        else
        {
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);
            for (int count = 0; count < array.length; count++)
                array[count] = initialValue + increment * count;


            System.out.printf("%s%8s%n", "Index", "Value");
            for (int count = 0; count < array.length; count++)
                System.out.printf("%5d%8d%n", count, array[count]);
        }
    }
}
