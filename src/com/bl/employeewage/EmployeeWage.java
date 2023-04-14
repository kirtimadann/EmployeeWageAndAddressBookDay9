package com.bl.employeewage;

public class EmployeeWage {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int EMP_WORKING_DAY = 20;
    public static final int EMP_WORKING_HRS= 100;

    public static void main(String[] args) {

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalEmpDays = 0;

        while (totalEmpHrs <= EMP_WORKING_HRS && totalEmpDays < EMP_WORKING_DAY){

            totalEmpDays++;

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
            totalEmpHrs = empHrs + totalEmpHrs;
            System.out.println("day "+totalEmpDays+ ": " +totalEmpHrs + " Hours");

        }

        int empwage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println(empwage);

    }

}
