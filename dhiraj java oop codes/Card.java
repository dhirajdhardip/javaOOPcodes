/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.card;

/**
 *
 * @author HP
 */
public class Card
{

    private final String face;
    private final String suit;

    public Card(String face, String suit)
    {
        this.face = face;
        this.suit = suit;
    }

    public String toString()
    {
        return face + " of " + suit;
    }
}
