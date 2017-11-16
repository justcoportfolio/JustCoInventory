package com.github.justcoportfolio.justcoinventory;

/**
 * A model class for an item in inventory.
 * 
 * @author Justin
 */
public class InventoryItem {
    
    private String productCode;
    private String name;
    private String description;
    private String location;
    private UnitOfMeasure unitOfMeasure;
    private long unitsOnHand;
    
    /**
     * Constructor for an InventoryItem object.
     * 
     * @param productCode The productCode to set to the object
     * @param name The name to set to the object
     * @param description The description to set to the object
     * @param location The location to set to the object
     * @param unitOfMeasure The unitOfMeasure to set to the object
     * @param unitsOnHand The unitsOnHand to set to the object
     */
    public InventoryItem(String productCode, String name, String description,
                         String location, UnitOfMeasure unitOfMeasure,
                         long unitsOnHand){
        
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.location = location;
        this.unitOfMeasure = unitOfMeasure;
        this.unitsOnHand = unitsOnHand;
    } 
    
    /**
     * Accessor for the productCode field
     * 
     * @return the productCode
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Mutator for the productCode field
     * 
     * @param productCode the productCode to set
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * Accessor for the name field
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Mutator for the name field
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Accessor for the description field
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Mutator for the description field
     * 
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Accessor for the location field.
     * 
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Mutator for the location field
     * 
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Accessor for the unitOfMeasure field
     * 
     * @return the unitOfMeasure
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Mutator for the unitOfMeasure field
     * 
     * @param unitOfMeasure the unitOfMeasure to set
     */
    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    /**
     * Accessor for the unitsOnHand field
     * 
     * @return the unitsOnHand
     */
    public long getUnitsOnHand() {
        return unitsOnHand;
    }

    /**
     * Mutator for the unitsOnHand field
     * 
     * @param unitsOnHand the unitsOnHand to set
     */
    public void setUnitsOnHand(long unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }
}
