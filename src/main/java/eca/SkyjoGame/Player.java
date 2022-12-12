package eca.SkyjoGame;

import java.util.ArrayList;

public class Player {
    private String name;
    private int points = 0;
    private ArrayList<Card> playercards;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        for (int i = 0; i < playercards.size(); i++){
            points = points + playercards.get(i).getValue;

        }
        return points;
    }

    public String showPoints(){
        int countVisibility = 0;

        for (int i = 0; i < playercards.size(); i++){
            Card cardToCount = playercards.get(i);

            if (cardToCount.getVisible == 0){
                points = points + cardToCount.getValue;
            } else {
                countVisibility++;
            }
        }

        if (countVisibility != 0){
            return "" + points + " " + countVisibility + " x ?";
        } else {return "" + points;}
    }

    public Card swapCard(Card toSwapCard, Card pickedCard){

    }
}
