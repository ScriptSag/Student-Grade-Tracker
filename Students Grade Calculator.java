import java.util.Scanner;
public class StudentsGrades 
{ 
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = s.nextInt();

        double[] grades = new double[numberOfStudents];
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = s.nextDouble();
        }
        double total = 0;
        double highest = grades[0];
        double lowest = grades[0];

        for (int i = 0; i < numberOfStudents; i++) {
            total += grades[i];
            if (grades[i] > highest) {
                highest = grades[i];
            }
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        double average = total / numberOfStudents;
        System.out.printf("Average grade: %.2f%n", average);
        System.out.printf("Highest grade: %.2f%n", highest);
        System.out.printf("Lowest grade: %.2f%n", lowest);
    }
}  

