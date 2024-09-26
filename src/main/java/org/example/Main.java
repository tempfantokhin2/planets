package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Planet> testPlanets = new ArrayList<Planet>();
        Satellite[] eggnogSatellites = {new Satellite(1, "test")};
        Satellite[] newEggnogSatellites = {new Satellite(1, "test"), new Satellite(1, "test")};
        testPlanets.add(new Planet(1, "Eggnog", eggnogSatellites));
        testPlanets.add(new Planet(2, "Mars", null));
        testPlanets.add(new Planet(3, "Destiny", null));
        testPlanets.add(new Planet(4, "Arrr Pirate planet", null));
        testPlanets.add(new Planet(5, "Rimworld", null));
        testPlanets.add(new Planet(6, "Eggnog 2", null));
        testPlanets.add(new Planet(7, "Eggnog 3", null));
        testPlanets.add(new Planet(8, "NewEggnog", newEggnogSatellites));

        System.out.println(testPlanets.toString());
        //sortPlanets(testPlanets);
        System.out.println(testPlanets.toString());
    }
    public static void sortPlanets(ArrayList<Planet> planets) {
        quickSortPlanets(planets, 0, planets.size()-1);
    }

    public static void quickSortPlanets(ArrayList<Planet> planets, int start, int end) {
        if (end-start <= 1) return;

        //set pivot
        int pivotValue = planets.get(start).getSatelliteCount();
        int pivotIndex = start;

        int partitionIndex = start;
        for (int i = start+1; i <= end; i++) {
            if(planets.get(i).getSatelliteCount() <= pivotValue) {
                //place lesser elements on the left
                partitionIndex++;
                Collections.swap(planets, partitionIndex, i);
            }
        }

        //place pivot element in between
        Collections.swap(planets, partitionIndex, pivotIndex);

        //call quick sort for both partitions
        quickSortPlanets(planets, start, partitionIndex-1);
        quickSortPlanets(planets, partitionIndex+1, end);

    }
}