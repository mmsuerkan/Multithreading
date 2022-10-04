package SettingUpThreads.FirstWay;

public class Demonstration {

    public static void main(String[] args) throws InterruptedException {
        ExecuteMe executeMe = new ExecuteMe();
        Thread t = new Thread(executeMe);
        t.start();
    }
}
