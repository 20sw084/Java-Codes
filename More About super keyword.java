//Player.java

 class Player {
     String name;
    Player(String name){
        this.name=name;
    }
}

//Players.java

class Players extends Player{
     String name;
     
     Players(String name){
          super("Ali");
         this.name=name;
     }
     
     void Display(){
     System.out.println("name in superclass is "+super.name);   
     System.out.println("name in subclass is "+name); 
    }
}

//Main.java

public class Main
{
	public static void main(String[] args) {
	    Players Amir=new Players("Jonny");
	    Amir.Display();
	   
	}
}
