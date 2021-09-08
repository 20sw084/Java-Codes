public class Dog {
    String name;
    String breed;
    int age;
    public Dog(){
        name="";
        age=0;
        breed="";
    }
    public void setDetails(String name,String breed,int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public void showDetails(){
        if(age!=0 && name!="" && breed!=""){
            System.out.println("\nDog Name is "+name+" Dog Breed is "+breed+" Dog age is "+age+" years.");
        }
        else{
            System.out.println("Details are Un-Available.");
        }
    }
    public static void main(String args[]) {
        Dog D=new Dog();
        D.setDetails("Shephard", "Red", 6);
        D.showDetails();
    }
}