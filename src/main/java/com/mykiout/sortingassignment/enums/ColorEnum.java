
package com.mykiout.sortingassignment.enums;
/**
 * Creation of all the color enums requiered for the assignment
 * @author Hp
 */
public enum ColorEnum {
    
    RED(5.0),
    ORANGE(6.0),
    YELLOW(3.0),
    GREEN(4.0),
    BLUE(1.5),
    INDIGO(4.5),
    VIOLET(7.8);
    
    private double price;

    private ColorEnum(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
