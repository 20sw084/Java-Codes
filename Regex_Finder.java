import java.util.regex.*;  
class Regex{  
public static void main(String args[]){  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "jonny"));//true  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JunaidAslam084"));//false (more than 6 char)  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Rajput92"));//true  
System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "junaid_aslam_rajput"));//false ($ is not matched)  
}}  
