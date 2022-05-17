package com.bridgelabz.snakeladderday4;
import java.util.Random;
public class snakeandladder {

    public static final int NO_PLAY = 0;
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int START = 0;


    public static void main(String[] args){
        int pos = 0;
        System.out.println("Starting position of player is: " + START);
        while(pos < 100){
            Random random = new Random();
            int roll = random.nextInt(7);
            System.out.println("Number on rolled dice is : " +roll);
            Random obj = new Random();
            int con = obj.nextInt(4);

            System.out.println("Condition: " +con);
            switch (con){
                case NO_PLAY:
                    System.out.println("New Position is: " + pos);
                    break;
                case LADDER:
                    pos = pos + roll;
                    if(pos <= 100)
                        System.out.println("New Position is: " + pos);
                    else{
                        pos = pos - roll;
                        System.out.println("Remains at same position: " + pos);
                    }
                    break;
                case SNAKE:
                    pos = pos - roll;
                    if (pos <= 100){
                        if (pos >= 0 ){
                            System.out.println("New Position is: " + pos);
                        }
                        else{
                            pos = 0;
                            System.out.println("New Position is: " + pos);
                        }
                    }
                    else{
                        System.out.println("New position is:" + pos);
                    }
                    break;
                default:
                    System.out.println("Default");
                    break;
            }
        }
        System.out.println();
        if (pos == 100)
            System.out.println("-------------------");
        System.out.println("    PLAYER WON THIS GAME...!!");
        System.out.println("-------------------");
    }
    }

