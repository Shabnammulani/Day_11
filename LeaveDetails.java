package Day_11;

public class LeaveDetails {
    private int earnedGranted;
    private int earnedUsed;
    private int casualGranted;
    private int casualUsed;

    public LeaveDetails(int earnedGranted,int earnedUsed, int casualGranted,int casualUsed){
        this.earnedGranted=earnedGranted;
        this.earnedUsed=earnedUsed;
        this.casualGranted=casualGranted;
        this.casualUsed=casualUsed;
    }

    public void DisplayLeaveDetails(){
        int earnedLeft=earnedGranted-earnedUsed;
        int casualLeft=casualGranted-casualUsed;

        System.out.println("----- Employee Leaves -----");
        System.out.println("Earned Leaves: ");
        System.out.println("Granted: "+earnedGranted);
        System.out.println("Used: "+earnedUsed);
        System.out.println("Left: "+casualLeft);
        System.out.println("Casual Leaves: " );
        System.out.println("Granted: "+casualGranted);
        System.out.println("Used: "+casualUsed);
        System.out.println("Left: "+casualLeft);
    }
}
