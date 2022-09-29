package com.java_design_patterns.behavioral.strategy;

public class Animal {

    private String name;
    private Double height;
    private Double weight;
    private String sound;

    private Flying flyingType;

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(Double height) {
        if (height > 0) this.height = height;
    }

    public void setWeight(Double weight) {
        if (weight > 0) this.weight = weight;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setFlyingAbility(Flying newFlyingType) {
        this.flyingType = newFlyingType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" it sound is ").append(sound);
        sb.append(", the height is ").append(height);
        sb.append(" and the weight is ").append(weight);
        sb.append(", ").append(name);
        sb.append(" ").append(flyingType.Fly());
        return sb.toString();
    }
}
