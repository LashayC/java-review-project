package com.hr.personnel.client;

import com.hr.personnel.Employee;
import java.time.LocalDate;

public class HRClient {

  public static void main(String[] args) {
//    Creates a new object
    Employee employee1 = new Employee();
    employee1.setName("sang");
    employee1.setHireDate(LocalDate.of(2020, 12, 13));
    String employeeInfo1 = employee1.getEmployeeInfo(); //Call on employee info method
    System.out.println("employee1 info = " + employeeInfo1); //print info to terminal

//    Create 2nd new object
    Employee employee2 = new Employee("mary", LocalDate.of(2021, 3, 22));
    String employeeInfo2 = employee2.getEmployeeInfo();
    System.out.println("employee2 info = " + employeeInfo2);

  }
}
