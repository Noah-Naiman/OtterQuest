package otter;

public class Otter
	{
		private String name;
		private int age;
		private String classChoice;
		private int health;
		private int mana;
		private int armor;
		private int level;
		private int damage;
		private String weapon;
		private int speed;
		private int magic;
		private int resistance;
		
		public Otter(String n, int a, String c, int h, int m, int am, int l, int d, String w, int s, int md, int r)
		{
			name = n;
			age = a;
			classChoice = c;
			health = h;
			mana = m;
			armor = am;
			level = l;
			damage = d;
			weapon = w;
			speed = s;
			magic =md;
			resistance = r;
		}
		public String getName()
		{
			return name;
		}
		public void setName(String n)
		{
			this.name = n;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge(int a)
		{
			this.age = a;
		}
		public String getClassChoice()
		{
			return classChoice;
		}
		public void setClass(String c)
		{
			this.classChoice = c;
		}
		public int getHealth()
		{
			return health;
		}
		public void setHealth(int h)
		{
			this.health = h;
		}
		public int getMana()
		{
			return mana;
		}
		public void setMana(int m)
		{
			this.mana = m;
		}
		public int getArmor()
		{
			return armor;
		}
		public void setArmor(int am)
		{
			this.armor = am;
		}
		public int getLevel()
		{
			return level;
		}
		public void setLevel(int l)
		{
			this.level = l;
		}
		public int getDamage()
		{
			return damage;
		}
		public void setDamage(int d)
		{
			this.damage = d;
		}
		public String getWeapon()
		{
			return weapon;
		}
		public void setWeapon(String w)
		{
			this.weapon = w;
		}
		public int getSpeed()
		{
			return speed;
		}
		public void setSpeed(int s)
		{
			this.speed = s;
		}
		public int getMagic()
		{
			return magic;
		}
		public void setMagic(int md)
		{
			this.magic = md;
		}
		public int getResistance()
		{
			return resistance;
		}
		public void setResistance(int r)
		{
			this.resistance = r;
		}

	}
