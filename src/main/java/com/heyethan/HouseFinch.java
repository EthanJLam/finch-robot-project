package com.heyethan;

import com.birdbrain.Finch;

public class HouseFinch extends Finch {
    /**
 * draws the box or the house of the house
 * @param - none
 * @return - none
 */
public void drawBox(){
    setMove("F",5,50);
    setTurn("R",90,50);
    setMove("F",5,50);
    setTurn("R",90,50);
    setMove("F",5,50);
    setTurn("R",90,50);
    setMove("F",5,50);
    setTurn("R",90,50);
    setMove("F",5,50);
}
    /**
 * draws the roof of the house
 * @param - none
 * @return - none
 */
public void drawRoof(){
    setTurn("R",45,50);
    setMove("F",5,50);
    setTurn("R",115,50);
    setMove("F",5,50);
}
}
