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
public class Center extends Player implements Exercise {
    private int defaultExerciseDuration = 8;
    //private Coach coach;
    private int centerSkill;
    
    public Center(Coach coach, String name) {
        super(name);
        coach.addPersonnel(this);
        this.centerSkill = (int) (Math.random()*10 + 1);
        //this.coach = coach;
    }
    
    @Override
    public int getSkills() {
        return centerSkill;
    }
    
    @Override
    public void doExercise(int duration) {
        int exerciseDuration;
        if (duration == 0) {
            exerciseDuration = defaultExerciseDuration;
        }
        else {
            exerciseDuration = duration;
        }
        System.out.printf("%s skill is %d and he starts training hard\n",super.getName(),centerSkill);
        try {
            Thread.sleep(exerciseDuration*100);
            if (Math.random() > 0.5) {
                centerSkill++;
                System.out.printf("Skill increased to %d\n",centerSkill);
            }
            else {
                System.out.println("Not a good day in training!");
            }
        }
        catch (InterruptedException e) {
            System.out.println("Energy level too low");
        }
        finally {
            //System.out.printf("%s exercise done!\n",super.getName());
        }
    }
    
}
