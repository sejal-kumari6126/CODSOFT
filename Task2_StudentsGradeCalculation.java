package CodeSoft;
import java.util.*;
public class Task2_StudentsGradeCalculation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of subjects: ");
		int subject=in.nextInt();
		int totalMarks=0; int i; 
		double Avg_percentage=0.0;
		
		
		int marks[]=new int[subject];
		for( i=0;i<subject;i++)
		{
			System.out.println("Enter marks obtained in subject "+ (i+1) +" : ");
			marks[i]=in.nextInt();
			totalMarks+=marks[i];
		}
		  Avg_percentage = totalMarks/subject;
		System.out.println("Total marks obtained: "+totalMarks);
		System.out.println("Average percentage obtained: "+Avg_percentage);
		if(Avg_percentage>=90&&Avg_percentage<=100)
		{
		System.out.println("Grade = A+");
		}
		else if(Avg_percentage>=80&&Avg_percentage<90)
		{
		System.out.println("Grade = A");
		}
		else if(Avg_percentage>=70&&Avg_percentage<80)
		{
		System.out.println("Grade = B");
		}
		else if(Avg_percentage>=60&&Avg_percentage<70)
		{
		System.out.println("Grade = C");
		}
		else if(Avg_percentage>=50&&Avg_percentage<60)
		{
		System.out.println("Grade = D");
		}
		else if(Avg_percentage>=40&&Avg_percentage<50)
		{
		System.out.println("Grade = E");
		}
		else
		{
		System.out.println("Grade = F");
		}
	}
}

