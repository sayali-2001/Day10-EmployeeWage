package EmpWage;

import java.util.Random;

class MultiCompany{
    public static final int partTime = 1;
    public static final int fullTime = 2;
    public void method(String Company , int RatePerHr, int WorkingDays, int workingHrs){
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0; int totalEmpHrs = 0;
        int day =0;
        while(totalEmpHrs <= workingHrs &&  day < WorkingDays){
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
            empWage = empHrs * RatePerHr;
            totalEmpWage = totalEmpWage + empWage;
            totalEmpHrs = totalEmpHrs + empHrs;
            day++;
        }
        System.out.println("Total Number Of Hours: "+totalEmpHrs);
        System.out.println("Total Employee Wage: "+totalEmpWage);
    }
}
public class UseCase8 {
    public static void main(String[] args) {
        MultiCompany obj = new MultiCompany();
        System.out.println("Employee Wage of 1st Company");
        obj.method("Airtel", 20, 2, 10);
        System.out.println("Employee Wage of 2nd Company");
        obj.method("Jio", 10, 3,20);
    }
}
