package com.bridgelabz.snakeladderday4;
import java.util.Random;
public class snakeandladder {

    public static void main(String[] args) {
        int start = 0;
        System.out.println("Starting position of player is: " + start);
        Random random = new Random();
        int roll = random.nextInt(7);
        System.out.println(roll);
    }
    }
