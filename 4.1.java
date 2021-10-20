class Main{
	public static void Cout(String a)
	{ 
		System.out.println(a);
	}
	public static void main(String A[]) {
		double average=0.0;
		String[] strArray={"January","Februry","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<12;i++) {
		double random=12*Math.random();
		Cout(strArray[(int) random]+" is at "+random);
		average+=random;
		}
		Cout("Average is "+average);
	}
}
