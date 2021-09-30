package concurrent;


import org.openjdk.jol.info.ClassLayout;
import test.A;

/**
 * @author zhaoqi.wang
 * @date 2021/9/27
 */
public class Exam01 {

    public static void main(String[] args) throws InterruptedException {
        final A a = new A();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t1  " + ClassLayout.parseInstance(a).toPrintable());
                a.setA(1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("t2  " + ClassLayout.parseInstance(a).toPrintable());
                a.setA(2);
            }
        });

        t1.start();
        t2.start();
    }



}
