package com.ntuc.fileio.serialization;

import java.io.Serializable;

public class Employee implements Serializable {

    // the UID is auto generated if ignored
    // manual creation of a UID for the objects
    // can be changed when the class changes to represent changes
    // private static final long serialVersionUID = 1L;

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }

}
