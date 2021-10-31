package com.engeto;

import java.time.LocalDate;

public class Reservation {
    private String nameOfVisitor;
    private int roomNumber;
    private LocalDate firstDay;
    private LocalDate lastDay;

    public Reservation(String nameOfVisitor, int roomNumber, LocalDate firstDay, LocalDate lastDay) {
        this.nameOfVisitor = nameOfVisitor;
        this.roomNumber = roomNumber;
        this.firstDay = firstDay;
        this.lastDay = lastDay;

    }

    public void setLastDay(LocalDate lastDay) {
        this.lastDay = lastDay;
    }

    public void setFirstDay(LocalDate firstDay) {
        this.firstDay = firstDay;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNameOfVisitor(String nameOfVisitor) {
        this.nameOfVisitor = nameOfVisitor;
    }

    public LocalDate getLastDay() {
        return lastDay;
    }

    public LocalDate getFirstDay() {
        return firstDay;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getNameOfVisitor() {
        return nameOfVisitor;
    }
}
