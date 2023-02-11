package com.xperience;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CartTest {

    @Test
    public void shouldAddItemToCart(){
        Cart cart = new Cart();
        cart.add("Shampoo",1);
        assertEquals(cart.getSize(),1);
    }
}
