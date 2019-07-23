package com.tavisca.workshops.pratham.rover;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    void vectorInitializesWithStartPosition() {
        Vector r = new Vector(10, 10, 'N');
        assertEquals(10, r.x());
        assertEquals(10, r.y());
        assertEquals('N', r.direction());
    }

    @Test
    void vectorCanRotateLeftFromNorth() {
        Vector r = new Vector(10, 10, 'N');
        Vector newVector = r.turnLeft();
        assertEquals('W', newVector.direction());
    }

    @Test
    void vectorCanRotateLeftFromWest() {
        Vector r = new Vector(10, 10, 'W');
        Vector newVector = r.turnLeft();
        assertEquals('S', newVector.direction());
    }

    @Test
    void vectorCanRotateLeftFromSouth() {
        Vector r = new Vector(10, 10, 'S');
        Vector newVector = r.turnLeft();
        assertEquals('E', newVector.direction());
    }

    @Test
    void vectorCanRotateLeftFromEast() {
        Vector r = new Vector(10, 10, 'E');
        Vector newVector = r.turnLeft();
        assertEquals('N', newVector.direction());
    }
}
