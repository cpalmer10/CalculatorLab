/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Chris
 */
public class CalculatorService {
    
    public double calculateAreaRectangle(String width, String length){
        double len = Double.parseDouble(length);
        double wid = Double.parseDouble(width);
        return len * wid;
       
    }
    
    //public double calculateAreaCircle(){
        //return 0;
    //}
    
//    public double calculateAreaTriangle() {
//        return 0;
//    }
}
