package bsu.comp152;

/**
 * Exercise -
 * A class for Project 1, COMP 152
 *
 * Starter code Laura K. Gross, laura.gross@bridgew.edu, 1/2023
 *
 * Completed by: [student name], [student email], [date of completion]
 */
public class Exercise {
    public static void main(String[] args) {
        System.out.println(percentage(365, 365));
        System.out.println(percentage(182, 365));
        System.out.println(percentage(54, 365));
        System.out.println(percentage(301, 366));
    }

    /**
     * percentage -
     * A static method that returns [insert description of method here]
     * @param daysMetTarget
     * @param daysInYear
     * @return
     */
    public static double percentage(int daysMetTarget, int daysInYear) {
        return daysMetTarget/(double)daysInYear * 100;
    }
}
