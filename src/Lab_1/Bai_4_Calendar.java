package Lab_1;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai_4_Calendar {
    public static Map<String, String> months = new HashMap<>();

    public static void main(String[] args) {
        boolean correctInput;
        Scanner sc = new Scanner(System.in);
        String month;
        String year;
        preProcessing();
        do {
            month = sc.nextLine();
            year = sc.nextLine();
            correctInput = isCorrect(month, year);
            if (correctInput) {
                System.out.println(theDate(month, year));
            } else {
                System.out.println("Invalid inputs");
            }
        } while (!correctInput);
    }

    static String theDate(String month, String year) {
        if (!month.equals("February")
                && !month.equals("Feb.")
                && !month.equals("Feb")
                && !month.equals("2")) return months.get(month);

        Year theYear = Year.of(Integer.parseInt(year));
        if (theYear.isLeap()) return "29";
        return "28";
    }

    static void preProcessing() {
        months.put("January", "31");
        months.put("Jan.", "31");
        months.put("Jan", "31");
        months.put("1", "31");

        months.put("March", "31");
        months.put("Mar.", "31");
        months.put("Mar", "31");
        months.put("3", "31");

        months.put("May", "31");
        months.put("5", "31");

        months.put("July", "31");
        months.put("Jul", "31");
        months.put("7", "31");

        months.put("August", "31");
        months.put("Aug.", "31");
        months.put("Aug", "31");
        months.put("8", "31");

        months.put("October", "31");
        months.put("Oct.", "31");
        months.put("Oct", "31");
        months.put("10", "31");

        months.put("December", "31");
        months.put("Dec.", "31");
        months.put("Dec", "31");
        months.put("12", "31");

        months.put("February", "28");
        months.put("Feb.", "28");
        months.put("Feb", "28");
        months.put("2", "28");

        months.put("April", "30");
        months.put("Apr.", "30");
        months.put("Apr", "30");
        months.put("4", "30");

        months.put("June", "30");
        months.put("Jun", "30");
        months.put("6", "30");

        months.put("November", "30");
        months.put("Nov.", "30");
        months.put("Nov", "30");
        months.put("11", "30");

        months.put("September", "30");
        months.put("Sep", "30");
        months.put("Sep.", "30");
        months.put("9", "30");
    }

    static boolean isCorrect(String month, String year) {
        if (!months.containsKey(month)) return false;
        if (year.length() != 4) return false;

        try {
            int convertedYear = Integer.parseInt(year);
        } catch (Exception ex) {
            return false;
        }

        return true;
    }
}