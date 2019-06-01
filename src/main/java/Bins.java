
public class Bins {

   Dice dice;
int maxCount;
int res[];
int res1;
    public Bins(int num1,int num2){
    this.dice=new Dice(num1);
    this.maxCount=num2;
    }
    public  int getBin(int i) {
            res = new int[maxCount];
            for (int x = 0; x < 1000; x++) {
                 i = dice.tossAndSum();
                res[i - 1] = res[i - 1] + 1;
            }
            res1=res[i];
            return res[i];
        }


    public int incrementBin(int inc){
    return res1+inc;
    }
}
