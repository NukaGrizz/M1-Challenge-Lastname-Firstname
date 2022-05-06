package com.company;


import com.company.composition.Address;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer testCustomer;

    @Before
    public void SetUp(){
        testCustomer = new Customer("Joe", "Tremols", "company@company.com","111-111-1111",true);
        Address billingAddress = new Address("305 South", "unit D","Miami","Florida","33155");
        Address shippingAddress = new Address("555 South", "unit B","Atlanta","Georgia","33166");
        testCustomer.setBillingAddress(billingAddress);
        testCustomer.setShippingAddress(shippingAddress);
    }

    @Test
    public void shouldGetTestCustomerClassData(){
        assertEquals("Joe",testCustomer.getFirstName());
        assertEquals("Tremols",testCustomer.getLastName());
        assertEquals("company@company.com", testCustomer.getEmail());
        assertEquals("111-111-1111",testCustomer.getPhoneNumber());
        assertEquals(true,testCustomer.isRewardsMember());
    }

    @Test
    public void shouldGetTestCustomerBillingAddressData(){
        assertEquals("305 South",testCustomer.getBillingAddress().getStreet1());
        assertEquals("unit D",testCustomer.getBillingAddress().getStreet2());
        assertEquals("Miami",testCustomer.getBillingAddress().getCity());
        assertEquals("Florida",testCustomer.getBillingAddress().getState());
        assertEquals("33155",testCustomer.getBillingAddress().getZipcode());
    }

    @Test
    public void shouldGetTestCustomerShippingAddressData(){
        assertEquals("555 South",testCustomer.getShippingAddress().getStreet1());
        assertEquals("unit B",testCustomer.getShippingAddress().getStreet2());
        assertEquals("Atlanta",testCustomer.getShippingAddress().getCity());
        assertEquals("Georgia",testCustomer.getShippingAddress().getState());
        assertEquals("33166",testCustomer.getShippingAddress().getZipcode());
    }

    @Test
    public void shouldSetTestCustomerClassDataToNewValues(){
        testCustomer.setFirstName("John");
        assertEquals("John",testCustomer.getFirstName());
        testCustomer.setLastName("Boy");
        assertEquals("Boy",testCustomer.getLastName());
        testCustomer.setEmail("company@gmail.com");
        assertEquals("company@gmail.com", testCustomer.getEmail());
        testCustomer.setPhoneNumber("222-222-2222");
        assertEquals("222-222-2222",testCustomer.getPhoneNumber());
        testCustomer.setRewardsMember(false);
        assertEquals(false,testCustomer.isRewardsMember());
    }

    @Test
    public void shouldSetTestCustomerBillingAddressDataToNewValues(){
        testCustomer.getBillingAddress().setStreet1("666 deep south");
        assertEquals("666 deep south",testCustomer.getBillingAddress().getStreet1());
        testCustomer.getBillingAddress().setStreet2("Unit 2000");
        assertEquals("Unit 2000",testCustomer.getBillingAddress().getStreet2());
        testCustomer.getBillingAddress().setCity("NewYork");
        assertEquals("NewYork",testCustomer.getBillingAddress().getCity());
        testCustomer.getBillingAddress().setState("NewYork");
        assertEquals("NewYork",testCustomer.getBillingAddress().getState());
        testCustomer.getBillingAddress().setZipcode("55555");
        assertEquals("55555",testCustomer.getBillingAddress().getZipcode());
    }

    @Test
    public void shouldSetTestCustomerShippingAddressDataToNewValues(){
        testCustomer.getShippingAddress().setStreet1("777 deep north");
        assertEquals("777 deep north",testCustomer.getShippingAddress().getStreet1());
        testCustomer.getShippingAddress().setStreet2("unit h");
        assertEquals("unit h",testCustomer.getShippingAddress().getStreet2());
        testCustomer.getShippingAddress().setCity("Denver");
        assertEquals("Denver",testCustomer.getShippingAddress().getCity());
        testCustomer.getShippingAddress().setState("Colorado");
        assertEquals("Colorado",testCustomer.getShippingAddress().getState());
        testCustomer.getShippingAddress().setZipcode("80808");
        assertEquals("80808",testCustomer.getShippingAddress().getZipcode());
    }









}