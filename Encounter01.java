import java.util.Scanner;

public class Encounter01
{
	boolean encounter = true;
	int encounterRoll;

	public Encounter01(String name, int playerAtk, int playerHp)
	{
		while(encounter)
		{

			Die roll = new Die();
				encounterRoll = roll.getValue();
			if (encounterRoll == 1 || encounterRoll == 2)
			{
				System.out.println("");
				System.out.println(" XXXXXXXXX  XXX  XXXXXXXXXX  XXX   XXX  XXXXXXXXXX  ");
		        System.out.println(" XXXXXXXXX  XXX  XXXXXXXXXX  XXX   XXX  XXXXXXXXXX  ");
		        System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		        System.out.println(" XXX        XXX  XXX         XXX   XXX     XXXX     ");
		        System.out.println(" XXXXXXX    XXX  XXX  XXXX   XXXXXXXXX     XXXX     ");
		        System.out.println(" XXXXXXX    XXX  XXX  XXXXX  XXXXXXXXX     XXXX     ");
		        System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		        System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		        System.out.println(" XXX        XXX  XXX    XXX  XXX   XXX     XXXX     ");
		        System.out.println(" XXX        XXX  XXXXXXXXXX  XXX   XXX     XXXX     ");
		        System.out.println(" XXX        XXX  XXXXXXXXXX  XXX   XXX     XXXX     ");
			    System.out.println("");
		    	            
		    	Fight01 action = new Fight01(name, playerAtk, playerHp);
		    	encounter = false;
		    }
		    else if (encounterRoll == 3 || encounterRoll == 4)
		    {
		    	System.out.println("");
				System.out.println(" XXXXXXXXX  XXXXXXXXX     XXXX     XXXXXXXXX");
		        System.out.println(" XXXXXXXXX  XXXXXXXXX    XXXXXX    XXXXXXXXX");
		        System.out.println("    XXX     XXX   XXX   XXX  XXX   XXX   XXX");
		        System.out.println("    XXX     XXX   XXX   XXX   XXX  XXX   XXX");
		        System.out.println("    XXX     XXXXXXXXX   XXXXXXXXX  XXXXXXXXX");
		        System.out.println("    XXX     XXXXXXXXX   XXXXXXXXX  XXXXXXXXX");
		        System.out.println("    XXX     XXX  XXX    XXX   XXX  XXX      ");
		        System.out.println("    XXX     XXX   XXX   XXX   XXX  XXX      ");
		        System.out.println("    XXX     XXX   XXX   XXX   XXX  XXX      ");
		        System.out.println("    XXX     XXX   XXX   XXX   XXX  XXX      ");
		        System.out.println("    XXX     XXX   XXX   XXX   XXX  XXX      ");
			    System.out.println("");

			    //Trap action = new trap(name, playerHp);
		    	encounter = false;		    	
		    }
		    else
		    {
		    	System.out.println("");
				System.out.println(" XXXXXXXXX  XXXXXXXXX   XXXXXXXXX     XXXX      XXXXXXX    XXX   XXX   XXXXXXXXX   XXXXXXXXX  ");
		        System.out.println(" XXXXXXXXX  XXXXXXXXX   XXXXXXXXX    XXXXXX    XXXXXXXXX   XXX   XXX   XXXXXXXXX   XXXXXXXXX  ");
		        System.out.println("    XXX     XXX   XXX   XXX         XXX  XXX   XXX   XXX   XXX   XXX   XXX   XXX   XXX	      ");
		        System.out.println("    XXX     XXX   XXX   XXX         XXX   XXX  XXX    XX   XXX   XXX   XXX   XXX   XXX		  ");
		        System.out.println("    XXX     XXXXXXXXX   XXXXXXX     XXXXXXXXX  XXXX        XXX   XXX   XXXXXXXXX   XXXXXXX	  ");
		        System.out.println("    XXX     XXXXXXXXX   XXXXXXX     XXXXXXXXX    XXXXX     XXX   XXX   XXXXXXXXX   XXXXXXX	  ");
		        System.out.println("    XXX     XXX  XXX    XXX         XXX   XXX      XXXXX   XXX   XXX   XXX  XXX    XXX		  ");
		        System.out.println("    XXX     XXX   XXX   XXX         XXX   XXX  XX    XXX   XXX   XXX   XXX   XXX   XXX		  ");
		        System.out.println("    XXX     XXX   XXX   XXX         XXX   XXX  XXX    XXX  XXX   XXX   XXX   XXX   XXX		  ");
		        System.out.println("    XXX     XXX   XXX   XXXXXXXXX   XXX   XXX  XXXXXXXXXX  XXXXXXXX    XXX   XXX   XXXXXXXXX  ");
		        System.out.println("    XXX     XXX   XXX   XXXXXXXXX   XXX   XXX   XXXXXXXX    XXXXXX     XXX   XXX   XXXXXXXXX  ");
			    System.out.println("");

			    //Treasure action = new treasure(name, playerHp);
		    	encounter = false;
		    }
		}
	}

}