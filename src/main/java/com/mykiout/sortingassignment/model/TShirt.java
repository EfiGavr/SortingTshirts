package com.mykiout.sortingassignment.model;

import com.mykiout.sortingassignment.enums.ColorEnum;
import com.mykiout.sortingassignment.enums.FabricEnum;
import com.mykiout.sortingassignment.enums.SizeEnum;

public class TShirt {

    private ColorEnum color;
    private SizeEnum size;
    private FabricEnum fabric;
    private double price;

    /**
     * We used only one constructor because we need only color, fabric and size
     * to create a TShirt instance
     *
     * @param color :The color in ColorEnum we need to make the TShirt instance
     * @param size :The size in SizeEnum we need to make the TShirt instance
     * @param fabric :The fabric in FabricEnum we need to make the TShirt
     * instance
     */
    public TShirt(ColorEnum color, SizeEnum size, FabricEnum fabric) {
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    /**
     * We put this method here instead of a seperate class just to minimize
     * comlexity depending on the specifications of the assignment.
     *
     * @return
     */
    public double getPrice() {
        return this.color.getPrice()
                + this.fabric.getPrice()
                + this.size.getPrice();
    }

    /**
     *Returns the value of the color enum
     * @return
     */
    public ColorEnum getColor() {
        return color;
    }

    /**
     *Set or update the value of the color enum
     * @param color
     */
    public void setColor(ColorEnum color) {
        this.color = color;
    }

    /**
     *Returns the value of the size enum
     * @return
     */
    public SizeEnum getSize() {
        return size;
    }

    /**
     *Set or update the value of the size enum
     * @param size
     */
    public void setSize(SizeEnum size) {
        this.size = size;
    }

    /**
     *Returns the value of the fabric enum
     * @return
     */
    public FabricEnum getFabric() {
        return fabric;
    }

    /**
     *Set or update the value of the fabric enum
     * @param fabric
     */
    public void setFabric(FabricEnum fabric) {
        this.fabric = fabric;
    }

    @Override
    public String toString() {
        return size.name()+ " - " + color.name()  + " - " + fabric.name() + " - " + getPrice();
    }
    
    

}
