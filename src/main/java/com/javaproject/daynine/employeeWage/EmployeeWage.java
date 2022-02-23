package com.javaproject.daynine.employeeWage;

public class EmployeeWage {
    static final int is_Full_Time = 1;
    static final int is_Part_Time = 2;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        System.out.println();
        employeeWage("TCS",20,20,50);
        System.out.println();
        System.out.println("============");
        System.out.println();
        employeeWage("BridgeLabz",20,24,70);
    }

    public static void employeeWage(String companyName, int emp_Rate_Per_Hr, int num_Of_Working_Days,
                                    int maxHrs){
        int total_Working_Days = 0;
        int total_Employee_Wage = 0;
        int total_Emp_Hrs = 0;
        int emp_Hrs = 0;
        System.out.println(companyName);

        while(total_Emp_Hrs < maxHrs && total_Working_Days < num_Of_Working_Days){
            total_Working_Days++;
            double emp_Check = Math.floor(Math.random() * 10) % 3;
            if(emp_Check == is_Full_Time){
                System.out.println("Employee is an Full Time Employee");
                emp_Hrs = 8;
            }
            else if(emp_Check == is_Part_Time){
                System.out.println("Employee is an Part Time Employee");
                emp_Hrs = 4;
            }
            else{
                System.out.println("Employee is Absent");
                emp_Hrs = 0;
            }
            total_Emp_Hrs = total_Emp_Hrs + emp_Hrs;
            System.out.println("Total Employee Hours is " +total_Emp_Hrs);
        }
        total_Employee_Wage = total_Emp_Hrs * emp_Rate_Per_Hr;
        System.out.println("Total Salary of an Employee is " + total_Employee_Wage);
    }
}