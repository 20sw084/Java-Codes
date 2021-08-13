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

//Book.java

public class Book{
    private String name;
    private Author[] A1=new Author[2];
    private double price;
    private int qty;
    public Book(String name, Author[] author, double price) {
        this.name=name;
        A1=author;
        this.price=price;
    }
    public Book (String name, Author[] author, double price, int qty)
    { 
        this(name,author,price);
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return A1;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public String toString(){
        return "\"Book[name="+getName()+A1.toString()+" ]\", Price="+ getPrice()+", qty="+ getQty()+" ]\"";
    } 
}

//Main.java


public class Main
{
	public static void main(String[] args) {
	    Author Junaid=new Author("Junaid Aslam","junaidaslam.muet@gmail.com",'M');
	    Book OOP=new Book("OOP",Junaid[2],425.67,2);
	    System.out.println(OOP.toString());
	}
}
