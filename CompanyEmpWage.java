package EmpWage;

public class CompanyEmpWage {
    public  String company;
    public int RatePerHr;
    public int WorkingDays;
    public int maxHrPerHour;
    public int totalEmpWage;

    public CompanyEmpWage(String company, int RatePerHr, int WorkingDays, int maxHrPerHour){
           this.company = company;
           this.RatePerHr = RatePerHr;
           this.WorkingDays = WorkingDays;
           this.maxHrPerHour = maxHrPerHour;

    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }
    public String toString(){
        return "Total Emp Wage For Company : " +company+ " is: "+totalEmpWage;
    }
}
