package otter;

public class Character
	{
		private String name;
		private int age;
		private String classChoice;
		private int health;
		private int mana;
		private int armor;
		private int level;
		private int hunger;
		private String inventory;
		private int damage;
		private String weapon;
		public int speed;
		
		public Character(String n, int a, String c, int h, int m, int am, int l, int hg, String i, int d, String w, int s)
		{
			name = n;
			age = a;
			classChoice = c;
			health = h;
			mana = m;
			armor = am;
			level = l;
			hunger = hg;
			inventory = i;
			damage = d;
			weapon = w;
			speed = s;
		}
		public String getName()
		{
			return name;
		}
		public void setName()
		{
			this.name = name;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge()
		{
			this.age = age;
		}
		public String classChoice()
		{
			return classChoice;
		}
		public void setClass()
		{
			this.classChoice = classChoice;
		}
		public int getHealth()
		{
			return health;
		}
		public void setHealth()
		{
			this.health = health;
		}
		public int getMana()
		{
			return mana;
		}
		public void setMana()
		{
			this.mana = mana;
		}
		public int getArmor()
		{
			return armor;
		}
		public void setArmor()
		{
			this.armor = armor;
		}
		public int getLevel()
		{
			return level;
		}
		public void setLevel()
		{
			this.level = level;
		}
		public int getHunger()
		{
			return hunger;
		}
		public void setHunger()
		{
			this.hunger = hunger;
		}
		public String getInventory()
		{
			return inventory;
		}
		public void setInventory()
		{
			this.inventory = inventory;
		}
		public int getDamage()
		{
			return damage;
		}
		public void setDamage()
		{
			this.damage = damage;
		}
		public String getWeapon()
		{
			return weapon;
		}
		public void setWeapon()
		{
			this.weapon = weapon;
		}
		public int getSpeed()
		{
			return speed;
		}
		public void setSpeed()
		{
			this.speed = speed;
		}

	}
