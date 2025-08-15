package Day_11;

public class PersonalDetails {
    private String name;
    private  int age;
    private  String gender;
    private  long phno;
    private String location;

    public PersonalDetails(String name,int age,String gender,long phno,String location){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.phno=phno;
        this.location=location;
    }

    public void displayPersonalDetails(){
        System.out.println("------ Employee Personal Details ------");
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Phone Number: "+phno);
        System.out.println("location: "+location);
    }
}
