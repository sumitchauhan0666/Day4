package com.bridgelabz.day4;
import java.util.Random;


    public class EmployWageCalculation {
        public static void main(String[] args) {
            System.out.println("Welcome to employee wage computation program on master branch ");

//constants
            final int isPresent = 0;
            final int isAbsent = 1;
            final int isFullTime = 2;
            final int isPartTime =3;
            final int perHourWage = 20;
            final int fullTimeHour = 8;
            final int partTimeHour = 4;
//Variables

            int empWage = 0;
            int workingHours = 0;

//Use Case 1
            Random randomNumber = new Random();
            int num = randomNumber.nextInt(4);
            if (isPresent == num) {
                System.out.println("Employee is present");
            }
            else if (isAbsent == num){
                System.out.println("Employee is absent");
            }
// Use Case 2
            if (isPresent == num){
                workingHours = 8;
                empWage = workingHours * perHourWage;

                System.out.println("Daily wage of the employee is : Rs " + empWage);
            }
            else if (isAbsent == num) {
                System.out.println("Daily wage of the employee is Rs " + empWage);
            }
// Use Case 3
            if (isFullTime == num){
                workingHours = 8;
                empWage = workingHours * perHourWage;
                System.out.println("Employee is working full time and his wage is Rs : " + empWage);

            }
            else if (isPartTime == num){
                workingHours = 4;
                empWage = workingHours * perHourWage;
                System.out.println("Employee is working part time and his wage is Rs : " + empWage);

            }
//Use case 4




        }
    }