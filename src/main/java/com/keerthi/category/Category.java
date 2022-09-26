package com.keerthi.category;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Category {

    private Integer id;
    private String name;
    private ArrayList<String> children = new ArrayList<>();
    private long totalSale;
    private long totalQuantity;

    public Category(Integer id, String name, List<Category> category){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<String> children) {
        this.children = children;
    }

    public long getTotalSale() {
        return totalSale;
    }

    public void setTotalSale(long totalSale) {
        this.totalSale = totalSale;
    }

    public long getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @Override
        public String toString () {
            return "Category{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", children=" + children +
                    ", totalSales=" + totalSale +
                    ", totalQuantity=" + totalQuantity +
                    "}";
        }
    }
