public class Runner extends Thread {


    public Runner(String s) {
        super(s);
    }

    private int nextRunner;
    public int index;

    public void setNextRunner(int nextRunner) {
        this.nextRunner = nextRunner;
    }

    public int getNextRunner() {
        return nextRunner;
    }

    public void run() {
        if (index == 0) {
            System.out.println(this.getName() + " берет палочку ");
            System.out.println(this.getName() + " бежит к Runner " + this.getNextRunner());

        } else {
            System.out.println(this.getName() + " берет палочку ");
            if (getNextRunner()+1==5){
                System.out.println(this.getName() + " бежит к финишу ");

            }
            System.out.println(this.getName() + " бежит к Runner: " + this.getNextRunner());
        }


    }
}
