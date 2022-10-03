package com.hr.personnel;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {

  private static Employee employee;

  @Before
  public void setUp() throws Exception {
    employee = new Employee("Shay",
        LocalDate.of(2020, 3, 15));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {

    //arrange - test target
    //Using the before class, you no longer need to create the object for each test

    //act - do method
    String employeeInfo = employee.getEmployeeInfo();

    //assert - making sure return value is correct
    Assert.assertEquals("name = Shay, hiredate = 2020-03-15"
        , employeeInfo);
    //assert - using assertJ
    assertThat(employeeInfo).isEqualTo("name = Shay, hiredate = 2020-03-15");
  }

  @Test
  public void work() {
    String work = employee.work();

    assertThat(work).isEqualTo("Shay worked");
  }
}