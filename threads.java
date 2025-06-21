package car;

import java.util.concurrent.atomic.*;

public class threads {
    static AtomicInteger waterLevel = new AtomicInteger(50);
    static final int Max_capacity = 100;

    public static void main(String[] arg) {
        InLetThread inlet = new InLetThread();
        OutletThread outlet = new OutletThread();
        WaterControllerThread controller = new WaterControllerThread();

        inlet.start();
        outlet.start();
        controller.start();
    }

    static class InLetThread extends Thread {
        public void run() {
            while (true) {
                if (waterLevel.get() < Max_capacity) {
                    waterLevel.incrementAndGet();
                    System.out.println("Inlet: Water Level = " + waterLevel.get());
                }
                try {
                    Thread.sleep(100);
                    e.printStackTrace();
                }
            }
        }
    }

    static class OutletThread extends Thread {
        public void run() {
            while (true) {
                if (waterLevel.get() > 0) {
                    waterLevel.decrementAndGet();
                    System.out.println("Outlet: Water Level = " + waterLevel.get());
                }
                try {
                    Thread.sleep(150); // simulate slower outflow
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class WaterControllerThread extends Thread {
        public void run() {
            while (true) {
                int level = waterLevel.get();
                if (level >= Max_capacity) {
                    System.out.println("Controller: Maximum Capacity Reached!");
                } else if (level <= 0) {
                    System.out.println("Controller: Tank is Empty!");
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
