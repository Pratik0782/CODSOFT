import java.util.Scanner;

public class StudentGradeCal
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects");
        int totalsubject=sc.nextInt();

        System.out.println("Enter marks obtained in subjects "+totalsubject);
        int totalmarks=0;
        for(int i=0;i<totalsubject;i++)
        {
            int marks=sc.nextInt();
            totalmarks=totalmarks+marks;
        }

        double avgper=(double)totalmarks/totalsubject;
        System.out.println(avgper);
        char grade;
        if(avgper>=90)
        {
            grade='A';

        }
        else if(avgper>=80)
        {
          grade='B';
        }
          else if(avgper>=70)
        {
          grade='C';
        }
          else if(avgper>=60)
        {
          grade='D';
        }
          else if(avgper>=40)
        {
          grade='E';
        }
        else{
            grade='F';
        }

        System.out.println("==========================");;
        System.out.println("Student Result is ");
        System.out.println("Total Marks"+totalmarks);
        System.out.println("Averager Percentage"+avgper);
        System.out.println("Grade "+grade);
    }
}