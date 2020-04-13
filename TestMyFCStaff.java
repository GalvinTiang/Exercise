/*
class QuestionOne {
    private int count;

    public QuestionOne() {
        count = 1;
    }
    public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}
public class Main {
    public static void main (String []arg) {
        QuestionOne q1;
        q1 = new QuestionOne();
        q1.increment();
        q1.increment();
        System.out.println(q1.getCount());
    }
}

//Q2B
import java.util.Scanner;

class TestStaff {
    static Scanner console = new Scanner(System.in);

    public static void main(String arg[]){
        String name, staffID;
        double salary;
        int workingDay;
        
        System.out.print("Name: ");
        name = console.nextLine();
        System.out.print("Staff ID: ");
        staffID = console.nextLine();
        System.out.print("Working Day: ");
        workingDay = console.nextInt();

        Staff s = new Staff();
        
        s.setStaffInfo(name,staffID,workingDay);
        s.calculateSalary();
        
        System.out.println("---------------<<<STAFF INFO>>>----------------");
        System.out.printf("Staff Name : " + s.getName());
        System.out.println();
        System.out.printf("Staff ID: " + s.getStaffID());
        System.out.println();
        System.out.printf("Staff Salary:RM  "+ s.getSalary());
        System.out.println();
    }
}

class Staff {
    private String name, staffID;
    private double salary;
    private int workingDay;
    public void setStaffInfo(String sname, String id, int wDay){
        name = sname;
        staffID = id;
        workingDay = wDay;
    }
    public void calculateSalary(){
        salary = workingDay * 35.0;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String getStaffID(){
        return staffID;
    }
}//end class
*/
//Q3
import java.util.Scanner;

public class TestMyFCStaff {
    public static void main(String arg[]){
    
        Scanner input = new Scanner(System.in);
        
        String name, staffID;
        double totalHoursWork, totalSales;
        
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Staff ID: ");
        staffID = input.nextLine();
        System.out.print("Working Hours: ");
        totalHoursWork = input.nextDouble();
        System.out.print("Total Sales: ");
        totalSales = input.nextDouble();

        MyFCStaff fc= new MyFCStaff(name,staffID,totalHoursWork,totalSales);

        fc.displaySalary();
    }
}

class MyFCStaff{
    private String name, staffID;
    private double totalHoursWork, totalSales, totalSalary, commission;

    public MyFCStaff(String name, String staffID,double totalHoursWork,double totalSales){
        this.name = name;
        this.staffID = staffID;
        this.totalHoursWork = totalHoursWork;
        this.totalSales = totalSales;
    }

    public double calculateCommission(){
        if(totalSales>=150 && totalSales<=300){
            commission = 0.05 * totalSales;
        }else if(totalSales>300 && totalSales<=500){
            commission = 0.1 * totalSales;
        }else if(totalSales>500){
            commission = 0.15 * totalSales;
        }else{
            commission = 0;
        }
        return commission;
    }

    public double calculateSalary(){
        totalSalary = totalHoursWork*8 + calculateCommission();
        return totalSalary;
    }

    public void displaySalary(){
    
        System.out.println();
        System.out.println("Staff Name : "+  name);
        System.out.println("Staff ID : " + staffID);
        System.out.println("Hours Work :" + totalHoursWork);
        System.out.printf("Total Sale : RM%.2f " , totalSales);
        System.out.println();
        System.out.printf("Total Salary : RM%.2f " , calculateSalary());
    }
}
/*
//Q4
import java.util.Scanner;

public class TestMyFCStaff {
    public static void main(String arg[]){
    
        Scanner input = new Scanner(System.in);
        
        String name, staffID;
        double totalHoursWork, totalSales;
        
        System.out.printf("Name: ");
        name = input.nextLine();
        System.out.print("Staff ID: ");
        staffID = input.nextLine();
        System.out.print("Working Hours: ");
        totalHoursWork = input.nextDouble();
        System.out.print("Total Sales: ");
        totalSales = input.nextDouble();

        MyFCStaff fc = new MyFCStaff(name,staffID,totalHoursWork,totalSales);
        System.out.println(fc.toString());
    }
}

class MyFCStaff{
    private String name, staffID;
    private double totalHoursWork, totalSales, totalSalary, commission;

    public MyFCStaff(String name, String staffID,double totalHoursWork,double totalSales){
        this.name = name;
        this.staffID = staffID;
        this.totalHoursWork = totalHoursWork;
        this.totalSales = totalSales;
    }

    public double calculateCommission(){
        if(totalSales>=150 && totalSales<=300){
            commission = 0.05 * totalSales;
        }else if(totalSales>=301 && totalSales<=500){
            commission = 0.1 * totalSales;
        }else if(totalSales>500){
            commission = 0.15 * totalSales;
        }else{
            commission = 0;
        }
        return commission;
    }

    public double calculateSalary(){
        totalSalary = totalHoursWork * 8 + calculateCommission();
        return totalSalary;
    }

    public String toString() {
        String nm, id, hrs, sales, salary;

        nm = String.format("\nStaff Name : " + name);
        id = String.format("\nStaff ID :" + staffID);
        hrs = String.format("\nHours Work : " + totalHoursWork);
        sales = String.format("\nTotal Sale : RM " + totalSales);
        salary = String.format("\nTotal Salary : RM" + calculateSalary());

        return nm + id + hrs + sales + salary;
    }
}*/