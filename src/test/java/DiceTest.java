import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void tossAndSum() {
        boolean b=false;
        Dice dice=new Dice(2);
int j=dice.tossAndSum();
if(j>=2&&j<=12)
     b=true;
        Assert.assertEquals(true, b);
    }
}