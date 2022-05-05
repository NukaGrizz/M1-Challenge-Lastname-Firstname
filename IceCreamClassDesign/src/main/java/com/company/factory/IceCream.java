package com.company.factory;

import java.util.List;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private double productionTime;
    private List<String> ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, double productionTime, List<String> ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public double getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(double productionTime) {
        this.productionTime = productionTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    //calculate profit per
    public double calculateProfitPerUnit(){
        return this.salePrice - this.productionCost;
    }
    //calculate production amount per set of provided time
    public double calculateAmountProducedOverTime(double timeAllotedForProduction){
        double resultingProduction = timeAllotedForProduction / this.productionTime;
        return resultingProduction;
    }
    //purchase price of multiple
    public double calculateTotalPriceOfMultipleScoops(double totalNumberOfScoops){
        double resultingPrice = totalNumberOfScoops * this.salePrice;
        return resultingPrice;
    }
}
