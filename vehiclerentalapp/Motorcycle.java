/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Motorcycle extends Vehicle {
   
    public Motorcycle(String vehicleID, String brand, String Model, int year, int rentalDays, int vehicleCount) {
        super(vehicleID, brand, Model, year, rentalDays, vehicleCount);
    }
    @Override
    
    public double calculateRentalFee(){
        return (rentalDays * dailyRate) + helmet;
    }
   
    
}
