package com.javaproject.daynine.addressBook;

public class UserInterface {
    private String firstName, lastName, address, city, state, email;
    private int zipCode;
    private long phoneNumber;

    public UserInterface(String firstName, String lastName, String address,
                         String city, String state, String email, int zipCode, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public UserInterface() {

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

    public String getAddress(String bm) {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity(String ichalkarnaji) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState(String maharashtra) {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail(String s) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZipCode(int i) {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public long getPhoneNumber(int i) {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserInterface{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zipCode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}