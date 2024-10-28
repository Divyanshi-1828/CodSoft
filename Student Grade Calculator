import java.util.Scanner;
public class StudentGradeCalculator{
  static int totalMarks(int maths,int english,int hindi,int computer){
    int sum=maths+english+hindi+computer;
    return sum;
  }
    

 static double averagePercentage(int totalMarks){
  double averagePercent=(totalMarks/400.0)*100;
   return averagePercent;
 }
   

static String grade(double averagePercent){
  if (averagePercent >= 87.5) {
      return "Grade A";
    } else if (averagePercent >= 75) {
      return "Grade B";
    } else if (averagePercent >= 62.5) {
      return "Grade C";
    } else {
      return "Grade D";
    }
  }
 
  static void display(int totalMarks, double averagePercent, String grade){
    System.out.println("Your total marks is - "+totalMarks);
    System.out.println("Your average percentage  is - "+averagePercent);
    System.out.println("Your grade is - "+grade);
  }

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   // Getting user input for each subject
    System.out.print("Enter marks for Maths: ");
    int maths = sc.nextInt();
    System.out.print("Enter marks for English: ");
    int english = sc.nextInt();
    System.out.print("Enter marks for Hindi: ");
    int hindi = sc.nextInt();
    System.out.print("Enter marks for Computer: ");
    int computer = sc.nextInt();

    // Calculate total marks, average percentage, and grade
    int total = totalMarks(maths, english, hindi, computer);
    double averagePercent = averagePercentage(total);
    String grade = grade(averagePercent);
    // Display the results
    display(total, averagePercent, grade);

    sc.close();
  }
}
  
      
