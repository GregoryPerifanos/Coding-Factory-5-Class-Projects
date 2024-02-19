package gr.aueb.cf.ch15.products.service;

import gr.aueb.cf.ch15.products.model.IProduct;

public class Store {
    //Interface as composition.
    private IProduct product;

    //Dependency Injection - Inversion of Control. (IoC)
    public Store(IProduct product) {
        this.product = product;
    }

    public void purchase() {
        System.out.println("Product has been Sold.");
    }
}
