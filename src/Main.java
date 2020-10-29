public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 5; i++) {
            Runner runner=new Runner("Runner "+i);
            runner.setNextRunner(i+1);
            runner.start();
            runner.join();

        }
        System.out.println("Runner 5 берет палочку");
        System.out.println("Runner 5 бежит к финишу");
        System.out.println("Runner 5 бежит к Runner 4");
        

        for (int i = 4; i > 1; i--) {
            Runner runner = new Runner("Runner " +i);
            runner.setNextRunner(i-1);
            runner.start();
            runner.join();


        }
        System.out.println("Runner 1 берет палочку");
    }
}
