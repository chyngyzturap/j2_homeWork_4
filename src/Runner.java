public class Runner extends Thread {


    public Runner(String s) {
        super(s);
    }

    private int nextRunner;

    public void setNextRunner(int nextRunner) {
        this.nextRunner = nextRunner;
    }

    public int getNextRunner() {
        return nextRunner;
    }

    public void run() {

            System.out.println(this.getName() + " берет палочку ");

            System.out.println(this.getName() + " бежит к Runner " +this.getNextRunner());

    }
}
