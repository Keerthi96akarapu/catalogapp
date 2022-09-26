package com.keerthi.category;

import java.util.ArrayList;

public class Sale {
    private Integer productId;
    private Integer leafCategoryId;
    private Integer primaryCategoryId;
    private Double amount;
    private Long quantity;

    public Integer getProductId() {
        return productId;
    }

    public Integer getLeafCategoryId() {
        return leafCategoryId;
    }

    public Integer getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public Double getAmount() {
        return amount;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setLeafCategoryId(int leafCategoryId) {
        this.leafCategoryId = leafCategoryId;
    }

    public void setPrimaryCategoryId(int primaryCategoryId) {
        this.primaryCategoryId = primaryCategoryId;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Sale( Integer productId, Integer leafCategoryId, Integer primaryCategoryId, Double amount, Long quantity) {
        this.productId = productId;
        this.leafCategoryId = leafCategoryId;
        this.primaryCategoryId = primaryCategoryId;
        this.amount = Double.valueOf(amount);
        this.quantity = Long.valueOf(quantity);
    }

    public Sale() {
        super();
    }

    @Override
    public String toString() {
        return "Sale{" +
                "productId=" + productId +
                ", leafCategoryId=" + leafCategoryId + '\'' +
                ", primaryCategoryId=" + primaryCategoryId +
                ", amount=" + amount +
                ", quantity=" + quantity +
                "}";
    }
}