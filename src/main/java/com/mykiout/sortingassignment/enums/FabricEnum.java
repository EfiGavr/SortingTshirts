
package com.mykiout.sortingassignment.enums;
/**
 * Creation of all the size enums requiered for the assignment
 * @author Hp
 */
public enum FabricEnum {
    
    WOOL(7.0),
    COTTON(4.0),
    POLYESTER(2.0),
    RAYON(9.0),
    LINEN(6.5),
    CASHMERE(11.8),
    SILK(9.7);
    
    private double price;

    private FabricEnum(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    
}
