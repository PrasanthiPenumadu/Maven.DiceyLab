
public class Bins {


    int res[];
    int numberOfDice;
    int binres=0;
    public Bins(int num1, int num2) {
        int num3 = num2 - num1 + 1;//array length for 2 to 12 12-2+1=11
        res = new int[num3];
        this.numberOfDice = num1;

    }

    public int getBin(int i) {
        Integer numberOfTens=0;
 binres=res[i - numberOfDice];    //result of 10 stored in res[5] as i min value starts from 5
        numberOfTens=res[10-numberOfDice];
        System.out.println("number Of Tens"+numberOfTens);
        return res[i - numberOfDice];
    }
public int incrementBin(int inc){

      return binres+10;
}

}
