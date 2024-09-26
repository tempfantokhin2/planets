package org.example;

public class Planet {
    double mass;
    String name;
    Satellite[] satellites;

    @Override
    public String toString() {
        return "planet[m=" + mass + ",n=" + name + "]";
    }

    public Planet(double mass, String name, Satellite[] satellites) {
        this.mass = mass;
        this.name = name;
        this.satellites = satellites;
    }

    public int getSatelliteCount() {
        if (satellites == null) return 0;
        return satellites.length;
    }
}
