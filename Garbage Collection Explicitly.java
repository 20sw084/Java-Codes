class Main
{
    int x;
	public static void main(String[] args) {
		Main obj=new Main();
		obj.x=84;
		System.out.println(obj.hashCode());
		obj=null;
		//System.gc();
		System.out.println("Main, End of Program.");
	}
	@Override
    protected void finalize(){
        System.out.println("Finalize Method Called.");
    }
}
