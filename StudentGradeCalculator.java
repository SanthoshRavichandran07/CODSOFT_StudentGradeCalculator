import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);      
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();       
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextInt();
                if (marks[i] <= 100 && marks[i] >= 0) {
                    break;
                } else {
                    System.out.println("Warning: Marks should be between 0 and 100. Please enter again.");
                }
            }
        }     
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }        
        double averagePercentage = totalMarks / 5.0;    
        boolean isPassed = true;
        for (int mark : marks) {
            if (mark < 35) {
                isPassed = false;
                break;
            }
        }       
        String grade;
        if (!isPassed) {
            grade = "RA";
        } else if (averagePercentage >= 90) {
            grade = "A+";
        } else if (averagePercentage >= 75) {
            grade = "A";
        } else if (averagePercentage >= 60) {
            grade = "B";
        } else if (averagePercentage >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
    
        System.out.println("\n--- Student Results ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Status: " + (isPassed ? "Pass" : "Fail"));
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
