package org.example;

/**
 * Represents a Planet.
 */
public class Planet extends CosmicBody {
    /**
     * Constructs a new Planet object.
     *
     * @param mass The mass of the planet.
     * @param name The name of the planet.
     * @param satellites An array of Satellite objects associated with this planet.
     */
    public Planet(double mass, String name, Satellite[] satellites) {
        super(mass, name, satellites);
    }
}
