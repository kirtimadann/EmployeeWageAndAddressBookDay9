package com.bl.employeewage;

public class EmployeeWage {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int EMP_WORKING_DAY = 20;

    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;
        int totalempWage = 0;

        for (int day = 0; day < EMP_WORKING_DAY; day++) {

            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

            switch (empCheck) {

                case IS_PART_TIME:

                    empHrs = 4;
                    break;

                case IS_FULL_TIME:

                    empHrs = 8;
                    break;


                default:
                    empHrs = 0;

            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalempWage = totalempWage + empWage;
            System.out.println("Emp Wage:" + empWage);
        }

        System.out.println("total wage" + totalempWage);

    }

}
