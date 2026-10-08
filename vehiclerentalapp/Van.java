/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Van {
    
    
    protected double dailyRate;
    protected double driverFee;

    public double getDailyRate() {
        return dailyRate;
    }

    public double getDriverFee() {
        return driverFee;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public void setDriverFee(double driverFee) {
        this.driverFee = driverFee;
    }

    public Van(double dailyRate, double driverFee) {
        this.dailyRate = dailyRate;
        this.driverFee = driverFee;
    }
    
}
