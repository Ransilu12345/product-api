// Line 1: A PhysicalProduct IS-A Product because it inherits the properties and behaviors of the Product class
// Line 2: 

package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private Double weightKg;
    private String dimensions;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id, String name, Double price, Double weightKg, String dimensions){
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public Double getWeightKg(){
        return weightKg;
    }

    public String getDimensions(){
        return dimensions;
    }

    public void setWeightKg(Double weightKg){
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }
}
