package com.gyc.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent component) {
        items.add(component);
    }

    @Override
    public void remove(CatalogComponent component) {
        items.remove(component);
    }

    @Override
    public String getName(CatalogComponent component) {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent component:items){
            if (this.level!=null){
                for (int i=0;i<this.level;i++){
                    System.out.print(" ");
                }
            }
            component.print();
        }
    }
}
