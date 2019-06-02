import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void getBin() {
    boolean b=false;
        int numberOfDice = 2;
        Bins bins = new Bins(2, 12);
        Simulation sims = new Simulation(2, 1000000);
       sims.trackBins();
       int arr[]=sims.runSimulation();
        int j = sims.bin.getBin(10);
if(j<90000&&j>80000)
    b=true;
        Assert.assertEquals(true, b);
    }


}