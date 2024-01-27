import java.util.Scanner;

class Person{
    String name;
    int age;
    String gender;

    public void read(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the person's name: ");
        this.name=sc.next();
        System.out.println("Enter the person's age: ");
        this.age=sc.nextInt();
        System.out.println("Is the person male or female? (M/F): ");
        this.gender=sc.next().toUpperCase();
    }
    public void display(){
        System.out.print(name+"\t"+age+"\t"+gender);
    }

}
class Student extends Person{
    int usn;
    String branch;
    float cgpa;

    public void read1(){
        read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the student's USN: ");
        this.usn=sc.nextInt();
        System.out.println("Enter  the student's Branch: ");
        this.branch=sc.next();
        System.out.println("Enter  the CGPA of the student: ");
        this.cgpa=sc.nextFloat();
    }
    public void display1(){
        display();
        System.out.print("\t"+usn+"\t"+branch+"\t"+cgpa+"\n");
    }
}

class Employee extends Person{
    int eid;
    String desig;
    double salary;
    public void read2(){
        read();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the employee's ID: ");
        eid=sc.nextInt();
        System.out.println("Enter   the designation: ");
        desig=sc.next();
        System.out.println("Enter   the Salary of the employee: ");
        salary=sc.nextDouble();
    }
    public void display2(){
        display();
        System.out.print("\t"+eid+"\t"+desig+"\t"+salary+"\n");
    }
}

public class p4{
    public static void main(String[] args) {
        Student[] students=new Student[2];
        Employee[] employees=new Employee[1];
        for(int i=0;i<2;i++){
            students[i]= new Student();
            students[i].read1();
        }
        System.out.println("Name\tAge\tGender\tUSN\tBranch\tCGPA");
        for(int i=0;i<2;i++){
            students[i].display1();
        }
        for(int i=0;i<1;i++){
        employees[0] = new Employee();
        employees[0].read2();
        }
        System.out.println("\nEmployee Details:\nID\tDesignation\tSalary");
        for(int i=0;i<1;i++){
        employees[i].display2();
        }
    }
}