package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {
    protected int id;
    protected static int nextId = 1;
    protected String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // custom toString,and other methods:

    @Override
    public String toString() {
        return value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // Getters and Setters:


    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
