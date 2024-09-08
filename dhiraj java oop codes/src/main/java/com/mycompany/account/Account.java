/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;

/**
 *
 * @author HP
 */
public class Account
{

    private String name;
    private double balance;

    public Account(String name, double balance)
    {
        this.name = name;
        
        if (balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0)
            balance += depositAmount;
    }

    public double getBalance()
    {
        return balance;
    }
}
