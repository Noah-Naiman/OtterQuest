package otter;
import java.util.ArrayList;
public class Predator
	{
		static ArrayList<Enemy> enemies = new ArrayList<Enemy>();
		
		public static void fillEnemies()
		{
			enemies.add(new Enemy("Bald Eagle", 30, 5, 5, 1, 5, "Talon Spear", 15));
			enemies.add(new Enemy("Wolf", 35, 5, 7, 1, 8, "Canine Cutter", 10));
			enemies.add(new Enemy("Brown Bear", 40, 2, 10, 1, 15, "Paw Punisher", 7));
			enemies.add(new Enemy("Orca", 45, 5, 7, 1, 20, "Tail Tomohawk", 8));
			enemies.add(new Enemy("Great White Shark", 60, 10, 8, 1, 25, "Sharktooth Saw", 9));
		}
	}
