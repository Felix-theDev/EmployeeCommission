package com.company;

public class Employee {
    private String firstName;
    private String lastName;
    private int socNumber;

    public Employee(String firstName, String lastName, int socNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socNumber = socNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSocNumber() {
        return socNumber;
    }

    public void setSocNumber(int socNumber) {
        this.socNumber = socNumber;
    }
    @Override
    public String toString(){
        return String.format("%s: %s%n%s: %s%n%s: %d", "First name", firstName,
                "Last Name", lastName, "Social Security Number", socNumber);
    }
}
