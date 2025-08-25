package com.hejie.store.carts;

public class CartEmptyException extends RuntimeException {
    public CartEmptyException() {
        super("Cart is empty");
    }
}
