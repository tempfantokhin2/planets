package org.example;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This is the main class containing the program logic.
 */
public class Main {
    /**
     * The main entry point of the application showing example of using Planet objects
     * and tests sortPlanets()
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Print a simple greeting message
        System.out.println("Hello world!");

        // Create an ArrayList to store Planet objects
        ArrayList<Planet> testPlanets = new ArrayList<Planet>();

        // Define arrays of Satellite objects
        Satellite[] eggnogSatellites = {new Satellite(1, "test")};
        Satellite[] newEggnogSatellites = {new Satellite(1, "test"), new Satellite(1, "test")};

        // Add Planet objects to the testPlanets ArrayList
        testPlanets.add(new Planet(1, "Eggnog", eggnogSatellites));
        testPlanets.add(new Planet(2, "Mars", null));
        testPlanets.add(new Planet(3, "Destiny", null));
        testPlanets.add(new Planet(4, "Arrr Pirate planet", null));
        testPlanets.add(new Planet(5, "Rimworld", null));
        testPlanets.add(new Planet(6, "Eggnog 2", null));
        testPlanets.add(new Planet(7, "Eggnog 3", null));
        testPlanets.add(new Planet(8, "NewEggnog", newEggnogSatellites));

        // Print the initial state of testPlanets
        System.out.println(testPlanets.toString());

        // Call the sortPlanets function to sort the planets
        sortPlanets(testPlanets);

        // Print the sorted state of testPlanets
        System.out.println(testPlanets.toString());
    }

    /**
     * Sorts the given ArrayList of Planet objects using quicksort algorithm.
     *
     * @param planets The ArrayList of Planet objects to be sorted.
     */
    public static void sortPlanets(ArrayList<Planet> planets) {
        quickSortPlanets(planets, 0, planets.size() - 1);
    }

    /**
     * Recursive quicksort function for sorting Planet objects based on satellite count.
     *
     * @param planets The ArrayList of Planet objects to be sorted.
     * @param start   The starting index for the current partition.
     * @param end     The ending index for the current partition.
     */
    public static void quickSortPlanets(ArrayList<Planet> planets, int start, int end) {
        // Base case: If the partition size is 1 or less, return immediately
        if (end - start <= 1) return;

        // Set pivot element
        int pivotValue = planets.get(start).getSatelliteCount();
        int pivotIndex = start;
        int partitionIndex = start;

        // Partition the array
        for (int i = start + 1; i <= end; i++) {
            if (planets.get(i).getSatelliteCount() <= pivotValue) {
                // Swap elements to place lesser elements on the left
                partitionIndex++;
                Collections.swap(planets, partitionIndex, i);
            }
        }

        // Place pivot element in its final position
        Collections.swap(planets, partitionIndex, pivotIndex);

        // Recursively sort sub-partitions
        quickSortPlanets(planets, start, partitionIndex - 1);
        quickSortPlanets(planets, partitionIndex + 1, end);
    }
}

