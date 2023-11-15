package otter;

public class Enemy 
	{
		private String eName;
		private int eHealth;
		private int eMana;
		private int eArmor;
		private int eLevel;
		private int eDamage;
		private String eWeapon;
		private int eSpeed;
		
		public Enemy (String n, int h, int m, int a, int l, int d, String w, int s)
		{
			eName = n;
			eHealth = h;
			eMana = m;
			eArmor = a;
			eLevel  = l;
			eDamage = d;
			eWeapon = w;
			eSpeed = s;
		}
		
		public String getEName()
		{
			return eName;
		}
		public void setEName(String n)
		{
			this.eName = n;
		}
		
		public int getEHealth()
		{
			return eHealth;
		}
		public void setEHealth(int h)
		{
			this.eHealth = h;
		}
		
		public int getEMana()
		{
			return eMana;
		}
		public void setEMana(int m)
		{
			this.eMana = m;
		}
		
		public int getEArmor()
		{
			return eArmor;
		}
		public void setEArmor(int a)
		{
			this.eArmor = a;
		}
		
		public int getELevel()
		{
			return eLevel;
		}
		public void setELevel(int l)
		{
			this.eLevel = l;
		}
		
		public int getEDamage()
		{
			return eLevel;
		}
		public void setEDamage(int d)
		{
			this.eDamage = d;
		}
		
		public String getEWeapon()
		{
			return eWeapon;
		}
		public void setEWeapon(String w)
		{
			this.eWeapon = w;
		}
		
		public int getESpeed()
		{
			return eSpeed;
		}
		public void setESpeed(int s)
		{
			this.eSpeed = s;
		}
		
		
	}
