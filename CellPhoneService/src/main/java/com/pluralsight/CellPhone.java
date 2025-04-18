package com.pluralsight;

public class CellPhone {
    private long serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.owner = "";
        this.phoneNumber = "";
    }

    public CellPhone(long serialNumber, String model, String carrier, String owner, String phoneNumber) {
        this.setSerialNumber(serialNumber);
        this.setModel(model);
        this.setCarrier(carrier);
        this.setOwner(owner);
        this.setPhoneNumber(phoneNumber);
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void dial(String _phoneNumber){
        System.out.printf("%s's phone is calling %s\n", owner, _phoneNumber);
    }

    public void dial(CellPhone _cellPhone){
        System.out.println("Phone number: " + _cellPhone.getPhoneNumber());
    }
}
