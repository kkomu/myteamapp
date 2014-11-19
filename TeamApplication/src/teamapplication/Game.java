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
public class Game {
    private int homeTeamGoals = 0;
    private int visitingTeamGoals = 0;
    
    
    public void startGame() {
        if (Math.random() > 0.5) {
            homeTeamGoals++;
            
        }
        else {
            visitingTeamGoals++;
        }
    }
}
