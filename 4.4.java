public class Class2{
	enum Days{
		st,nd,rd,th
	}
	enum Months{
		January, Februry , March ,April ,May, June, July , August , September , October, November, December
	}
	public static void main(String args[]) {
		Months M1=null;
		Days D1 = null;
		int year=0;
		String yearstr=null;
		String[] strArray= {"2/2/01","5/13/67","2/12/31","6/11/20","7/22/30","3/31/91","8/25/99","2/26/92","9/30/84","12/17/01"};
	//System.out.println(strArray.length);
	for(int i=0;i<strArray.length;i++) {
		String[] individual=strArray[i].split("/");
		for(int j=0;j<individual.length;j++) {
			if(j==0) {
				switch(Integer.parseInt(individual[j])) {
				case 0:  {M1=Months.January;break;}
				case 1:  {M1=Months.Februry;break;}
				case 2:  {M1=Months.March;break;}
				case 3:  {M1=Months.April;break;}
				case 4:  {M1=Months.May;break;}
				case 5:  {M1=Months.June;break;}
				case 6:  {M1=Months.July;break;}
				case 7:  {M1=Months.August;break;}
				case 8:  {M1=Months.September;break;}
				case 9:  {M1=Months.October;break;}
				case 10: {M1=Months.November;break;}
				case 11: {M1=Months.December;break;}
				}
				}
			
				if(j==1) {
				switch(Integer.parseInt(individual[j])) {
				case 1:  {D1=Days.st;break;}
				case 2:  {D1=Days.nd;break;}
				case 3:  {D1=Days.rd;break;}
				case 4:  {D1=Days.th;break;}
				case 5:  {D1=Days.th;break;}
				case 6:  {D1=Days.th;break;}
				case 7:  {D1=Days.th;break;}
				case 8:  {D1=Days.th;break;}
				case 9:  {D1=Days.th;break;}
				case 10:  {D1=Days.th;break;}
				case 11: {D1=Days.th;break;}
				case 12: { D1=Days.th;break;}
				case 13: { D1=Days.th;break;}
				case 14: { D1=Days.th;break;}
				case 15: { D1=Days.th;break;}
				case 16: { D1=Days.th;break;}
				case 17: { D1=Days.th;break;}
				case 18: { D1=Days.th;break;}
				case 19:  {D1=Days.th;break;}
				case 20:  {D1=Days.th;break;}
				case 21:  {D1=Days.st;break;}
				case 22:  {D1=Days.nd;break;}
				case 23: { D1=Days.rd;break;}
				case 24:  {D1=Days.th;break;}
				case 25: { D1=Days.th;break;}
				case 26:  {D1=Days.th;break;}
				case 27:  {D1=Days.th;break;}
				case 28:  {D1=Days.th;break;}
				case 29: { D1=Days.th;break;}
				case 30: { D1=Days.th;break;}
				case 31: { D1=Days.st;break;}
					}
				}
			
			if(j==2) {
					year=Integer.parseInt(individual[j]);
					if(year<21&&year>=0) {
						if(year>=0&&year<10)
						yearstr="200";
						else
						yearstr="20";
					}
					else
						yearstr="19";
					System.out.println(individual[1]+D1+" "+M1+" "+yearstr+year);
			}	
	}
	}
}
}
