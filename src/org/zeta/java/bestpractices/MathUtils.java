package org.zeta.java.bestpractices;

/**
 * Utility Class for Mathematical Operations
 */

public class MathUtils {
    private static final double PI = 3.14159;

    /**
     * Calculates the area of a circle.
     *
     * @param radius the radius of the circle
     * @return the area
     * @throws IllegalArgumentException if the radius is negative
     */

    public static double calculateCircleArea(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return PI * radius * radius;
    }
}
