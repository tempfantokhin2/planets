package org.example;

/**
 * Represents a celestial body in our solar system.
 */
public class CosmicBody {
    //The mass of the planet.
    double mass;
    //The name of the planet.
    String name;
    //An array of Satellite objects associated with this planet.
    Satellite[] satellites;

    /**
     * Returns a string representation of the Planet object.
     *
     * @return A formatted string containing the planet's mass and name.
     */
    @Override
    public String toString() {
        return "planet[m=" + mass + ",n=" + name + "]";
    }

    /**
     * Constructs a new Planet object.
     *
     * @param mass The mass of the planet.
     * @param name The name of the planet.
     * @param satellites An array of Satellite objects associated with this planet.
     */
    public CosmicBody(double mass, String name, Satellite[] satellites) {
        this.mass = mass;
        this.name = name;
        this.satellites = satellites;
    }

    /**
     * Gets the number of satellites associated with this planet.
     *
     * @return The number of satellites if any, otherwise 0.
     */
    public int getSatelliteCount() {
        if (satellites == null) return 0;
        return satellites.length;
    }
}