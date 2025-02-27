package Threads;

public class Talkative implements Runnable {
    private int nb;


    public Talkative(int nb) {
        this.nb = nb;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    @Override
    public void run() {
        System.out.println(100*nb);
    }

    public static void main(String[] args) {
        new Thread(new Talkative(1)).start();
        new Thread(new Talkative(2)).start();
        new Thread(new Talkative(3)).start();
        new Thread(new Talkative(3)).start();
        new Thread(new Talkative(4)).start();
        new Thread(new Talkative(5)).start();
        new Thread(new Talkative(6)).start();
        new Thread(new Talkative(7)).start();
        new Thread(new Talkative(8)).start();
        new Thread(new Talkative(9)).start();
        new Thread(new Talkative(10)).start();
    }

    // This is regarding the last question.
    // What I see is that I get all the answers at once,
    // which means that the multiplication is done 10 times all at the same time.
}
