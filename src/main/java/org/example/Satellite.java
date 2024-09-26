package org.example;

/**
 * Represents a satellite orbiting a planet.
 */
public class Satellite extends Planet {
    /**
     * Constructs a new Satellite object.
     *
     * @param mass The mass of the satellite.
     * @param name The name of the satellite.
     */
    public Satellite(double mass, String name) {
        super(mass, name, null);
    }
}
