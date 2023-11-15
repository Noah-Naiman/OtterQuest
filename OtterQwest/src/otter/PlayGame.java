package otter;
import java.util.Scanner;
public class PlayGame
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				Player.fillCharacters();
				Predator.fillEnemies();
				characterSelector();
			}
		
		public static void characterSelector()
		{
			int characterCounter = 1;
			System.out.println("Would you like to choose a (1) premade character  or (2) create your own ?");
			int createChoice = userInput.nextInt();
			if(createChoice == 1)
				{
					System.out.println("You can choose from:");
						for(int i = 0; i < Player.characters.size(); i++)
							{
								System.out.println("(" + characterCounter + ") " + Player.characters.get(i).getName() + " who is a " + Player.characters.get(i).getClassChoice());
								characterCounter++;
							}
				}
			else 
				{
					Player.createCharacter();
				}
		}

	}
