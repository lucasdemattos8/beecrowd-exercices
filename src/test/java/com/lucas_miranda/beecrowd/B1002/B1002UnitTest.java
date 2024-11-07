package com.lucas_miranda.beecrowd.B1002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class B1002UnitTest {

    @Test
    @DisplayName("Should calculate area correctly for radius 2.00")
    public void shouldCalculateAreaForRadiusTwo() {
        Circle circle = new Circle();
        circle.setRadius(2.00);

        double expectedArea = 12.5664;
        double actualArea = circle.getArea();

        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    @DisplayName("Should calculate area correctly for radius 0.00")
    public void shouldCalculateAreaForZeroRadius() {
        Circle circle = new Circle();
        circle.setRadius(0.00);

        double expectedArea = 0.00;
        double actualArea = circle.getArea();

        assertEquals(expectedArea, actualArea, 0.0001);
    }

    @Test
    @DisplayName("Should calculate area correctly for large radius")
    public void shouldCalculateAreaForLargeRadius() {
        Circle circle = new Circle();
        circle.setRadius(1000.00);

        double expectedArea = 3141590.0;
        double actualArea = circle.getArea();

        assertEquals(expectedArea, actualArea, 0.0001);
    }
    
}
