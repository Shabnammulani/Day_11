package Day_11;

//import Day_9.Comparator.StudentMain;

public class SmartLight implements SmartDevices,Adjustable{
    private boolean isOn=false;
    private int brightness;

    public SmartLight(int brightness){
        this.brightness=brightness;
    }
    @Override
    public void turnOn(){
        isOn=true;
        System.out.println("SmartLight: turned on. Brightness= "+brightness+"%");
    }
    @Override
    public void turnOff(){
        isOn=false;
        System.out.println("SmartLight: Turned Off.");
    }
    @Override
    public void increaseSetting(){
        if(brightness<100)brightness+=10;
        System.out.println("SmartLight: increased brightness to "+brightness+"%");
    }
    @Override
    public void decreaseSetting(){
        if(brightness>0) brightness-=10;
        System.out.println("SmartLight: decreased brightness = "+brightness+"%");
    }
    @Override
    public String getStatus(){
        return "SmartLight[on = "+isOn+ ", brightness = "+brightness+"%]";
    }
    @Override
    public String getSettingDescription(){
        return "Brightness: "+brightness+ "%";
    }
}
