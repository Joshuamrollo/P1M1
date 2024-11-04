import java.util.Scanner;
public class GradeStats {
    public void calcStats() {
        System.out.println("Please enter 10 grades for some statistics");
        // initializing variables
        float gradesTotal = 0;
        float maxGrade = -1;
        float minGrade = -1;
        float grade;
        // initializing scanner to read input
        Scanner reader = new Scanner(System.in);
        // for loop that runs 10 times
        for(int i=0; i<10; i++) {
            System.out.println("Enter a grade: ");
            // reads input grade
            grade = reader.nextInt();

            // if first grade set max and min grade
            if(i==0) {
                maxGrade = grade;
                minGrade = grade;
            }
            // check if new max grade
            if(grade > maxGrade) {
                maxGrade = grade;
            }
            // check if new min grade
            if(grade < minGrade) {
                minGrade = grade;
            }
            // get total sum
            gradesTotal += grade;
        }
        reader.close();
        // output stats
        System.out.println("average: " + (gradesTotal/10));
        System.out.println("max grade: " + maxGrade);
        System.out.println("min grade: " + minGrade);
    }
}
