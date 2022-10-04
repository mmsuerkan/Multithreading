package BasicThreadHandling.JoiningThreads;

class Demonstration {
    public static void main( String args[] ) throws InterruptedException {

        ExecuteMe executeMe = new ExecuteMe();
        Thread innerThread = new Thread(executeMe);
        innerThread.setDaemon(true);
        innerThread.start();
        innerThread.join();

        System.out.println("Main thread exiting.");
    }
}

class ExecuteMe implements Runnable {

    public void run() {
        while (true) {
            System.out.println("Say Hello over and over again.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                // swallow interrupted exception
            }
        }
    }
}
