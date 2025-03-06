// Name:       <Edwin Urrea>

// Class:      CS 3305/Section#W02

// Term:       Spring 2025

// Instructor: Umama Tasnim
// Assignment: 2
import java.util.Scanner;

//Employee Record Storing Employee Information
class Employee {
   int employeeID;
   String name;
   String position;
   double salary;
   Employee next; //Pointer
   
   //Constructor for Employee Record
   public Employee(int employeeID, String name, String position, double salary) {
      this.employeeID = employeeID;
      this.name = name;
      this.position = position;
      this.salary = salary;
      this.next = null;
   }
}

//Linked List Class To Manage Employee Records
class EmployeeLinkedList {
   private Employee head;
   
   //Adds A New Employee To The List
   public void addEmployee(Employee emp) {
      //Checks If Empty
      if (head == null) {
         head = emp;
      } 
      else {
         Employee current = head;
         while (current.next != null) {
            //Checks For Duplication
            if (current.employeeID == emp.employeeID) {
               System.out.println("Error! Employee ID must be unique.");
               return;
            }
            current = current.next;
         }
         //Checks For Duplication
         if (current.employeeID == emp.employeeID) {
            System.out.println("Error! Employee ID must be unique.");
            return;
         }
         current.next = emp;
      }
      System.out.println("Employee added!");
   }
   
   //Deletes An Employee Using Their ID
   public void deleteEmployee(int employeeID) {
      //Checks If Empty
      if (head == null) {
         System.out.println("Error! No employees in list.");
         return;
      }
      if (head.employeeID == employeeID) {
         head = head.next;
         System.out.println("Employee deleted!");
         return;
      }
      Employee current = head;
      while (current.next != null && current.next.employeeID != employeeID) {
         current = current.next;
      }
      if (current.next == null) {
         System.out.println("Error! Employee not found.");
      }
      else {
         current.next = current.next.next;
         System.out.println("Employee deleted!");
      }
   }

   //Display Details Of All Employees In The List 
   public void displayEmployees() {
      if (head == null) {
         System.out.println("No employees to display.");
         return;
      }
      Employee current = head;
      while (current != null) {
         System.out.println("ID: " + current.employeeID + ", Name: " + current.name +
                            ", Position: " + current.position + ", Salary: " + current.salary);
         current = current.next;
      }
   }
}

public class EmployeeManagementSystem {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      EmployeeLinkedList list = new EmployeeLinkedList();
      
      while(true) {
         System.out.println("\nEmployee Management System" +
                            "\n1. Add Employee" +
                            "\n2. Delete Employee" +
                            "\n3.Display Employees" +
                            "\n4. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         
         switch (choice) {
             case 1:
                 System.out.print("Enter Employee ID: ");
                 int id = scanner.nextInt();
                 scanner.nextLine(); 
                 System.out.print("Enter Name: ");
                 String name = scanner.nextLine();
                 System.out.print("Enter Position: ");
                 String position = scanner.nextLine();
                 System.out.print("Enter Salary: ");
                 double salary = scanner.nextDouble();
                 if (salary <= 0) {
                     System.out.println("Error! Salary must be a positive number.");
                     break;
                 }
                 list.addEmployee(new Employee(id, name, position, salary));
                 break;
             case 2:
                 System.out.print("Enter Employee ID to delete: ");
                 int deleteID = scanner.nextInt();
                 list.deleteEmployee(deleteID);
                 break;
             case 3:
                 list.displayEmployees();
                 break;
             case 4:
                 System.out.println("Exiting Employee Management System.");
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }
      }
   }
}
