//Player.java

class Player {
     int i;
}

//Players.java

class Players extends Player{
     int i;
     Players(int a,int b){
         super.i=a;
         i=b;
     }
     void Display(){
     System.out.println("i in superclass is "+super.i);   
     System.out.println("i in subclass is "+i); 
    }
}

//Main.java

public class Main
{
	public static void main(String[] args) {
	    Players Amir=new Players(1,2);
	    Amir.Display();
	}
}
