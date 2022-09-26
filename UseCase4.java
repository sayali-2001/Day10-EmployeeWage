package EmpWage;

import java.util.Random;

class SwitchCase{

   public  static final int partTime = 1;
    public  static final int fullTime = 2;
    int emp_rate_per_hr = 20;
    int empHrs = 0;
    int empWage = 0;

    public void Method(){
        Random rd = new Random();
        int a = rd.nextInt(3);

        switch (a){
            case partTime:
                empHrs = 4;
                break;
            case fullTime:
                empHrs = 8;
                break;
            default:
                System.out.println("wrong input");
        }
        empWage = empHrs * emp_rate_per_hr;
        System.out.println("Daily Employee Wage : "+empWage);
    }
}
public class UseCase4 {
    public static void main(String[] args) {
        SwitchCase obj1 = new SwitchCase();
        obj1.Method();
    }
}
