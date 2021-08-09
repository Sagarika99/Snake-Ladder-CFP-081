package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args){
		int PositionOfPlayer = 0;
	
		while (PositionOfPlayer<100) {
			Random rand = new Random();
			int RolledDice = (rand.nextInt(6)+1);
				
			System.out.println("The Number on the dice is: " +RolledDice);
			
			Random randOption = new Random();
			int Option = (randOption.nextInt(3));
				
			if (Option == 1) {
				PositionOfPlayer = RolledDice + PositionOfPlayer;
				System.out.println("Player got Ladder, position of player is:" +PositionOfPlayer);
				System.out.println();
			}
			else if (Option == 2) {
				PositionOfPlayer = Math.abs(RolledDice - PositionOfPlayer);
				System.out.println("Player got Snake, position of player is: " +PositionOfPlayer);
				System.out.println();	
			}
			else {
				System.out.println("Player got No Play, position of player is: " +PositionOfPlayer);
				System.out.println();				
			}
		}
	}
}


