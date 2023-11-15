package Problems.EmpoyeeManagementSystem;

public class EmpWageManagement {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double check = Math.floor(Math.random()*10) % 2;
        if(IS_FULL_TIME == check){
            System.out.println("Employee is present");
        }else{
            System.out.println("employee is absent");
        }
    
}
}