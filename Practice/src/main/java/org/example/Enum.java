package org.example;

enum Colour {
    RED(10 ,20),
    GREEN(30, 40),
    BLACK(50,60),
    BLUE(70, 80);
    int colorSum;
    private Colour(int a, int b){
        colorSum = a +  b;
    }
    int getSum(){
        return colorSum;
    }
}

public class Enum {
    public static void main(String[] args) {
        for (Colour c : Colour.values())  {
            System.out.println("COLOUR NAME - " + c + ", Color Sum = "+c.getSum());
        }
    }
}


