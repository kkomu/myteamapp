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
public class TeamApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team team = new Team();
                
        new Center(team.getCoach(),"Travis Zajac");
        new Center(team.getCoach(),"Adam Henrique");
        new Center(team.getCoach(),"Jacob Josefsson");
        new Center(team.getCoach(),"Stephen Gionta");
        new Center(team.getCoach(),"Dainius Zubrus");
        new LeftWing(team.getCoach(),"Mike Cammalleri");
        new LeftWing(team.getCoach(),"Patrik Elias");
        new LeftWing(team.getCoach(),"Tuomo Ruutu");
        new LeftWing(team.getCoach(),"Ryane Clowe");
        new LeftWing(team.getCoach(),"Damien Brunner");
        new RightWing(team.getCoach(),"Jaromir Jagr");
        new RightWing(team.getCoach(),"Michael Ryder");
        new RightWing(team.getCoach(),"Martin Havlat");
        new RightWing(team.getCoach(),"Steve Bernier");
        new RightWing(team.getCoach(),"Jordin Tootoo");
        new Defence(team.getCoach(),"Andy Greene");
        new Defence(team.getCoach(),"Damon Severson");
        new Defence(team.getCoach(),"Adam Larsson");
        new Defence(team.getCoach(),"Eric Gelinas");
        new Defence(team.getCoach(),"Jon Merrill");
        new Defence(team.getCoach(),"Marek Zidlicky");
        new Defence(team.getCoach(),"Seth Helgeson");
        new Goalie(team.getCoach(),"Cory Schneider");
        new Goalie(team.getCoach(),"Keith Kinkaid");
        new Goalie(team.getCoach(),"Scott Clemmensen");
        
        // Coach trains & constructs the team
        while (!team.getCoach().constructTeam()) {
            System.out.println("Not good enough, lets train more!");
            team.getCoach().exerciseAll();
        }
        
        // Finally the team is ready. Let's sew who made in it
        team.getPlayers();
        
        
    }
    
}
