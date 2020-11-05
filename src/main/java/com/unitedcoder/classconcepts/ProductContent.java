package com.unitedcoder.classconcepts;

public class ProductContent {private String productName;
    private String productCode;

    public ProductContent() {
    }

    public ProductContent(String productName, String productCode) {
        this.productName = productName;
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }
}
