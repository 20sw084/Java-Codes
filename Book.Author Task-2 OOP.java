//
class Author
{
    public String name;
    public String Email;
    public char gender;
    public Author(){}
    public Author(String name, String Email, char gender)
    {
        this.name=name;
        this.Email=Email;
        this.gender=gender;

    }
    public String getname()
    {
        return name;

    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email=Email;
    }

    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        //System.out.println();
       return "Author[name="+name+", email="+Email+", Gender="+gender;
    }
    
}
class Book {
    private String name_of_book;
    private double price;
    private int qty;
    public Author authors =new Author();
         
    public Book(String name_of_book, Author obj_of_Author, double price)
    {
        this.name_of_book=name_of_book;
        this.price=price;
        this.authors=obj_of_Author;
    }

    public Book(String name_of_book, Author obj_of_Author, double price, int qty)
    {
        this.name_of_book=name_of_book;
        this.price=price;
        this.qty=qty;
        this.authors=obj_of_Author;
    }

    public String getName( )
    {   System.out.print("Name of book is ");
        return name_of_book;
    }

    public double getPrice()
    {
      System.out.print("price of book is ");
        return price;
    }

    public void setprice(double price)
    {
        this.price=price;
    }

    public int getQty()
    {   System.out.print("Books Quantity");
        return qty;
    }

    public void setqty(int qty)
    {
        this.qty=qty;
    }

    public void tostring()
    {
        System.out.println("Book[name="+name_of_book+" , price="+price+" , qty="+qty);
        System.out.println("Author[name="+authors.name+" ,Email="+authors.Email+" , Gender="+authors.gender);
    }

} 
public class Task2 {
   public static void main(String[] args)
   {
    Author author=new Author("Robert", "lafore@gmail.com",'M');
    Book book= new Book("Cpp",author,40.25,50);
    book.tostring();
   }
    
}
