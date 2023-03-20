package com.galvanize;

public class Pokemon {
    private String name;
    private int dexNumb;
    private String type;
    private int baseHealth;
    private  boolean caught;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDexNumb() {
        return dexNumb;
    }

    public void setDexNumb(int dexNumb) {
        this.dexNumb = dexNumb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public void setBaseHealth(int baseHealth) {
        this.baseHealth = baseHealth;
    }

    public boolean isCaught() {
        return caught;
    }

    public void setCaught(boolean caught) {
        this.caught = caught;
    }
    public Pokemon(String name, int dexNumb, String type, int baseHealth, boolean caught) {
        this.name = name;
        this.dexNumb = dexNumb;
        this.type = type;
        this.baseHealth = baseHealth;
        this.caught = caught;
    }
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", dexNumb='" + dexNumb + '\'' +
                ", type=" + type + '\'' +
                ", baseHealth=" + baseHealth + '\'' +
                ", caught=" + caught +
                '}';
    }
}
