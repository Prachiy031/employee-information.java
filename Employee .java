/*
Design and develop inheritance for a given case study and identify objects and relationships in it.
Employee class with Emp_name, Emp_id, Address, Mail_id, and Mobile_no as data members. Inherit the
classes, Programmer, Assistant Professor, Associate Professor and Professor from employee class. Add
Basic Pay (BP) as the member of all the inherited classes with 97% of BP, DA 10 % of BP, HRA is12% of
BP, and PF is 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net
salary.
*/

import java.util.Scanner;
class Salary
{
    public static void main(String[] args)
    {
        int position;
        String employeeName;
        int employeeId;
        String employeeAddress;
        String employeeMail;
        long mobileNo;
        int response;
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();             //parent class
        Programmer programmer = new Programmer();      //child class
        AssistantProfessor assistantProf = new AssistantProfessor();    //child class
        AssociateProfessor associateProf = new AssociateProfessor();   //child class
        Professor professor = new Professor();    //child class
        
        do
        {
            System.out.println("Enter choice for position of Employee: \n1.Programmer\t\t 2.AssistantProfessor\n3.AssociateProfessor\t 4.Professor");
            position = input.nextInt();
            switch(position)
            {
                case 1 :
                    employee.getData();            //for getting data of employee
                    programmer.calculate();     //calculating all payments
                    employee.display();         //displaying data of employee
                    programmer.display();       //displaying payment data
                    break;
                case 2 :
                    employee.getData();
                    assistantProf.calculate();
                    employee.display();
                    assistantProf.display();
                    break;
                case 3 :
                    employee.getData();
                    associateProf.calculate();
                    employee.display();
                    associateProf.display();
                    break;
                case 4 :
                    employee.getData();
                    professor.calculate();
                    employee.display();
                    professor.display();
                    break;
                default:System.out.println("Please enter correct position");
                
            }
            System.out.println("Is there any other employee has remained? Type 1 for yes otherwise Type 0 ->");
            response = input.nextInt();
        }
        while(response!=0);
        //employee.display();
    }
}
class Employee
{
    String empName;
    int empId;
    String empAddress;
    String empMail;
    long mobNo;
    int grossSalary,netSalary;
    int basicSalary;
    Scanner input = new Scanner(System.in);
    Employee()           //default constructor
    {
        empName = "";
        empId = 0;
        empAddress = "";
        empMail = "";
        mobNo = 0;
    }
    
    void getData()
    {
        System.out.println("Enter name of employee:");
        empName = input.nextLine();
        System.out.println("Enter employee ID:");
        empId = input.nextInt();
        System.out.println("Enter address of employee:");
        empAddress = input.nextLine();
        System.out.println("Enter mail of employee:");
        empMail = input.nextLine();
        System.out.println("Enter mobile number of employee:");
        mobNo = input.nextLong();
    }
    void display()
    {
        System.out.println("*******Employee Details*******");
        System.out.println("Name of employee: "+empName);
        System.out.println("Employee ID: "+empId);
        System.out.println("Address of employee: "+empAddress);
        System.out.println("Mail of employee: "+empMail);
        System.out.println("Mobile number of employee: "+mobNo);
    }
}
class Programmer extends Employee
{
   Scanner input = new Scanner(System.in);
   double da,hra,pf,club,grossSalary,basicPayment,netSalary;
   void calculate()
   {
     System.out.println("Enter basic payment of an employee:");
     basicPayment = input.nextDouble();
     da = 0.97*basicPayment;
     hra = 0.10*basicPayment;
     pf = 0.12*basicPayment;
     club = 0.01*basicPayment;
     grossSalary = basicPayment + hra+da ;
     netSalary = grossSalary- pf -club;
   }
   void display()
   {
       System.out.println("da : "+da);
       System.out.println("hra : "+hra);
       System.out.println("pf : "+pf);
       System.out.println("club : "+club);
       System.out.println("Gross salary : "+grossSalary);
       System.out.println("Net salary : "+netSalary);
   }
   
}
class AssistantProfessor extends Employee
{
    Scanner input = new Scanner(System.in);
   double da,hra,pf,club,grossSalary,basicPayment,netSalary;
   void calculate()
   {
     System.out.println("Enter basic payment of an employee:");
     basicPayment = input.nextDouble();
     da = 0.97*basicPayment;
     hra = 0.10*basicPayment;
     pf = 0.12*basicPayment;
     club = 0.01*basicPayment;
     grossSalary = basicPayment + hra+da ;
     netSalary = grossSalary - pf -club;
   }
   void display()
   {
       System.out.println("da : "+da);
       System.out.println("hra : "+hra);
       System.out.println("pf : "+pf);
       System.out.println("club : "+club);
       System.out.println("Gross salary : "+grossSalary);
       System.out.println("Net salary : "+netSalary);
   }
    
}
class AssociateProfessor extends Employee
{
    Scanner input = new Scanner(System.in);
   double da,hra,pf,club,grossSalary,basicPayment,netSalary;
   void calculate()
   {
     System.out.println("Enter basic payment of an employee:");
     basicPayment = input.nextDouble();
     da = 0.97*basicPayment;
     hra = 0.10*basicPayment;
     pf = 0.12*basicPayment;
     club = 0.01*basicPayment;
     grossSalary = basicPayment + hra+da ;
     netSalary = grossSalary -pf -club;
   }
   void display()
   {
       System.out.println("da : "+da);
       System.out.println("hra : "+hra);
       System.out.println("pf : "+pf);
       System.out.println("club : "+club);
       System.out.println("Gross salary : "+grossSalary);
       System.out.println("Net salary : "+netSalary);
   }
}
class Professor extends Employee
{
    Scanner input = new Scanner(System.in);
   double da,hra,pf,club,grossSalary,basicPayment,netSalary;
   void calculate()
   {
     System.out.println("Enter basic payment of an employee:");
     basicPayment = input.nextDouble();
     da = 0.97*basicPayment;
     hra = 0.10*basicPayment;
     pf = 0.12*basicPayment;
     club = 0.01*basicPayment;
     grossSalary = basicPayment + hra+da ;
     netSalary = grossSalary -pf -club;
   }
   void display()
   {
       System.out.println("da : "+da);
       System.out.println("hra : "+hra);
       System.out.println("pf : "+pf);
       System.out.println("club : "+club);
       System.out.println("Gross salary : "+grossSalary);
       System.out.println("Net salary : "+netSalary);
   }
}
