package com.patterns.iterator.exercise;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        for(Iterator iter = productCatalog.getIterator(); iter.hasNext();){
            String productCatalogs = (String)iter.next();
            System.out.println("productCatalog : " + productCatalogs);
        }
    }
}
