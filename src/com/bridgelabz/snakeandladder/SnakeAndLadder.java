package com.bridgelabz.snakeandladder;

import java.util.Random;

public class SnakeAndLadder {
	public static void main(String[] args){
		int Snake;
		int Ladder;
		int PositionOfPlayer = 0;
		
		Random rand = new Random();
		int RolledDice = (rand.nextInt(6)+1);
		
		System.out.println("The Number on the dice is: " +RolledDice);
		
		

	}

}
