import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void getBin() {
    boolean b=false;

        Bins bins = new Bins(2, 12);
        bins.runAndTrackBin(1000000);
        int j = bins.getBin(10);
        if (j < 90000 && j > 80000) b = true;
        Assert.assertEquals(true, b);



}
}