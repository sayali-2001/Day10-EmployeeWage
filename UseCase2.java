package EmpWage;

import java.util.Random;

class DailyWage{

    int fullTime = 1;
    int emp_rate_per_hr = 20;
    int empHrs = 0;
    int empWage = 0;

    public void Check(){
        Random rd = new Random();
        int present = rd.nextInt(2);
        if(present == fullTime){
           empHrs = 8;
        }
        else{
            empHrs = 0;
        }
        empWage = empHrs * emp_rate_per_hr;
        System.out.println("Daily Employee Wage : "+empWage);
    }

}
public class UseCase2 {
    public static void main(String[] args) {
        DailyWage obj = new DailyWage();
        obj.Check();
    }
}
