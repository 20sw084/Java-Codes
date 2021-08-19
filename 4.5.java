package example;
public class Class2{
	    public static void main(String[] argus)
	    {	       
	        String text = "To be or not to be.";
	        String reversetext="" ;
	        char ch = ' ';
	        int substr = 0;
	        int i=0, j=0, index=0;
	        System.out.println("Text before reversing    :    " + text);
	          for(i=0; i<text.length(); )
	        {
	        	  index = text.indexOf(ch,substr);
	            for(j=index-1; j>=substr; j--)
	            {
	                reversetext += text.charAt(j);                 
	            }
	            if(index != -1)
	            {   
	                substr = index+1;
	                i= substr;
	                reversetext += " ";
	            }
	            else
	                break;            
	        }
	        for(int n=text.length()-2; n>=substr; n--)
	            reversetext += text.charAt(n);
	            
	        System.out.println("\nText after reversing    :    "+reversetext +".");
	           
	    }
	}
