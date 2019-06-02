public class Main {
    public static void main(String args[]) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
        System.out.println("Number of occurances of 10 : "+sim.bin.getBin(10));
    }
}
