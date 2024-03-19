package com.example.demo.domain;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Digimon implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String category;

    public Digimon (String id, String name, String category){
        super();
        this.id = id;
        this.name = name;
        this.category = category;


    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Digimon digimon)) return false;
        return Objects.equals(getName(), digimon.getName()) && Objects.equals(getCategory(), digimon.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCategory());
    }
}

