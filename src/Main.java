public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 5; i++) {
            Runner runner=new Runner("Runner "+i);
            runner.setNextRunner(i+1);
            runner.index=0;
            runner.start();
            runner.join();

        }

        for (int i = 5; i > 1; i--) {
            Runner runner = new Runner("Runner " +i);
            runner.setNextRunner(i-1);
            runner.index=1;
            runner.start();
            runner.join();


        }
        System.out.println("Runner 1 берет палочку");
    }
}
