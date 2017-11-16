package com.github.justcoportfolio.justcoinventory;

/**
 * Defines the different inventory units of measure. These units are intended
 * to be defined on an InventoryItem as the unit at which the item is shipped
 * or sold. For example, if pencils are sold individually, the unit of measure
 * should be "EA", even though they may have been received in a Case. Note that
 * where applicable, units are measured in metric and not in imperial
 * 
 * @see InventoryItem
 * @author Justin
 */
public enum UnitOfMeasure {    
    
    BOX ("Boxes"),
    CASE ("Cases"),
    CTN ("Cartons"),
    PLT ("Pallets"),
    DOZ ("Dozens"),
    KG ("Kilograms"),
    GR ("Grams"),
    M ("Metres"),
    CM ("Centimetres"),
    BAG ("Bags"),
    EA ("Eaches");
    
    private final String name;
    
    /**
     * Constructor which sets the name of the enum
     * 
     * @param name The name of the enum
     */
    UnitOfMeasure(String name){
        this.name = name;
    }
    
    /**
     * Overrides the parent's (java.lang.Enum) toString method to return this 
     * name instead of the capitalized name of the enum
     * 
     * @return The name of the enum
     */
    @Override
    public String toString(){
        return this.name;
    }
}
