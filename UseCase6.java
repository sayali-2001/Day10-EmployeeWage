package EmpWage;

import java.util.Random;

class CalculateWage{
    public static final int partTime = 1;
    public static final int fullTime = 2;
    int emp_rate_per_hr = 20;
    int workingDays = 20;
    int empHrs = 0;
    int empWage = 0;
    int totalEmpWage = 0;
    int workingHrs = 100;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;
//    int day = 0;

    public void Method(){
        int day =0;
        while(totalEmpHrs <= workingHrs &&  day < workingDays){
            Random rd = new Random();
            int a = rd.nextInt(3);
            switch (a) {
                case partTime:
                    empHrs = 4;
                    break;
                case fullTime:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * emp_rate_per_hr;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHrs = totalEmpHrs + empHrs;
            day++;
        }
        System.out.println("Total Number Of Hours: "+totalEmpHrs);
        System.out.println("Total Employee Wage: "+totalEmpWage);
    }
}
public class UseCase6 {
    public static void main(String[] args) {
        CalculateWage obj1 = new CalculateWage();
        obj1.Method();
    }
}
