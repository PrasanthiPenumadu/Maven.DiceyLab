
public class Simulation {

    int numberOfDice;
    int maxCount;
    int numberOfRolls;
    Bins bin;


    public Simulation(int nDice, int mCount) {

        this.maxCount = nDice * 6;
        this.numberOfRolls = mCount;
        this.numberOfDice = nDice;
        bin = new Bins(nDice, maxCount);
    }


    public void runSimulation() {


            bin.runAndTrackBin(numberOfRolls);

    }

    public void printResults() {

        int j = 0;
        String star = "***********************************";
        System.out.println("***************************************************************");
        System.out.println("         Simulation of " + numberOfDice + " dice tossed for " + numberOfRolls + " times.");
        System.out.println("***************************************************************");
        int max = 1;
        for (int i = 0; i < bin.resultArray.length; i++) {
            max = bin.resultArray[i] < max ? max : bin.resultArray[i];
        }
        double m = 0.00;
        for (int i = 0; i < bin.resultArray.length; i++) {
            j = (bin.resultArray[i] * 14) / max;

            m = (double) bin.resultArray[i] / numberOfRolls;
            System.out.printf("%4d  : %10d:  %4.2f ", i + numberOfDice, bin.resultArray[i], m);
            System.out.println(star.substring(0, j));
        }
        System.out.println("***************************************************************");
    }
}






