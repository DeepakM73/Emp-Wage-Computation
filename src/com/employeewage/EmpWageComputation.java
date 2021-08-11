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
         */
        final int FULL_TIME = 2;
        final int PART_TIME = 1;
        final int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 3;
        int workingHours = 0;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present Full Time");
            workingHours = 8;

        } else if (empType == PART_TIME)
        {
            System.out.println("Employee is Present Part Time");
            workingHours = 4;
        }else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}
