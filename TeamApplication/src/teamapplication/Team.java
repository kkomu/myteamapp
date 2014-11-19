/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamapplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kyosti
 */
public class Team {
    Coach coach;
    List<Player> players;

    public Team() {
        coach = new Coach("Pete DeBoer",this);
        players = new ArrayList<>();
    }

    public Coach getCoach() {
        return coach;
    }
    
    public void addPlayerToTeam(Player player) {
        players.add(player);
    }
    
    public void getPlayers() {
        int index = 0;
        Iterator<Player> pls = players.iterator();
        
        while(pls.hasNext()) {
            System.out.printf("Joukkueessa: %s\n", pls.next().getName());
            index++;
        }
        System.out.printf("Pelaajia: %d\n",index);
    }
    
}
