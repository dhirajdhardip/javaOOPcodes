/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deckofcards;

/**
 *
 * @author HP
 */
public class DeckOfCardsTest
{

    public static void main(String[] args)
    {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle();
        for (int i = 1; i <= 52; i++)
        {
            System.out.printf("%-19s", myDeckOfCards.dealCard());
            if (i % 4 == 0)
                System.out.println();

        }
    }
}
