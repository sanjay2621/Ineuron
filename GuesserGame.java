package com.servlet;

import java.util.Scanner;

public class GuesserGame {
	
	public static void main(String[] args)
	{
		Guesser guesser = new Guesser();
		int guesserNumber = guesser.guesserGuessNumber();
		Player player = new Player();
		int player1Number = player.playerGuessNumber("Player1");
		int player2Number = player.playerGuessNumber("Player2");
		int player3Number = player.playerGuessNumber("Player3");
		
		if(guesserNumber == player1Number)
		{
			if(player1Number == player2Number && player1Number == player3Number)
			System.out.println("Player 1,2 and 3 won the game");
			else if(player1Number == player2Number)
				System.out.println("Player 1 and 2 won the game");
			else if(player1Number == player3Number)
				System.out.println("Player 1 and 3 won the game");
			else System.out.println("Player 1 won the game");
		}
		else if(guesserNumber == player2Number)
		{
			if(player2Number == player1Number && player2Number == player3Number)
				System.out.println("Player 1,2 and 3 won the game");
			else if(player2Number == player1Number)
				System.out.println("Player 1 and 2 won the game");
			else if(player2Number == player3Number)
				System.out.println("Player 2 and 3 won the game");
			else System.out.println("Player 2 won the game");
		}
		else if(guesserNumber == player3Number)
		{
			if(player3Number == player1Number && player3Number == player2Number)
				System.out.println("Player 1,2 and 3 won the game");
			else if(player3Number == player1Number)
				System.out.println("Player 1 and 3 won the game");
			else if(player3Number == player2Number)
				System.out.println("Player 2 and 3 won the game");
			else System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game Lost, Please Try Again");
		}

	}
}

class Guesser {
	
	public int guesserGuessNumber()
	{
		Scanner myScan = new Scanner(System.in);
		System.out.println("Guesser Guess Number===>");
		return myScan.nextInt();
	}
}

class Player {
	
	public int playerGuessNumber(String player)
	{
		Scanner myScan = new Scanner(System.in);
		System.out.println(player + " Guess Number===>");
		return myScan.nextInt();
	}
}
