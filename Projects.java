package Day_11;

import java.util.List;

public class Projects {
    private List<String>projectList;

    public Projects(List<String>projectList){
        this.projectList=projectList;
    }

    public void DisplayProject(){
        System.out.println("----- Employee Projects Undertaken -----");
        if(projectList == null || projectList.isEmpty()){
            System.out.println("No project assigned");
        }else{
            for(int i=0;i< projectList.size();i++){
                System.out.println((i+1)+ ". "+projectList.get(i));
            }
        }
    }
}
