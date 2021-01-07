package com.example.resistorcalculator;

public class Colors {

    String[] valueColorNames = {
            "black", "brown",
            "red", "orange",
            "yellow", "green",
            "blue", "purple",
            "gray", "white"
    };

    String[] multiplierColorNames = {
            "black", "brown",
            "red", "orange",
            "yellow", "green",
            "blue", "purple",
            "gray", "white",
            "gold", "silver"
    };

    String[] toleranceColorNames = {
            "black", "brown",
            "green", "blue",
            "purple", "gray",
            "gold", "silver"
    };

    String[] coefficientColorNames = {
            "gray", "brown",
            "red", "orange",
            "blue", "purple"
    };

    int[] valueBANDColor = {
            R.color.valueBlack, R.color.valueBrovn,
            R.color.valueRed, R.color.valueOrange,
            R.color.valueYellow, R.color.valueGreen,
            R.color.valueBlue, R.color.valueViolet,
            R.color.valueGray, R.color.valueWhite
    };

    int[] multiplierBANDColor = {
            R.color.valueBlack, R.color.valueBrovn,
            R.color.valueRed, R.color.valueOrange,
            R.color.valueYellow, R.color.valueGreen,
            R.color.valueBlue, R.color.valueViolet,
            R.color.valueGray, R.color.valueWhite,
            R.color.valueGold, R.color.valueSilver
    };

    int[] toleranceBANDColor = {
            R.color.valueBlack, R.color.valueBrovn,
            R.color.valueGreen, R.color.valueBlue,
            R.color.valueViolet, R.color.valueGray,
            R.color.valueGold, R.color.valueSilver
    };

    int[] coefficientBANDColor = {
            R.color.valueGray, R.color.valueBrovn,
            R.color.valueRed, R.color.valueOrange,
            R.color.valueBlue, R.color.valueViolet,
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
