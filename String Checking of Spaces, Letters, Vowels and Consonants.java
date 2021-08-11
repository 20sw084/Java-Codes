public class Java {
public static void main(String Args[]) {
	int vowels=0;
	int letters=0;
	int spaces=0;
	String name="Junaid Aslam";
	for(int i=0;i<name.length();i++)
	{
		char ch=Character.toLowerCase(name.charAt(i));
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			vowels++;
		}
		if(Character.isLetter(ch)) {
			letters++;
		}
		if(Character.isWhitespace(ch)) {
			spaces++;
		}
	}
	System.out.println("Letters is "+letters+" Vowels is "+vowels+" "+" Consonants is "+(letters-vowels)+" Spaces is "+spaces);
}
}
