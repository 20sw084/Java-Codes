//Player.java


public class Player{
    private String name;
    private int age;
    private String Role;
    private String playerOf;
    public Player(){
        name="";
        age=0;
        Role="";
        playerOf="";
    }
    public Player(String name,int age,String Role,String playerOf){
        this.name=name;
        this.age=age;
        this.Role=Role;
        this.playerOf=playerOf;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setRole(String Role){
        this.Role=Role;
    }
    public void setPlayerOf(String playerOf){
        this.playerOf=playerOf;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getRole(){
        return Role;
    }
    public String getPlayerOf(){
        return playerOf;
    }
    
}



//Players.java

public class Players extends Player{
    private int numberOfPlayers;
   public Players()  {
        numberOfPlayers=0;
    }
    public Players(int numberOfPlayers)  {
        this.numberOfPlayers=numberOfPlayers;
    }
    public void setNumberOfPlayers(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }
    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    
    
}

//Main.java

public class Main
{
	public static void main(String[] args) {
	    Players Amir=new Players();
	    Amir.setName("Amir");
	    Amir.setAge(27);
	    Amir.setRole("Bowler");
	    Amir.setPlayerOf("Cricket");
	    Amir.setNumberOfPlayers(11);
	    System.out.println(Amir.getName());
	    System.out.println(Amir.getAge());
	    System.out.println(Amir.getRole());
	    System.out.println(Amir.getPlayerOf());
	    System.out.println(Amir.getNumberOfPlayers());
	}
}
