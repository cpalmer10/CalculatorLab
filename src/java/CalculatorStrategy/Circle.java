/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorStrategy;

/**
 *
 * @author Chris
 */
public class Circle implements CalculatorManager {
    @Override
    public double calculateArea(String length, String width, String radius, String sideA, String sideB, String sideC) {
        double len = Double.parseDouble(length);
        double wid = Double.parseDouble(width);
        
        return len * wid;
    }

    
    
}
