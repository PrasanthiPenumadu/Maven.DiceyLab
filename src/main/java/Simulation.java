
public class Simulation {

    Dice dice;
    int numberOfDice;
    int maxCount;
    int numberOfRolls;
    Bins bin;


    public Simulation(int nDice, int mCount) {
        this.dice = new Dice(nDice);
        this.maxCount = nDice * 6;
        this.numberOfRolls = mCount;
        this.numberOfDice = nDice;
    }

    public void trackBins() {


        bin = new Bins(numberOfDice, maxCount);

    }

    public int [] runSimulation() {
        for (int x = 0; x < numberOfRolls; x++) {
            int i = dice.tossAndSum();
            bin.res[i - numberOfDice] = bin.res[i - numberOfDice] + 1;//storing no.of occurances of i value in bin[0]
        }return bin.res;
    }

    public void printResults() {

        int j = 0;
        String star = "***********************************";
        System.out.println("***************************************************************");
        System.out.println("         Simulation of " + (maxCount / 6) + " dice tossed for " + numberOfRolls + " times.");
        System.out.println("***************************************************************");
        int max = 1;
        for (int i = 0; i < bin.res.length; i++) {
            max= bin.res[i] < max ? max : bin.res[i];
        }
        double m = 0.00;
        for (int i = 0; i < bin.res.length; i++) {
            j = (bin.res[i] * 14) / max;

            m = (double) bin.res[i ] / numberOfRolls;
            System.out.printf("%4d  : %10d:  %4.2f ", i+numberOfDice, bin.res[i], m);
            System.out.println(star.substring(0, j));
        }
        System.out.println("***************************************************************");
    }
}






