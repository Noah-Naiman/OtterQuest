package otter;
import java.util.ArrayList;
import java.util.Scanner;

public class Player
	{
		static ArrayList<Character> characters = new ArrayList<Character>();
		
		public static void fillCharacters()
			{
			// name, age, class, health (1-30), mana (1-25), armor (1-10), level (max = 10), damage (1-20 max, can be modified), weapon (spells and damage modifier), speed (1-25, turn modifier)
			characters.add(new Character("Rosa", 24, "Bard", 14, 15, 3, 1, 8, "Lute", 12));
			characters.add(new Character("Selka", 12, "Paladin", 28, 5, 8, 1, 16, "Broadsword", 5));
			characters.add(new Character("Ivy", 9, "Cleric", 17, 21, 2, 1, 4, "Seaweed Staff", 12));
			}
			
		public static void createCharacter()
			{
			Scanner userIntInput = new Scanner(System.in);
			Scanner userStringInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userStringInput.nextLine();
			System.out.println("Hello " + name);
			}
	}


