package EmpWage;

import java.util.Random;

class CheckEmployee{
    int fullTime = 1;

    public void Empcheck(){
        Random rd = new Random();
        int present = rd.nextInt(2);
        if(present == fullTime){
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }
    }
}
public class UseCase1 {
    public static void main(String[] args) {
        CheckEmployee obj = new CheckEmployee();
        obj.Empcheck();
    }
}
