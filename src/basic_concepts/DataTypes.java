package basic_concepts;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non-primitive
		String Name;
		
		//primitive
		char Grade;
		byte sub1; byte sub2; byte sub3;
		int marks;
		int RollNum;
		long PermanentNum;
		int sum=0;
		
		// Boolean
		boolean result;
		
		//floating point
		 float avg;
		 double rank;
		 
		 //variable initialization
		 
		 Name = "Rohit Kamabale";
		 Grade = 'A';
		 sub1= 70;
		 sub2= 90;
		 sub3=85;
		 RollNum=10;
		 rank=2.59657;
		 result=true;
		 
		 //simple operations
		  marks=sub1+sub2+sub3;
		  avg=marks/3f;
		  PermanentNum=123456789;
		  
		  //variable usages
		  
		  System.out.println("RollNum"  +RollNum);
		  System.out.println("Name"   +Name);
		  System.out.println("PRN N"    +PermanentNum);
		  System.out.println("subject 1 marks"  +sub1);
		  System.out.println("subject 2 marks"   +sub2);
		  System.out.println("subject 3 marks"    +sub3);
		  System.out.println("total marks"     +marks);
		  System.out.println("percentage"   +avg);
		  System.out.println("rank"   +rank);
		  System.out.println("pass"   +result);
		  System.out.println("Grade"    +Grade);
		  
		  
		  
		 

	}

}
