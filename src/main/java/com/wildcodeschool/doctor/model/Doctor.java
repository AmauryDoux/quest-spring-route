package com.wildcodeschool.doctor.model;

public class Doctor {

    private int number;
    private String name;

    public Doctor(int number, String name) {
        Doctor doctor;
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
