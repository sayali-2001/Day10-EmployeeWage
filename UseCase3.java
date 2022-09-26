package EmpWage;

import java.util.Random;

class PartTime{
    int partTime = 1;
    int fullTime = 2;
    int emp_rate_per_hr = 20;
    int empHrs = 0;
    int empWage = 0;
    public void m1(){
        Random rd = new Random();
        int present = rd.nextInt(3);
        if(present == fullTime)
        {
            empHrs = 16;
        } else if(present == partTime)
        {
            empHrs = 8;
        } else{
            empHrs = 0;
        }
        empWage = empHrs * emp_rate_per_hr;
        System.out.println("Daily Employee Wage : "+empWage);
    }
}
public class UseCase3 {
    public static void main(String[] args) {
        PartTime obj = new PartTime();
        obj.m1();
    }
}
