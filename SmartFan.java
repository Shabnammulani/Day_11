package Day_11;

public class SmartFan implements SmartDevices,Adjustable{
    private boolean isOn=false;
    private int speed;

    public SmartFan(int speed){
        this.speed=speed;
    }
    @Override
    public void turnOn(){
        isOn=true;
        System.out.println("SmartFan: turned on. speed= "+speed);

    }
    @Override
    public void turnOff(){
        isOn=false;
        System.out.println("SmartFan: turned off.");
    }

    @Override
    public String getStatus() {
        return "";
    }

    @Override
    public void increaseSetting(){
        if(speed<3) speed++;
        System.out.println("SmartFan: increased speed to "+speed);
    }
    @Override
    public void decreaseSetting(){
        if(speed>0) speed--;
        System.out.println("SmartFan: decreased speed to "+speed);
    }

    @Override
    public String getSettingDescription() {
        return "";
    }
   /* @Override
    public String getStatus(){
        return "SmartFan[ on= "+isOn+ ", Speed= "+speed+"]";
    }*/
}
