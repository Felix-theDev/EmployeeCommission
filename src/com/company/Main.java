package com.company;

/** A simple program that gives commission to an employee based o certain criteria
 * @author Felix Ogbonnaya
 * @since 2019-08-20
 */
public class Main {

    public static void main(String[] args) {
	 Employee employee = new Employee("Felix", "Ogbonnaya", 30454833);
	 CommissionEmployee employee1 = new CommissionEmployee("John", "Doe", 7586878, 5000, 0.5);
	 System.out.printf("%s%n%s", "The defaults values for the employer are as " +
                "follows: ", employee);
	 employee.setFirstName("Divine");
	 employee.setLastName("Joseph");
	 employee.setSocNumber(4076468);
	 System.out.printf("%n%n%s%n%s", "After changes the employee values" +
             " are as " + "follows: ", employee);
        System.out.println(employee1);
    }
}
