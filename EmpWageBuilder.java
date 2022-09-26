package EmpWage;

import java.util.Random;

public class EmpWageBuilder {
    public static final int partTime = 1;
    public static final int fullTime = 2;
    public int numOfCompany = 0;

    private CompanyEmpWage[] companyEmpWagesArray;

    public EmpWageBuilder() {
        companyEmpWagesArray = new CompanyEmpWage[5];
    }

    public void addCompanyWage(String company, int RatePerHr, int WorkingDays, int maxHrPerHour) {
        companyEmpWagesArray[numOfCompany] = new CompanyEmpWage(company, RatePerHr, WorkingDays, maxHrPerHour);
        numOfCompany++;
    }

    private void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWagesArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagesArray[0]));
            System.out.println(companyEmpWagesArray[i]);
        }
    }

    private int computeEmpWage(CompanyEmpWage c) {
        int empWage = 0;
        int empHrs;
        int totalEmpHr = 0;
        int totalWorkingDay = 0;
        while (totalEmpHr <= c.maxHrPerHour && totalWorkingDay < c.WorkingDays) {
            totalWorkingDay++;
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
            totalEmpHr = totalEmpHr + empHrs;
            System.out.println("Day: " +totalWorkingDay+ "Emp Hr : " +empHrs);

            }
        return totalEmpHr * computeEmpWage().RatePerHr;
    }

    public static void main(String[] args) {
        EmpWageBuilder obj = new EmpWageBuilder();
        obj.addCompanyWage("Dmart", 20,2,10);
        obj.addCompanyWage("Amazon", 10, 4,20);
        obj.computeEmpWage();
    }
    }

