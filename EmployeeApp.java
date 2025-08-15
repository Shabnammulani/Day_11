package Day_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int choice=0;

        PersonalDetails personalDetails=new PersonalDetails("Scott",26,"Male",9876543215l,"Bangalore");
        ProfessionalDetails professionalDetails=new ProfessionalDetails("Senior Developer","E101","Software Testing","scott@gmail.com",3);
        SalaryDetails salaryDetails=new SalaryDetails(65000,15000,5000,1500);
        LeaveDetails leaveDetails=new LeaveDetails(20,6,8,3);
        Projects projects=new Projects(Arrays.asList("Inventory Management System","Employee Menu App"));

        do{
            System.out.println("\n\t Employee Menu ");
            System.out.println("\t-----------------");
            System.out.println("\t1.Display Employee Personal Details ");
            System.out.println("\t2.Display Employee Professional Details");
            System.out.println("\t3.Display Employee Salary Details ");
            System.out.println("\t4.Display Employee Earned Leaves and Casual Leaves Details ");
            System.out.println("\t5.Display Employee Project Undertaken");
            System.out.println("\nEnter your choice (1-6): ");

            if(!sc.hasNext()){
                System.out.println("Invalid input.Please enter a number between 1 to 6");
                sc.next();
                continue;
            }
            choice= sc.nextInt();
            System.out.println();
            switch (choice){
                case 1:
                    personalDetails.displayPersonalDetails();
                    break;

                case 2:
                    professionalDetails.displayProfessionalDetails();
                    break;

                case 3:
                    salaryDetails.DisplaySalaryDetails();
                    break;

                case 4:
                    leaveDetails.DisplayLeaveDetails();
                    break;

                case 5:
                    projects.DisplayProject();
                    break;

                case 6:
                    System.out.println("Exit Menu... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! please enter a valid input.");
            }

        }while (choice!=6);
    }
}
