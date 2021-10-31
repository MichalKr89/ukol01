package com.engeto;

import java.time.LocalDate;

public class Host {
    private String firstName;
    private String sureName;
    private LocalDate dateOfBirth;

    public Host(String firstName, String sureName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.sureName = sureName;
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSureName() {
        return sureName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
}