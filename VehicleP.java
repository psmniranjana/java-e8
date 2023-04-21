/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle.p;

/**
 *
 * @author Admin
 */
public class VehicleP {
 public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
    
    public static void main(String[] args) {
      VehicleP vehicle =new VehicleP();
      VehicleP car=new Car();
      VehicleP van=new Van();
      
      vehicle.start();
      vehicle.resource();
      car.start();
      car.resource();
      van.start();
      van.resource();
            
            
      
      
    }
    
}
