package com.thetestingacademy.ex_07_Payload_Management.Class.manual01;

public class Booking {

    private String firstname;
    private String lastname;
    private Integer totalprice;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDeposoitpaid() {
        return deposoitpaid;
    }

    public void setDeposoitpaid(Boolean deposoitpaid) {
        this.deposoitpaid = deposoitpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public Booking getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(Booking bookingDates) {
        this.bookingDates = bookingDates;
    }

    private Integer Totalprice;
    private Boolean deposoitpaid;
    private String additionalneeds;
    private Booking bookingDates;

}
