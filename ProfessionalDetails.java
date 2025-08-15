package Day_11;

public class ProfessionalDetails {
    private String designation;
    private String employeeId;
    private String department;
    private String email;
    private int yearsOfExperience;

    public ProfessionalDetails(String designation,String employeeId,String department,String email,int yearsOfExperience){
        this.designation=designation;
        this.employeeId=employeeId;
        this.department=department;
        this.email=email;
        this.yearsOfExperience=yearsOfExperience;

    }

    public void displayProfessionalDetails(){
        System.out.println("----- Employee Professional Details -----");
        System.out.println("Designation: "+designation);
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Department: "+department);
        System.out.println("Email: "+email);
        System.out.println("Years of Experience: "+yearsOfExperience);
    }
}
