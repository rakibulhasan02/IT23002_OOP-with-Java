import java.util.Scanner;

public class CGPACalCulator1{
    public static double calculateGradePoint(int totalMarks){
        if(totalMarks>=80) return 4.0;
        else if(totalMarks>=75) return 3.75;
        else if(totalMarks>=70) return 3.5;
        else if(totalMarks>=65) return 3.25;
        else if(totalMarks>=60) return 3.0;
        else if(totalMarks>=55) return 2.75;
        else if(totalMarks>=50) return 2.5;
        else if (totalMarks >= 45) return 2.25;
        else if (totalMarks >= 40) return 2.0;
        else return 0.0;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        String studentID=input.nextLine();
        
        System.out.print("Enter number of course : ");
        int numCourses=input.nextInt();
        double totalWeightedGP=0.0,totalCredits=0.0;
        for(int i=1;i<=numCourses;i++){
            System.out.println("Course "+i+":");
            System.out.print(" Enter Credit (Max 3): ");
            int credit=input.nextInt();
            System.out.print("  Enter CT (Max 30): ");
            int ct = input.nextInt();
            System.out.print("  Enter AT (Max 10): ");
            int at = input.nextInt();
            System.out.print("  Enter FE (Max 60): ");
            int fe = input.nextInt();
            int totalMarks=ct+at+fe;
            double gradePoint=calculateGradePoint(totalMarks);

            System.out.println(" Total Marks: "+totalMarks);
            totalWeightedGP+=gradePoint*credit;
            totalCredits+=credit;
        }
        double cgpa=totalWeightedGP/totalCredits;
        System.out.println("\nStudent ID : "+studentID);
        System.out.printf("CGPA : %.2f%n",cgpa);

 String grade;
        if (cgpa == 4.0) grade = "A+";
        else if (cgpa >= 3.75) grade = "A";
        else if (cgpa >= 3.5) grade = "A-";
        else if (cgpa >= 3.25) grade = "B+";
        else if (cgpa >= 3.0) grade = "B";
        else if (cgpa >= 2.75) grade = "B-";
        else if (cgpa >= 2.5) grade = "C+";
        else if (cgpa >= 2.25) grade = "C";
        else if (cgpa >= 2.0) grade = "D";
        else grade = "F";

        System.out.println("Grade: " + grade);
        input.close();

    }
}
