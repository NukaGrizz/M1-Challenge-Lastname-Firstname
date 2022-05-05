package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    private com.company.factory.IceCream iceCreamFactory;
    private com.company.pointofsale.IceCream iceCreamPOS;
    private List<String> ingredients;

    @Before
    public void setUp() {
       ingredients = new ArrayList<>(Arrays.asList("vanilla icecream", "Chocolate Syrup", "mixed nuts"));
       iceCreamFactory = new com.company.factory.IceCream("RockyRoad", 1.50,0.25,0.01, ingredients);
       iceCreamPOS = new com.company.pointofsale.IceCream("RockyRoad",2.99, 1, 100);
    }

    //FactoryTests
    @Test
    public void shouldGetFactoryIceCreamInfo(){
        assertEquals("RockyRoad",iceCreamFactory.getFlavor());
        assertEquals(1.50,iceCreamFactory.getSalePrice(), .01);
        assertEquals(0.25,iceCreamFactory.getProductionCost(), .01);
        assertEquals(0.01, iceCreamFactory.getProductionTime(), .01);
        assertEquals(ingredients, iceCreamFactory.getIngredients());
    }

    @Test
    public void shouldCalculateProfitPerUnitOfFactoryIceCream() {
        assertEquals(1.25, iceCreamFactory.calculateProfitPerUnit(), .01);
    }

    @Test
    public void shouldCalculateAmountProducedOverProvidedPeriodOfTimeForFactoryIceCream(){
        assertEquals(100,iceCreamFactory.calculateAmountProducedOverTime(1),.01);
    }

    @Test
    public void shouldCalculateTotalPriceOfMultipleScoopsForFactoryIceCream(){
        assertEquals(9,iceCreamFactory.calculateTotalPriceOfMultipleScoops(6),.001);
    }

    //PointOfSaleTests
    @Test
    public void shouldGetPointOfSaleIceCreamInfo(){
        assertEquals("RockyRoad",iceCreamPOS.getFlavor());
        assertEquals(2.99,iceCreamPOS.getPrice(), .01);
        assertEquals(1,iceCreamPOS.getScoops(), .01);
        assertEquals(100, iceCreamPOS.getQuantityRemaining(), .01);

    }

    @Test
    public void shouldMakeChangeForSale(){
        assertEquals(2.01,iceCreamPOS.makeChangeForSale(5.00),.01);
    }

    @Test
    public void shouldProvidePriceForRequestedNumberOfScoops(){
        assertEquals(14.95,iceCreamPOS.priceForRequestedNumberOfScoops(5), .01);
    }

    @Test
    public void shouldReduceThenRefillQuanityRemaining(){
        iceCreamPOS.setQuantityRemaining(0);
        assertEquals(0,iceCreamPOS.getQuantityRemaining(),.01);
        assertEquals("We have refilled our stock of RockyRoad to 100 scoops!!",iceCreamPOS.refillQuanityRemaining());
        assertEquals(100,iceCreamPOS.getQuantityRemaining(),.01);
    }

}
