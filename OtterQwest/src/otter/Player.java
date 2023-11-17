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
			characters.add(new Otter("Rosa", 24, "Bard", 14, 15, 3, 1, 8, "Rokcy Lute", 12, 12, 7));
			characters.add(new Otter("Selka", 12, "Paladin", 28, 5, 8, 1, 16, "Stone Broadsword", 5, 2, 4));
			characters.add(new Otter("Ivy", 9, "Cleric", 17, 21, 2, 1, 4, "Seaweed Staff", 12, 14, 10));
			characters.add(new Otter("Kit", 13, "Rogue", 13, 7, 4, 1, 11, "Pointy Dagger", 18, 3, 5));
			characters.add(new Otter("Ruby", 8, "Sorcerer", 18, 20, 4, 1, 13, "Shrimp Wand", 10, 17, 13));
			}
			
		public static void createCharacter()
			{
			int statPoints = 85;
			System.out.println("What is your name?");
			String pName = userStringInput.nextLine();
			System.out.println("Hello " + pName);
			System.out.println();
			
			System.out.println("How old is your otter, 1-20");
			int pAge = userIntInput.nextInt();
			System.out.println();
			
			System.out.println("What class would you like to be: Rogue, Paladin, Cleric, Bard, or Sorcerer");
			String pClass = userStringInput.nextLine();
			System.out.println();
			
			System.out.println("Now comes the hard part, you have " + statPoints + " stat points to spend, once you allocate to a stat you can't go back, so be careful.");
			System.out.println("First up health, you can have a max of 30. Remaining stat points: " + statPoints);
			int pHealth = userIntInput.nextInt();
			System.out.println();
			statPoints = statPoints - pHealth;
			
			System.out.println("Next is mana, this will be used for spell casting so make sure you didn't waste too many points on health.");
			System.out.println("Depending on your class you might want more or less mana, the limit is 25 and you have " + statPoints + " left.");
			int pMana = userIntInput.nextInt();
			System.out.println();
			statPoints = statPoints - pMana;
			
			
			System.out.println("Then we have armor, this is a flat stat and not class dependent, the limit is 10. You have " + statPoints + " remaining.");
			int pArmor = userIntInput.nextInt();
			System.out.println();
			statPoints = statPoints - pArmor;
			
			System.out.println("Now is damage, this is a big one, the max is 20 and will be modified by your weapon choice.");
			System.out.println("You have " + statPoints + " left to use.");
			int pDamage = userIntInput.nextInt();
			System.out.println();
			statPoints = statPoints - pDamage;
			
			System.out.println("Next is your weapon. This will modify your damage stat depending on your weapon and class choice, ex. a rogue with a knife would get a +2");
			System.out.println("You can choose from: 'Stone Broadsword', 'Rocky Lute', 'Seaweed Staff', 'Pointy Dagger', and 'Shrimp Wand'.");
			String pWeapon = userStringInput.nextLine();
			System.out.println();
			
			System.out.println("Now we have speed. This determines turn order so think about this one. The max is 25.");
			System.out.println("You have " + statPoints + " remaining.");
			int pSpeed = userIntInput.nextInt();
			System.out.println();
			statPoints = statPoints - pSpeed;
			
			System.out.println("Then you have magic damage, think about what class you chose and what weapon you have.");
			System.out.println("There are " + statPoints + " left to spend, the max is 20");
			int pMagic = userIntInput.nextInt();
			System.out.println();
			statPoints = statPoints - pMagic;
			
			System.out.println("Lastly there is resistance, this affects how much damage you take from magic attacks.");
			System.out.println("You have " + statPoints + " remaining.");
			int pResistance = userIntInput.nextInt();
			System.out.println();
			statPoints = statPoints - pResistance;
			
			if(statPoints > 0 && pResistance < 25)
				{
					System.out.println("You have " + statPoints + " left over, would you like to put them into resistance or leave them unspent?");
					System.out.println("Spend them , Leave them (2)");
					int answer  = userIntInput.nextInt();
					System.out.println();
					if(answer == 1)
						{
							pResistance = pResistance + statPoints;
							System.out.println("Enough, it is time to start your adventure.");
							for(int i = 0; i < 100; i++)
							{
								System.out.println();
							}
						}
					else
					{
						System.out.println("Enough, it is time to start your adventure.");
						for(int i = 0; i < 100; i++)
						{
							System.out.println();
						}
					}
					
				}

			
			
			characters.add(new Otter(pName, pAge, pClass, pHealth, pMana, pArmor, 1, pDamage, pWeapon, pSpeed, pMagic, pResistance));			
			}
	}


