
package com.mykiout.sortingassignment.enums;
/**
 * Creation of all the size enums requiered for the assignment
 * @author Hp
 */
public enum SizeEnum {
    
    XS(3.0),
    S(4.0),
    M(5.0),
    L(6.0),
    XL(7.0),
    XXL(8.0),
    XXXL(9.0);
    
    private double price;

    private SizeEnum(double price) {
        this.price= price;
    }

    public double getPrice() {
        return price;
    }
    
    
}
