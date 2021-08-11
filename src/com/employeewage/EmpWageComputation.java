package com.employeewage;

/**
 * EmpWage implements and application which will check employee status
 *
 * @author Deepak
 * @version 1.0
 * @since 11/08/2021
 */
public class EmpWageComputation {

    public static void main(String[] args) {
        /**
         * Method will check Employee presence, part time and calculates wage
         * @param empType Generates Random variable from 0 t0 2
         * Used Switch Case
         * Calculating Monthly Wage
         */
        final int FULL_TIME = 2;
        final int PART_TIME = 1;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;

        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int empType = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            switch (empType)
            {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}
