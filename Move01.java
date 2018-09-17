import java.util.Scanner;

public class Move01 
{
	int playerRoll;
	private String userMove;
	int encounterRoll;
	Scanner kbd = new Scanner(System.in);
	boolean move = true;
	boolean stop = true;
	boolean encounter;

	public Move01()
	{
		while(stop)
		{		
			while(move)
			{
				System.out.print("Move where? or type STOP to end >> ");
				userMove = kbd.nextLine();
				
				if(userMove.equalsIgnoreCase("forward"))
				{
					System.out.println("");
					System.out.println("you move forward through /door/ and enter the next room...");
					Die roll = new Die();
					playerRoll = roll.getValue();
					Die roll2 = new Die();
					encounterRoll = roll2.getValue();
					if( playerRoll == encounterRoll) 
					{
						System.out.println("");
						System.out.println("encounter begin");
						encounter = true;
						move = false;
						stop = false;
					} 
					else
					{
						System.out.println("");
						System.out.println("The room is empty");
					}
				} 
				else if(userMove.equalsIgnoreCase("left"))
				{
					System.out.println("");
					System.out.println("you move left through /door/ and enter the next room...");
					Die roll = new Die();
					playerRoll = roll.getValue();
					Die roll2 = new Die();
					encounterRoll = roll2.getValue();
					if( playerRoll == encounterRoll) 
					{
						System.out.println("");
						System.out.println("encounter begin");
						encounter = true;
						move = false;
						stop = false;

					}
					else
					{
						System.out.println("");
						System.out.println("The room is empty");
					}
				} 
				else if(userMove.equalsIgnoreCase("right"))
				{
					System.out.println("");
					System.out.println("you move right through /door/ and enter the next room...");
					Die roll = new Die();
					playerRoll = roll.getValue();
					Die roll2 = new Die();
					encounterRoll = roll2.getValue();
					if( playerRoll == encounterRoll) 
					{
						System.out.println("");
						System.out.println("encounter begin");
						encounter = true;
						move = false;
						stop = false;
					}
					else
					{
						System.out.println("");
						System.out.println("The room is empty");
					}
				}
				else if(userMove.equals("stop"))
				{
					move = false;
					stop = false;
				} 
			}
		}
	}
	public String getMove()
	{
		return userMove;
	}
}