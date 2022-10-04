package SettingUpThreads.SecondWay;

public class Demonstration {

    public static void main(String[] args) throws InterruptedException {
        ExecuteMe executeMe = new ExecuteMe();
       executeMe.start();
       executeMe.join();
    }
}
