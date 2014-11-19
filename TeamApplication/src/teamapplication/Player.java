/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamapplication;

/**
 *
 * @author kyosti
 */
public class Player {
    private String name;
    
    private double weight;
    private double height;
    
    private String shoots;
    private int birthYear;
    
    private int goals;
    private int assists;
    private int plusMinus;
    
     public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
