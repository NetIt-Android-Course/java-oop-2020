package com.netit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        Thread async = new Thread(() -> {
//            System.out.println("This is async");
//        });
//
//        async.start();
//
//        async.start();

        Runnable myRunnable = () -> {
            System.out.println("Sleeping started");
            try {
                System.out.println(Thread.currentThread());
                Thread.sleep(4000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            System.out.println("Sleeping stopped");
        };

        ThreadGroup group = new ThreadGroup("ivan");
        Thread newThread = new Thread(group, myRunnable);
//        thread.setDaemon(true);
//        thread.setName("Pesho");
//        thread.setPriority(1);
        newThread.start();
        System.out.println(Thread.currentThread());
        newThread.join();
        System.out.println("Main is stopping");
    }
}
