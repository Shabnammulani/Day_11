package Day_11;

public class SalaryDetails {
    private double basic;
    private double hra;
    private double otherAllowances;
    private double medicalAllowance;

    public SalaryDetails(double basic,double hra,double otherAllowances,double medicalAllowance){
        this.basic=basic;
        this.hra=hra;
        this.otherAllowances=otherAllowances;
        this.medicalAllowance=medicalAllowance;
    }

    public void DisplaySalaryDetails(){
        System.out.println("----- Employee Salary Details -----");
        System.out.println("Basic: "+basic);
        System.out.println("HRA: "+hra);
        System.out.println("Other Allowances: "+otherAllowances);
        System.out.println("Medical Allowance: "+medicalAllowance);
    }
}
