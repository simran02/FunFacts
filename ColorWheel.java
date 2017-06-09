package com.example.sk.facts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by sk on 1/11/17.
 */
public class ColorWheel {
    //Fields (member variables)- Properties about the objects
    private String[] mcolor = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };


    //methods - Actions that object can take
    public int getColor() {
        //the button was clicked, so update the fact TextView with new fact.
        String color;
        //Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mcolor.length);
        color = mcolor[randomNumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;


    }
}

