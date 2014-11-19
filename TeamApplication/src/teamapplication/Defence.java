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
public class Defence extends Player implements Exercise {
    private int defaultExerciseDuration = 3;
    
    private int defenceSkill;
    
    public Defence(Coach coach, String name) {
        super(name);
        coach.addPersonnel(this);
        this.defenceSkill = (int) (Math.random()*10 + 1);
    }
    
      @Override
    public int getSkills() {
        return defenceSkill;
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
        System.out.printf("%s skill is %d and he starts training hard\n",super.getName(),defenceSkill);
        try {
            Thread.sleep(exerciseDuration*100);
            if (Math.random() > 0.5) {
                defenceSkill++;
                System.out.printf("Skill increased to %d\n",defenceSkill);
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
