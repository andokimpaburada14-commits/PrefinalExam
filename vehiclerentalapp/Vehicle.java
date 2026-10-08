/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Vehicle {
    
    
    protected String vehicleID;
    protected String brand;
    protected String Model;
    protected int year;
    protected int rentalDays;
    protected int vehicleCount;
   
    public Vehicle(String vehicleID, String brand, String Model, int year, int rentalDays, int vehicleCount) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.Model = Model;
        this.year = year;
        this.rentalDays = rentalDays;
        this.vehicleCount = vehicleCount;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public void setVehicleCount(int vehicleCount) {
        this.vehicleCount = vehicleCount;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return year;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public int getVehicleCount() {
        return vehicleCount;
    }
    public void displayVehicleInfo(){
        
        System.out.println("==========Vehicle Information===========");
        System.out.println("Vehicle ID;" + vehicleID);
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+Model);
        System.out.println("year"+ year);
        System.out.println("Rental Days:" + rentalDays);
        System.out.println("DailyRate"+ DailyRate);
        System.out.println("insuranceFRee"+ insuranceFee);
        System.out.println("DriverFee"+ DriverFee);
        System.out.println("helmetFee"+ helmetFee);
              
    }
}
      

