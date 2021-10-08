package concurrent;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author zhaoqi.wang
 * @date 2021/10/8
 */
public class DeflectionLock {



    public static void main(String[] args) throws InterruptedException {
        Object o = new Object();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        Thread.sleep(5000);
        System.out.println("ThreadId = " + Thread.currentThread().getId());
        lock(o);
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }

    private static void lock(Object o) {
        synchronized (o) {
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
