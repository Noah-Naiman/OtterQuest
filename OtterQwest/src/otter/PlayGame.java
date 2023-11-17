package otter;
import java.util.Scanner;
public class PlayGame
	{
		static Scanner userInput = new Scanner(System.in);
		static int player = 0;
		static int enemyDesignator = 0;
		static int turnCounter = 1;
		static int enemyHealth = 0;
		static int playerHealth = 0;
		static boolean playing = true;
		public static void main(String[] args)
			{
				
				Player.fillCharacters();
				Predator.fillEnemies();
				characterSelector();
				mapChoice();
							}
		
		public static void characterSelector()
		{
			int characterCounter = 1;
			System.out.println("Would you like to choose a (1) premade character  or (2) create your own ?");
			int createChoice = userInput.nextInt();
			System.out.println();
			if(createChoice == 1)
				{
					System.out.println("You can choose from:");
						for(int i = 0; i < Player.characters.size(); i++)
							{
								System.out.println("(" + characterCounter + ") " + Player.characters.get(i).getName() + " who is a " + Player.characters.get(i).getClassChoice());
								characterCounter++;
							}
					System.out.println("Who would you like to be?");
					System.out.println();
					int premadeChoice = userInput.nextInt();
					System.out.println();
					
					if(premadeChoice == 1)
					{
						player = 0;
					}
					else if(premadeChoice == 2)
					{
						player = 1;
					}
					else if(premadeChoice == 3)
					{
						player = 2;
					}
					else if(premadeChoice == 4)
					{
						player = 3;
					}
					else if(premadeChoice == 5)
					{
						player = 4;
					}
						
				}
			else 
				{
					Player.createCharacter();
					player = 5;
				}
		}
		
		public static void mapChoice()
		{
			System.out.println("Before you are two paths, one leads to a dark creepy forest and the other to a large foreboding castle.");
			System.out.println("Which do you choose to take (1) Forest or (2) Castle");
			int pathChoice = userInput.nextInt();
			System.out.println();
			
			if(pathChoice == 1)
			{
				System.out.println("You go down the forest path and come to a clearing where a " + Predator.enemies.get(1).getEName() + " is waiting to ambush you.");
				enemyDesignator = 1;
				while(playing = true)
				{
					combat();
					if(playerHealth <=0 || enemyHealth <=0)
					{
						playing = false;
						if(playerHealth <= 0)
						{
							System.out.println("You have failed, your journey has come to an end.");
						}
						else if(enemyHealth <= 0)
						{
							System.out.println("Congratulations, you have won your fight.");
						}
					}
				}
			}
			else if(pathChoice == 2)
			{
				System.out.println("As you walk into the throne room of the castle you see a " + Predator.enemies.get(4).getEName() + " sitting on the throne ready for a fight.");
				enemyDesignator = 4;
				while(playerHealth > 0 || enemyHealth > 0)
				{
					playing = true;
					combat();
					if(playerHealth <=0 || enemyHealth <=0)
					{
						playing = false;
						System.exit(0);
						if(playerHealth <= 0)
						{
							System.out.println("You have failed, your journey has come to an end.");
						}
						else if(enemyHealth <= 0)
						{
							System.out.println("Congratulations, you have won your fight.");
						}
					}
				}

			}
		}
		
		public static void combat()
		{
			
			int attackDamage = 0;
			int magicAttackDamage = 0;
			int enemyDamage = 0;
				System.out.println("What would you like to do?");
				System.out.println("(1) Regular Attack");
				System.out.println("(2) Magic Attack");
				System.out.println("(3) Run");
				int combatChoice = userInput.nextInt();
				System.out.println();
				if(combatChoice == 1)
				{
					attackDamage = Player.characters.get(player).getDamage() - Predator.enemies.get(enemyDesignator).getEArmor();
					enemyHealth = Predator.enemies.get(enemyDesignator).getEHealth() - attackDamage;
					Predator.enemies.get(enemyDesignator).setEHealth(enemyHealth);
					System.out.println("You hit the " + Predator.enemies.get(enemyDesignator).getEName() + " for " + attackDamage + " damage leaving them with " + enemyHealth + " health.");
					System.out.println();
					turnCounter++;
					if(turnCounter %2 == 0)
					{
						System.out.println(Predator.enemies.get(enemyDesignator).getEName() + " attacks you with their " + Predator.enemies.get(enemyDesignator).getEWeapon());
						enemyDamage = Predator.enemies.get(enemyDesignator).getEDamage() - Player.characters.get(player).getArmor();
						if(enemyDamage <= 0)
						{
							System.out.println("Their attack did no damage.");
							System.out.println();
							combat();
						}
						else
						{
							playerHealth = Player.characters.get(player).getHealth() -enemyDamage;
							System.out.println("They deal " + enemyDamage + " damage leaving you with " + playerHealth + ".");
						}
						
					}
					else
					{
						combat();
					}
				}
				else if(combatChoice == 2)
				{
					magicAttackDamage = Player.characters.get(player).getMagic() - Predator.enemies.get(enemyDesignator).getEResistance();
					enemyHealth = Predator.enemies.get(enemyDesignator).getEHealth() - magicAttackDamage;
					Predator.enemies.get(enemyDesignator).setEHealth(enemyHealth);
					System.out.println("You hit the " + Predator.enemies.get(enemyDesignator).getEName() + " for " + magicAttackDamage + " damage leaving them with " + enemyHealth + " health.");
					turnCounter++;
					if(turnCounter %2 == 0)
					{
						System.out.println(Predator.enemies.get(enemyDesignator).getEName() + " attacks you with their " + Predator.enemies.get(enemyDesignator).getEWeapon());
						enemyDamage = Predator.enemies.get(enemyDesignator).getEDamage() - Player.characters.get(player).getArmor();
						if(enemyDamage <= 0)
						{
							System.out.println("Their attack did no damage.");
							combat();
						}
						else
						{
							playerHealth = Player.characters.get(player).getHealth() -enemyDamage;
							System.out.println("They deal " + enemyDamage + " damage leaving you with " + playerHealth + ".");
						}
						
					}
					else
					{
						combat();
					}
				}
				else if(combatChoice == 3)
				{
					if(Player.characters.get(player).getSpeed() > Predator.enemies.get(enemyDesignator).getESpeed())
					{
						System.out.println("Success, you ran away from your fearsome foe.");
					}
					else if(Player.characters.get(player).getSpeed() < Predator.enemies.get(enemyDesignator).getESpeed())
					{
						turnCounter++;
						System.out.println("You failed to run away and now it is your enemy's turn.");
					}
				}
			
		}
	}
