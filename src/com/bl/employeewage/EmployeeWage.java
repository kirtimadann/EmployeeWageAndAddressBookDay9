package com.bl.employeewage;

public class EmployeeWage {

    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;



    public int ComputeempWage(String company,int emp_rate_per_hours, int emp_working_day ,int max_emp_working_hrs){

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalworkingEmpDays = 0;

        while (totalEmpHrs <= max_emp_working_hrs && totalworkingEmpDays < emp_working_day){

            totalworkingEmpDays++;

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
            System.out.println("day "+totalworkingEmpDays+ ": " +totalEmpHrs + " Hours");

        }

        int empwage = totalEmpHrs * emp_rate_per_hours;
        System.out.println("totalempwage :"+ empwage);
        return empwage;

    }

    public static void main(String[] args) {

        EmployeeWage obj = new EmployeeWage();

        System.out.println(obj.ComputeempWage("wipro",20,20,100));

        System.out.println(obj.ComputeempWage("softtech",10,10,50));

    }
}
