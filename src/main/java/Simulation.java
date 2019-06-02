
public class Simulation {

    Dice dice;
    int numberOfDice;
    int maxCount;
    int numberOfRolls;
    Bins results;


    public Simulation(int nDice, int mCount) {
        this.dice = new Dice(nDice);
        this.maxCount = nDice * 6;
        this.numberOfRolls = mCount;
        this.numberOfDice = nDice;
    }

    public void trackBins() {


        results = new Bins(numberOfDice, maxCount);

    }

    public void runSimulation() {
        for (int x = 0; x < numberOfRolls; x++) {
            int i = dice.tossAndSum();
            results.res[i - numberOfDice] = results.res[i - numberOfDice] + 1;//storing no.of occurances of i value in results[0]
        }
    }

    public void printResults() {

        int j = 0;
        String star = "***********************************";
        System.out.println("***************************************************************");
        System.out.println("         Simulation of " + (maxCount / 6) + " dice tossed for " + numberOfRolls + " times.");
        System.out.println("***************************************************************");
        int max = 1;
        for (int i = 0; i < results.res.length; i++) {
            max= results.res[i] < max ? max : results.res[i];
        }
        double m = 0.00;
        for (int i = 0; i < results.res.length; i++) {
            j = (results.res[i] * 14) / max;

            m = (double) results.res[i ] / numberOfRolls;
            System.out.printf("%4d  : %10d:  %4.2f ", i+numberOfDice, results.res[i], m);
            System.out.println(star.substring(0, j));
        }
        System.out.println("***************************************************************");
    }
}






