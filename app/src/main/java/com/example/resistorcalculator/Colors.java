package com.example.resistorcalculator;

public class Colors {

    public String[] valueColorNames = {
            "black", "brown",
            "red", "orange",
            "yellow", "green",
            "blue", "purple",
            "gray", "white"
    };

    public String[] multiplierColorNames = {
            "black", "brown",
            "red", "orange",
            "yellow", "green",
            "blue", "purple",
            "gray", "white",
            "gold", "silver"
    };

    public String[] toleranceColorNames = {
            "brown", "red",
            "green", "blue",
            "purple", "gray",
            "gold", "silver"
    };

    public String[] coefficientColorNames = {
            "gray", "brown",
            "red", "orange",
            "blue", "purple"
    };

    public int[] valueBANDColor = {
            0x000000, 0x91672C,
            0xFF0000, 0xFF6600,
            0xFFFF00, 0x00FF00,
            0x2196F3, 0x7F00FF,
            0x808080, 0xFFFFFF
    };


    public int[] multiplierBANDColor = {
            0x000000, 0x91672C,
            0xFF0000, 0xFF6600,
            0xFFFF00, 0x00FF00,
            0x2196F3, 0x7F00FF,
            0x808080, 0xFFFFFF,
            0xD4AF37, 0xBEC2CB
    };

    public int[] toleranceBANDColor = {
            0x91672C, 0xFF0000,
            0x00FF00, 0x2196F3,
            0x7F00FF, 0x808080,
            0xD4AF37, 0xBEC2CB
    };

    public int[] coefficientBANDColor = {
            0x808080, 0x654321,
            0xFF0000, 0xFF6600,
            0x2196F3, 0x7F00FF,
    };

    public Float[] multiplierBANDValue = {
            1f, 10f,
            100f, 1000f,
            10000f, 100000f,
            1000000f, 10000000f,
            100000000f, 1000000000f,
            0.1f, 0.01f
    };

    public Float[] toleranceBANDValue = {
            1f, 2f,
            0.5f, 0.25f,
            0.1f, 0.05f,
            5f, 10f
    };

    public int[] coefficientBANDValue = {
            100, 50,
            15, 25,
            10, 5
    };

}
