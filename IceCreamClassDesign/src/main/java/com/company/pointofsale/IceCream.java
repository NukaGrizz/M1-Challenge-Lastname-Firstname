package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private int scoops;
    private int quantityRemaining;

    public IceCream(String flavor, double price, int scoops, int quantityRemaining) {
        this.flavor = flavor;
        this.price = price;
        this.scoops = scoops;
        this.quantityRemaining = quantityRemaining;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

    public int getQuantityRemaining() {
        return quantityRemaining;
    }

    public void setQuantityRemaining(int quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }

    //make change for sale of icecream
    public double makeChangeForSale(double payment) { return payment - this.price;}

    //price for requested quanity
    public double priceForRequestedNumberOfScoops(int scoopsRequested) {return scoopsRequested * this.price;}

    //refill quanity remaining
    public String refillQuanityRemaining() {
        this.quantityRemaining = 100;
        return "We have refilled our stock of "+ this.flavor + " to " + this.quantityRemaining + " scoops!!";
    }

}
