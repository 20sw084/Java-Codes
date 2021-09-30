//Person.java

import java.io.*;

public class Person implements Serializable {
	private int age;
	private String name;
	public Person() {
		age=0;
		name=null;
	}
	public Person(int age,String name) {
		this.age=age;
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}

//FileStreams.java

import java.io.*;
public class FileStreams {
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		Person p=new Person(18,"Jonny");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:/Users/hp/Desktop/myFile.txt"));
		oos.writeObject(p);
		oos.close();
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:/Users/hp/Desktop/myFile.txt"));
		try{
		while(true){
		Person p1=(Person) ois.readObject();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		   	   }
		}
		catch(Exception ioe){
		System.err.println("End OF File");
				  }
		ois.close();
	}
}
