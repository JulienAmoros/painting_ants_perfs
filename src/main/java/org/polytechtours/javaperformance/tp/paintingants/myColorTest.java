package org.polytechtours.javaperformance.tp.paintingants;

import static org.junit.jupiter.api.Assertions.*;

class myColorTest {
    @org.junit.jupiter.api.Test
    void constructor() {
        myColor color;
        color = new myColor(0, 0, 10);
        assertEquals(10, color.color);
        color = new myColor(0, 1, 0);
        assertEquals(256, color.color);
        color = new myColor(1, 0, 0);
        assertEquals(65536, color.color);
    }

    @org.junit.jupiter.api.Test
    void getRed() {
        myColor color = new myColor(120,15, 10);
        assertTrue(color.getRed() == 120);
    }

    @org.junit.jupiter.api.Test
    void getGreen() {
        myColor color = new myColor(120,15, 10);
        assertTrue(color.getGreen() == 15);
    }

    @org.junit.jupiter.api.Test
    void getBlue() {
        myColor color = new myColor(120,15, 10);
        assertEquals(10, color.getBlue());
    }

    @org.junit.jupiter.api.Test
    void setRed() {
        myColor color = new myColor(0,0, 0);
        color.setRed(10);
        assertEquals(10, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @org.junit.jupiter.api.Test
    void setGreen() {
        myColor color = new myColor(0,0, 0);
        color.setGreen(10);
        assertEquals(0, color.getRed());
        assertEquals(10, color.getGreen());
        assertEquals(0, color.getBlue());
    }

    @org.junit.jupiter.api.Test
    void setBlue() {
        myColor color = new myColor(0,0, 0);
        color.setBlue(10);
        assertEquals(0, color.getRed());
        assertEquals(0, color.getGreen());
        assertEquals(10, color.getBlue());
    }

}