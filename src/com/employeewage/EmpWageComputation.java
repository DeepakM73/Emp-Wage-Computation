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
         * Method will check Employee Presence
         */
        final int FULL_TIME = 1;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");

        } else
        {
            System.out.println("Employee is Absent");

        }
    }
}
