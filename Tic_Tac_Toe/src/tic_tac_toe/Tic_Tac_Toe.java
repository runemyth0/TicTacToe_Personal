package tic_tac_toe;
import java.util.Scanner;
import java.util.Arrays;

/*
Project: Tic-Tac-Toe Game
Author: James Costo
Date Last Compiled: 10/10/2018
Compiled in NetBeans 8.2
 */
public class Tic_Tac_Toe
{
    public static void main(String[] args) 
    {
        // variables
        String input;
        char symbol;
        int xIn,yIn;
        Scanner keyboard = new Scanner(System.in);
        char[][] board = new char[3][3];
        boolean win = false;
        boolean occupied = false;
        
        // Initialize Board with blank spaces
        for (int i = 0 ; i<3 ; i++)
        {
            for (int j = 0 ; j<3 ; j++)
            {
                board[i][j] = '\040';
            }
        }
        //comment
        do
        {
            // show board 
            System.out.println(" " + board[0][0] + " | " + board[1][0] + " | " + board[2][0] + " \n"
                             + "-----------\n"
                             + " " + board[0][1] + " | " + board[1][1] + " | " + board[2][1] + " \n"
                             + "-----------\n"
                             + " " + board[0][2] + " | " + board[1][2] + " | " + board[2][2] + " \n");

            // ask for player's move (symbol,coordinates)
            System.out.println("Please make your move.");

            System.out.print("Enter your symbol: ");
            input = keyboard.nextLine();
            symbol = input.charAt(0);

            do
            {
                System.out.print("Enter the desired horizontal position: ");
                xIn = keyboard.nextInt() - 1;

                System.out.print("Enter the desired vertical position: ");
                yIn = keyboard.nextInt() - 1;
            
                if (board[xIn][yIn] != '\040')
                {
                    System.out.println("That position is occupied. Please try again.");
                    occupied = true;
                }
                else if () // PROBLEM: if x>y, could result in wrong position SOLN: input validation OR >2d array<
                {
                    
                }
            } while (occupied);
            

            board[xIn][yIn] = symbol;
        } while (!win);
        
        // check if win
    }
}
