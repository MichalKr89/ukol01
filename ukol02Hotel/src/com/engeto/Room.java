package com.engeto;



public class Room {
    private int numberOfBeds;
    private Boolean balcony;
    private Boolean viewOnSea;
    private int pricePerNight;

    public Room(int numberOfBeds, Boolean balcony, Boolean viewOnSea, int pricePerNight) {
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.viewOnSea = viewOnSea;
        this.pricePerNight = pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setViewOnSea(Boolean viewOnSea) {
        this.viewOnSea = viewOnSea;
    }

    public void setBalcony(Boolean balcony) {
        this.balcony = balcony;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public Boolean getViewOnSea() {
        return viewOnSea;
    }

    public Boolean getBalcony() {
        return balcony;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
}
