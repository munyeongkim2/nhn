package com.nhnacademy.Homework;

import java.util.concurrent.ThreadLocalRandom;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 10001)); // Sleep for 1 to 10 seconds
                store.deliverItems();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

