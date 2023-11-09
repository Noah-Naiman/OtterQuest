package otter;
import java.util.ArrayList;
import java.util.Scanner;

public class Player
	{
		static ArrayList<Otter> characters = new ArrayList<Otter>();
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		public static void fillCharacters()
			{
			// name, age, class, health (1-30), mana (1-25), armor (1-10), level (max = 10), damage (1-20 max, can be modified), weapon (spells and damage modifier), speed (1-25, turn modifier)
			characters.add(new Otter("Rosa", 24, "Bard", 14, 15, 3, 1, 8, "Rokcy Lute", 12));
			characters.add(new Otter("Selka", 12, "Paladin", 28, 5, 8, 1, 16, " Stone Broadsword", 5));
			characters.add(new Otter("Ivy", 9, "Cleric", 17, 21, 2, 1, 4, "Seaweed Staff", 12));
			characters.add(new Otter("Kit", 13, "Rogue", 13, 7, 4, 1, 11, "Pointy Dagger", 18));
			characters.add(new Otter("Ruby", 8, "Sorcerer", 18, 20, 4, 1, 13, "Shrimp Wand", 10));
			}
			
		public static void createCharacter()
			{
			int statPoints = 60;
			System.out.println("What is your name?");
			String pName = userStringInput.nextLine();
			System.out.println("Hello " + pName);
			System.out.println("How old is your otter, 1-20");
			int pAge = userIntInput.nextInt();
			System.out.println("What class would you like to be: Rogue, Paladin, Cleric, Bard, or Sorcerer");
			String pClass = userStringInput.nextLine();
			System.out.println("Now comes the hard part, you have 60 stat points to spend, once you allocate to a stat you can't go back, so be careful.");
			System.out.println("First up health, you can have a max of 30. Remaining stat points: " + statPoints);
			int pHealth = userIntInput.nextInt();
			statPoints = statPoints - pHealth;
			
			}
	}


