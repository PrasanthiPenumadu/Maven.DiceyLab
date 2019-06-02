
public class Bins {


    int resultArray[];
    int numberOfDice;
    Dice dice;

    public Bins(int num1, int num2) {
        int num3 = num2 -num1+1;//array length for 2 to 12 12-2+1=11
        resultArray = new int[num3]; //build array of appropriate length
        this.numberOfDice = num1;
        dice = new Dice(numberOfDice);

    }

    public int getBin(int i) {

        return resultArray[i - numberOfDice]; //result of 10 stored in res[5] as i min value starts from 5,arr[0]
    }

    public void runAndTrackBin(int numberOfRolls) {
        for (int x = 1; x <= numberOfRolls; x++) {
            int i = dice.tossAndSum();
            resultArray[i - numberOfDice]++;//increments the no.of occurances of i 
        }
    }

    public int incrementBin(int inc) {

        return getBin(inc) + 10;
    }

}
