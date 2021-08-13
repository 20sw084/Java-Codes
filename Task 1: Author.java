//Author.java

public class Author{
    private String name;
    private String email;
    private char gender;
    Author(String name,String email,char gender) {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "\"Author[name=" + getName() +", email=" + getEmail()+", gender="+ getGender()+" ]\"";
    }
}

//Main.java

public class Main
{
	public static void main(String[] args) {
	    Author Junaid=new Author("Junaid Aslam","Junaidaslam.muet@gmail.com",'M');
	    System.out.println(Junaid.toString());
	}
}
