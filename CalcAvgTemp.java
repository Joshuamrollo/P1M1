import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CalcAvgTemp {
    public static void main(String[] args) {
        // prompt user for day temperatures
        getTemperatures();
    }

    public static void getTemperatures() {
        ArrayList<Float> temperatures = new ArrayList<>();
        ArrayList<String> days = new ArrayList<>();

        // getting user input
        for(int i=0; i<7; i++){
            // get day
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a day of the week or enter 'Week'/input 7 days of data to see your temperature data: ");
            String userInputForDay = scanner.nextLine();

            if(Objects.equals(userInputForDay, "Week")) {
                break;
            }

            days.add(userInputForDay);

            // get temp
            System.out.print("Enter temperature for your day: ");
            Float userInputForTemp = scanner.nextFloat();

            temperatures.add(userInputForTemp);
        }

        printResults(days, temperatures);
    }

    public static float calculateWeeklyAverage(ArrayList<Float> temps) {
        Float totalTemp = (float) 0;
        for(Float temp : temps) {
            totalTemp += temp;
        }
        return totalTemp / temps.size();
    }

    public static void printResults(ArrayList<String> days, ArrayList<Float> temps) {
        for(int i=0; i<days.size(); i++) {
            System.out.println("temperature for day " + days.get(i) + " is " + temps.get(i));
        }
        System.out.println("the weekly average temp is " + calculateWeeklyAverage(temps));
    }
}
