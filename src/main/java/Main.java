public class Main {
    public static void main(String args[]){
        Bins results=new Bins(2, 12);
        //Integer numberOfTens=results.getBin(10);
       // System.out.println(numberOfTens);
       // System.out.println(results.incrementBin(10));
        Simulation sim=new Simulation(2,1000000);
    sim.runSimulation();
    sim.printResults();

    }
}
