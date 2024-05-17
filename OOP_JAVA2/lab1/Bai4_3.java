package lab1;
import java.util.*;
public class Bai4_3 {
    public static void pensionContributionCalculator(Scanner sc){
        System.out.print("Enter the monthly salary: $");
        int salary = sc.nextInt();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        int contributableSalary;
        double employeeContributation;
        double employerContributation;
        double totalContribution;

        contributableSalary = Math.min(SALARY_CEILING, salary);
        if(age <= 55){
            employeeContributation = salary*EMPLOYEE_RATE_55_AND_BELOW;
            employerContributation = salary*EMPLOYER_RATE_55_AND_BELOW;
            totalContribution = employeeContributation + employerContributation;
        }
        else if(age <= 60){
            employeeContributation = salary*EMPLOYEE_RATE_55_TO_60;
            employerContributation = salary*EMPLOYER_RATE_55_TO_60;
            totalContribution = employeeContributation + employerContributation;
        }
        else if(age <= 65){
            employeeContributation = salary*EMPLOYEE_RATE_60_TO_65;
            employerContributation = salary*EMPLOYER_RATE_60_TO_65;
            totalContribution = employeeContributation + employerContributation;
        }
        else{
            employeeContributation = salary*EMPLOYEE_RATE_65_ABOVE;
            employerContributation = salary*EMPLOYER_RATE_65_ABOVE;
            totalContribution = employeeContributation + employerContributation;
        }
        System.out.println("The employee's contribution is: " + "$" + String.format("%.2f", employeeContributation));
        System.out.println("The employer's contribution is: " + "$" + String.format("%.2f", employerContributation));
        System.out.println("The total contribution is: " + "$" + String.format("%.2f", totalContribution));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pensionContributionCalculator(sc);
    }
}
