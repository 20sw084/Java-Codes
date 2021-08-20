//Players.java

public class Players{
    private int numberOfPlayers;
    private Player[] arr;
    public Players(int numberOfPlayers,Player[] arr)  {
        this.numberOfPlayers=numberOfPlayers;
        this.arr=arr;
    }
    public void setNumberOfPlayers(int numberOfPlayers){
        this.numberOfPlayers=numberOfPlayers;
    }
    public void setarr(Player[] arr){
        this.arr=arr;
    }
    public int getNumberOfPlayers(){
        return numberOfPlayers;
    }
    public Player[] getarr(){
        return arr;
    }
    public void printPlayerName(){
        for(Player p:arr)
        System.out.println(p.getName());
    }
    public void printPlayerAge(){
        for(Player p:arr)
        System.out.println(p.getAge());
    }
    public void printPlayerRole(){
        for(Player p:arr)
        System.out.println(p.getRole());
    }
    public void printPlayerPlayerOf(){
        for(Player p:arr)
        System.out.println(p.getPlayerOf());
    }
    
}

//Players.java

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


//Main.java

public class Main
{
	public static void main(String[] args) {
	    Player Amir=new Player("Muhammad Amir",27,"Bowler","Cricket");
	    Player Shadab=new Player("Shadab Khan",28,"Alrounder","Cricket");
	    Player Babar=new Player("Babar Azam",25,"Batsman","Cricket");
	    Player[] arr=new Player[3];
	    arr[0]=Babar;
	    arr[1]=Shadab;
	    arr[2]=Amir;
	    Players Cricket=new Players(3,arr);
	    Cricket.setNumberOfPlayers(3);
	    Cricket.setarr(arr);
		System.out.println("Number of Players is : "+Cricket.getNumberOfPlayers());
		System.out.println("Players Names are ");
		Cricket.printPlayerName();
		System.out.println("Players Ages are ");
		Cricket.printPlayerAge();
		System.out.println("Players Role are ");
		Cricket.printPlayerRole();
		System.out.println("Players Player of are ");
		Cricket.printPlayerPlayerOf();
	}
}
