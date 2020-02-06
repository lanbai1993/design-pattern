package com.adolph.singleton;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTest2 {

    private static CountDownLatch countDownLatch = new CountDownLatch(1000);
    //private volatile static int   num   = 0; // 保证可见性和重排序，不保证原子性
    private static AtomicInteger num = new AtomicInteger();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executor.execute(() -> {
                try {
                    //num++;
                    num.getAndIncrement();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();
        System.out.println(num);
    }
}
