package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
//Private fields
  private String name;
  private LocalDate hireDate;

  //Constructor
  public Employee(){

  }
  public Employee(String name, LocalDate hireDate) {
    this.name = name;
    this.hireDate = hireDate;
  }

  //Methods
  public String getEmployeeInfo(){
    return "name = " + name + ", hiredate = " + hireDate;
  }

  public String work(){
    return name + " worked";
  }

//Getters and Setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getHireDate() {
    return hireDate;
  }

  public void setHireDate(LocalDate hireDate) {
    this.hireDate = hireDate;
  }


}
