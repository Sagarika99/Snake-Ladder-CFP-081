package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args){
		int PositionOfPlayer1 = 0;
		int PositionOfPlayer2 = 0;
		int NumOfTimesDiceRolled=0;
		int chance = 0;
			
		 while (PositionOfPlayer1 < 100 && PositionOfPlayer2 < 100){
			Random rand = new Random();
			int RolledDice = (rand.nextInt(6)+1);
			NumOfTimesDiceRolled++;
			chance++;
			
			Random randOption = new Random();
			int Option = (randOption.nextInt(3));
			
			switch(Option) {
				case 0:
					if (chance%2==0) {
						System.out.println("Player 1 got No Play, position of player is: " +PositionOfPlayer1);
						System.out.println();
					}
					else if (chance%2==1) {
						System.out.println("Player 2 got No Play, position of player is: " +PositionOfPlayer2);
						System.out.println();
					}
					break;
					
				case 1:
					if (chance%2==0) {
						if (PositionOfPlayer1 + RolledDice <= 100) {
							PositionOfPlayer1 = PositionOfPlayer1 + RolledDice;
							System.out.println("Player 1 got Ladder, position of player is:" +PositionOfPlayer1);
							System.out.println();
						}
					}
					else {
						if (PositionOfPlayer2 + RolledDice <= 100) {
							PositionOfPlayer2 = PositionOfPlayer2 + RolledDice;
							System.out.println("Player 2 got Ladder, position of player is:" +PositionOfPlayer2);
							System.out.println();
						}
					}
					break;
						
				case 2:
					if (chance%2==0) {
						PositionOfPlayer1 = Math.abs(RolledDice - PositionOfPlayer1);
						System.out.println("Player 1 got Snake, position of player is: " +PositionOfPlayer1);
						System.out.println();
					}
					else if (chance%2==1){
						PositionOfPlayer2 = Math.abs(RolledDice - PositionOfPlayer2);
						System.out.println("Player 2 got Snake, position of player is: " +PositionOfPlayer2);
						System.out.println();
					}
					break;
			}	
		 }
		 System.out.println("No. of times Dice rolled: " +NumOfTimesDiceRolled);		
		 System.out.println("Position of Player 1: " +PositionOfPlayer1);
		 System.out.println("Position of Player 2: " +PositionOfPlayer2);
		 
		 if (PositionOfPlayer1 == 100) 
			 System.out.println("PLayer 1 has won the game!");
		 else
			 System.out.println("PLayer 2 has won the game!");
	}
}