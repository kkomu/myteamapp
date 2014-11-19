/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teamapplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author kyosti
 */
public class Coach {
    private String name;
    Team team;
    private List<Exercise> personnel;
   
    public Coach(String name, Team team) {
        this.name = name;
        this.team = team;
        personnel = new ArrayList<>();
    }
    
    public void addPersonnel(Exercise exe){
        personnel.add(exe);
    }
    
    public void exerciseAll() {
        Iterator<Exercise> iter = personnel.iterator();
        while(iter.hasNext()) {
            iter.next().doExercise(0);
        }
    }
    
    public void exercisePlayers(String playerType) {
        Iterator<Exercise> iter = personnel.iterator();
        
        while(iter.hasNext()) {
            Exercise exe = iter.next();
           
            switch(playerType) {
                case "Center":
                    exe.doExercise(1);
                    break;
                case "LeftWing":
                    exe.doExercise(2);
                    break;
                case "RightWing":
                    exe.doExercise(3);
                    break;
                case "Defence":
                    exe.doExercise(4);
                    break;
                case "Goalie":
                    exe.doExercise(5);
                    break;
                default:
                    System.out.println("Unknown player type");
           }
        }
    }
    
    public boolean constructTeam() {
        int requiredSkillLevel = 3;
        
        int centerCount=4;
        int defenceCount=6;
        int goalieCount=2;
        int leftWingCount=4;
        int rightWingCount=4;
        
        
        HashSet<Player> set = new HashSet<>();
        
        
        Iterator<Exercise> players = personnel.iterator();
        
        while(players.hasNext()) {
            Exercise exe = players.next();
            Player player = (Player)exe;
        
            if(exe.getSkills() >= requiredSkillLevel) {
                if(player instanceof Center) {
                    if (centerCount > 0) {
                        set.add((Player)player);
                        //team.addPlayerToTeam((Player)player);
                        //System.out.printf("%s makes it to the team\n",player.getName());
                        centerCount--;
                    }
                }
                else if(player instanceof LeftWing) {
                    if (leftWingCount > 0) {
                        set.add((Player)player);                        
                        //team.addPlayerToTeam((Player)player);
                        //System.out.printf("%s makes it to the team\n",player.getName());
                        leftWingCount--;
                    }
                }
                else if(player instanceof RightWing) {
                    if (rightWingCount > 0) {
                        set.add((Player)player);
                        //team.addPlayerToTeam((Player)player);
                        //System.out.printf("%s makes it to the team\n",player.getName());
                        rightWingCount--;
                    }
                }
                else if(player instanceof Defence) {
                    if (defenceCount > 0) {
                        set.add((Player)player);
                        //team.addPlayerToTeam((Player)player);
                        //System.out.printf("%s makes it to the team\n",player.getName());
                        defenceCount--;
                    }
                }
                else if(player instanceof Goalie) {
                    if (goalieCount > 0) {
                        set.add((Player)player);
                        //team.addPlayerToTeam((Player)player);
                        //System.out.printf("%s makes it to the team\n",player.getName());
                        goalieCount--;
                    }
                }
                else {
                    //TBD
                }
            }
            else {
                //System.out.printf("%s has to train more\n",player.getName());
            }
        }
        if(centerCount == 0 && rightWingCount == 0 && leftWingCount == 0 && defenceCount == 0 && goalieCount == 0) {
            System.out.println("Team is ready for season!");
            for(Player gomez: set) {
                team.addPlayerToTeam(gomez);
            }
            return true;
        }
        else {
            System.out.printf("Open positions in team: C:%d RW:%d LW:%d D:%d G:%d\n", centerCount,rightWingCount,leftWingCount,defenceCount,goalieCount);
            return false;
        }
        
    }
}
