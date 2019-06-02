
public class Dice {
    int dies = 0;

    public Dice(int num) {
      this.dies = num ;

    }

    public int tossAndSum(){
        int toss = 0;
        for (int i =0 ; i < dies ; i++){
         toss = toss + ((int)(Math.random()*6) + 1);
        }
        return toss;
    }
}