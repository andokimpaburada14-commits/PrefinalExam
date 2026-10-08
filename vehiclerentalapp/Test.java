/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class  Test {
    public static void main(String[] args) {
        Vehicle [] vehicles = new Vehicle[3];
        
        vehicles [1] = new Vehicle("SD001","toyota","vios",2024, 3, "sedan",5,000.00 );
        vehicles [1] = new Vehicle("SD001","totuya","vios",2025, 4, "motorcycle",5,000.00 );
        vehicles [1] = new Vehicle("SD001","toyota","vios",2026, 5, "van",5,000.00 );
        
        System.out.println("==============DINA AND GAT RENT A RIDE SERVICE VEHICLE RENTAL SYSTEM=============");
        System.out.println("");
        
        
        for (Vehicle vehicle: vehicles){
            Vehicle.displayVehicleInfo();
        }
    
}}
