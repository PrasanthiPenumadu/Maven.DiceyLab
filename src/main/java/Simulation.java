
import java.util.Random;

public class Simulation {

    Dice dice;
    int maxCount;
    int numberOfRolls;
    int results[];
    public Simulation(int nDice, int mCount) {
        this.dice = new Dice(nDice);
        this.maxCount = nDice * 6;
        this.numberOfRolls = mCount;
    }

    public void runSimulation() {
        results = new int[maxCount];
        for (int x = 0; x < numberOfRolls; x++) {
            int i = dice.tossAndSum();
            results[i-1] = results[i-1]+1;//storing no.of occurances of i value in results[0]
        }
    }

     public void printResults(){
         double j=0;
         String star="***********************************";
         System.out.println("***************************************************************");
         System.out.println("         Simulation of "+(maxCount/6)+" dice tossed for "+numberOfRolls+" times.");
         System.out.println("***************************************************************");
         for (int i = 2; i <=results.length ; i++) {
                if(results[i-1]>0)
                   j=results[i-1]*0.000001;
                System.out.printf("%4d  : %10d:  %4.2f  ",i, results[i-1],j);
             int k=(int)(j*100);
             System.out.println(star.substring(0,k));
            }
         System.out.println("***************************************************************");
        }
    }






