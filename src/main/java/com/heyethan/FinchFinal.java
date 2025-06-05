package com.heyethan;

import com.birdbrain.Finch;

public class FinchFinal {
    public static void main(String[] args) {
        HouseFinch bird = new HouseFinch();

        // What do you want the finch to do?

        bird.drawBox();
        bird.drawRoof();

        bird.stopAll();
        bird.disconnect();
    }

}