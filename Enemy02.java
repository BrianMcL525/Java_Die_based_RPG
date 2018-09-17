public class Enemy02
{
    private String enemyName;
    private int enemyHp;
    private int enemyMp;
    private int enemyAtk;
    private int enemyXp;

    int playerRoll;

    public Enemy02()
    {

	    Die roll = new Die();
		playerRoll = roll.getValue();

		if(playerRoll.equals(1))
		{

		    /* ------------------- Acessor methods -------------------------- */
		    public String getEnemyName()
		    {
		        return enemyName;
		    }

		    public int getEnemyHp() {
		        return enemyHp;
		    }
		    
		    public int getEnemyMp() {
		        return enemyMp;
		    }

		    public int getEnemyAtk() {
		        return enemyAtk;
		    }

		    public int getEnemyXp() {
		        return enemyXp;
		    }

		    /* ------------------- Mutator methods -------------------------- */
		    public void setEnemyName() 
		    {
		        enemyName = "Spider";
		    }
		    
		    public void setEnemyHp() 
		    {  
		        int health = (int) (Math.random() * (100 - 50) + 25);
		        enemyHp = health;
		    }

		    public void setEnemyMp() 
		    {
		        int magic = (int) (Math.random() * (100 - 50) + 50);
		        enemyMp = magic;
		    }

		    public void setEnemyAtk() 
		    {
		        int attack = (int) (Math.random() * (20 - 5) + 5);
		        enemyAtk = attack;
		    }

		    public void setEnemyXp(int exp) 
		    {   
		        enemyXp += exp;
		    }

		    /* ------------------- Constructor -------------------------- */

		    public Enemy02()
		    {
		        setEnemyName();
		        setEnemyHp();
		        setEnemyMp();
		        setEnemyAtk();
		        setEnemyXp(0);
		    }
		}
		else if(playerRoll.equals(2))
		{
		    /* ------------------- Acessor methods -------------------------- */
		    public String getEnemyName()
		    {
		        return enemyName;
		    }

		    public int getEnemyHp() {
		        return enemyHp;
		    }
		    
		    public int getEnemyMp() {
		        return enemyMp;
		    }

		    public int getEnemyAtk() {
		        return enemyAtk;
		    }

		    public int getEnemyXp() {
		        return enemyXp;
		    }

		    /* ------------------- Mutator methods -------------------------- */
		    public void setEnemyName() 
		    {
		        enemyName = "Rat";
		    }
		    
		    public void setEnemyHp() 
		    {  
		        int health = (int) (Math.random() * (100 - 50) + 25);
		        enemyHp = health;
		    }

		    public void setEnemyMp() 
		    {
		        int magic = (int) (Math.random() * (100 - 50) + 50);
		        enemyMp = magic;
		    }

		    public void setEnemyAtk() 
		    {
		        int attack = (int) (Math.random() * (20 - 5) + 5);
		        enemyAtk = attack;
		    }

		    public void setEnemyXp(int exp) 
		    {   
		        enemyXp += exp;
		    }

		    /* ------------------- Constructor -------------------------- */

		    public Enemy02()
		    {
		        setEnemyName();
		        setEnemyHp();
		        setEnemyMp();
		        setEnemyAtk();
		        setEnemyXp(0);
		    }
		}
		else if(playerRoll.equals(3))
		{
		    /* ------------------- Acessor methods -------------------------- */
		    public String getEnemyName()
		    {
		        return enemyName;
		    }

		    public int getEnemyHp() {
		        return enemyHp;
		    }
		    
		    public int getEnemyMp() {
		        return enemyMp;
		    }

		    public int getEnemyAtk() {
		        return enemyAtk;
		    }

		    public int getEnemyXp() {
		        return enemyXp;
		    }

		    /* ------------------- Mutator methods -------------------------- */
		    public void setEnemyName() 
		    {
		        enemyName = "Slime";
		    }
		    
		    public void setEnemyHp() 
		    {  
		        int health = (int) (Math.random() * (100 - 50) + 25);
		        enemyHp = health;
		    }

		    public void setEnemyMp() 
		    {
		        int magic = (int) (Math.random() * (100 - 50) + 50);
		        enemyMp = magic;
		    }

		    public void setEnemyAtk() 
		    {
		        int attack = (int) (Math.random() * (20 - 5) + 5);
		        enemyAtk = attack;
		    }

		    public void setEnemyXp(int exp) 
		    {   
		        enemyXp += exp;
		    }

		    /* ------------------- Constructor -------------------------- */

		    public Enemy02()
		    {
		        setEnemyName();
		        setEnemyHp();
		        setEnemyMp();
		        setEnemyAtk();
		        setEnemyXp(0);
		    }
		}
		else if(playerRoll.equals(4))
		{
		    /* ------------------- Acessor methods -------------------------- */
		    public String getEnemyName()
		    {
		        return enemyName;
		    }

		    public int getEnemyHp() {
		        return enemyHp;
		    }
		    
		    public int getEnemyMp() {
		        return enemyMp;
		    }

		    public int getEnemyAtk() {
		        return enemyAtk;
		    }

		    public int getEnemyXp() {
		        return enemyXp;
		    }

		    /* ------------------- Mutator methods -------------------------- */
		    public void setEnemyName() 
		    {
		        enemyName = "Goblin";
		    }
		    
		    public void setEnemyHp() 
		    {  
		        int health = (int) (Math.random() * (100 - 50) + 25);
		        enemyHp = health;
		    }

		    public void setEnemyMp() 
		    {
		        int magic = (int) (Math.random() * (100 - 50) + 50);
		        enemyMp = magic;
		    }

		    public void setEnemyAtk() 
		    {
		        int attack = (int) (Math.random() * (20 - 5) + 5);
		        enemyAtk = attack;
		    }

		    public void setEnemyXp(int exp) 
		    {   
		        enemyXp += exp;
		    }

		    /* ------------------- Constructor -------------------------- */

		    public Enemy02()
		    {
		        setEnemyName();
		        setEnemyHp();
		        setEnemyMp();
		        setEnemyAtk();
		        setEnemyXp(0);
		    }
		}
		else if(playerRoll.equals(5))
		{
		    /* ------------------- Acessor methods -------------------------- */
		    public String getEnemyName()
		    {
		        return enemyName;
		    }

		    public int getEnemyHp() {
		        return enemyHp;
		    }
		    
		    public int getEnemyMp() {
		        return enemyMp;
		    }

		    public int getEnemyAtk() {
		        return enemyAtk;
		    }

		    public int getEnemyXp() {
		        return enemyXp;
		    }

		    /* ------------------- Mutator methods -------------------------- */
		    public void setEnemyName() 
		    {
		        enemyName = "Savage";
		    }
		    
		    public void setEnemyHp() 
		    {  
		        int health = (int) (Math.random() * (100 - 50) + 25);
		        enemyHp = health;
		    }

		    public void setEnemyMp() 
		    {
		        int magic = (int) (Math.random() * (100 - 50) + 50);
		        enemyMp = magic;
		    }

		    public void setEnemyAtk() 
		    {
		        int attack = (int) (Math.random() * (20 - 5) + 5);
		        enemyAtk = attack;
		    }

		    public void setEnemyXp(int exp) 
		    {   
		        enemyXp += exp;
		    }

		    /* ------------------- Constructor -------------------------- */

		    public Enemy02()
		    {
		        setEnemyName();
		        setEnemyHp();
		        setEnemyMp();
		        setEnemyAtk();
		        setEnemyXp(0);
		    }
		}
		else if(playerRoll.equals(6))
		{
		    /* ------------------- Acessor methods -------------------------- */
		    public String getEnemyName()
		    {
		        return enemyName;
		    }

		    public int getEnemyHp() {
		        return enemyHp;
		    }
		    
		    public int getEnemyMp() {
		        return enemyMp;
		    }

		    public int getEnemyAtk() {
		        return enemyAtk;
		    }

		    public int getEnemyXp() {
		        return enemyXp;
		    }

		    /* ------------------- Mutator methods -------------------------- */
		    public void setEnemyName() 
		    {
		        enemyName = "Troll";
		    }
		    
		    public void setEnemyHp() 
		    {  
		        int health = (int) (Math.random() * (100 - 50) + 25);
		        enemyHp = health;
		    }

		    public void setEnemyMp() 
		    {
		        int magic = (int) (Math.random() * (100 - 50) + 50);
		        enemyMp = magic;
		    }

		    public void setEnemyAtk() 
		    {
		        int attack = (int) (Math.random() * (20 - 5) + 5);
		        enemyAtk = attack;
		    }

		    public void setEnemyXp(int exp) 
		    {   
		        enemyXp += exp;
		    }

		    /* ------------------- Constructor -------------------------- */

		    public Enemy02()
		    {
		        setEnemyName();
		        setEnemyHp();
		        setEnemyMp();
		        setEnemyAtk();
		        setEnemyXp(0);
		    }
		}
	}
}