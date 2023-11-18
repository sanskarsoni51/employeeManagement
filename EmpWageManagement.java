package Problems.EmpoyeeManagementSystem;

public class EmpWageManagement {
    public static void main(String[] Args){
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int Working_Days = 20;

        int totalWage = 0;
        for(int i = 1;i<Working_Days;i++){
            int empType = (int) (Math.random() * 100) % 3;
            int workingHours = 0;
            switch (empType) {
                case FULL_TIME: workingHours = 8;
                case PART_TIME: workingHours = 4;
            
                default: workingHours = 0;
            }
            int wage = workingHours * WAGE_PER_HR;
            totalWage = totalWage + wage;
        }
        System.out.println("total wage of the month is " + totalWage);
        
    }
}
