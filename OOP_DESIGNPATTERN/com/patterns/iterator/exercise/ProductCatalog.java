package com.patterns.iterator.exercise;


public class ProductCatalog {
    private final String[] productCatalog = {"maytinh" , "dienthoai" ,"tulanh" , "tivi"};


    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            if (index < productCatalog.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return productCatalog[index++];
            }
            return null;
        }
    }
}