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
                System.out.println("tA time: "+ System.currentTimeMillis() + ClassLayout.parseInstance(a).toPrintable());
                a.setA("thread A" , 1);
                System.out.println("release thread A:" + ClassLayout.parseInstance(a).toPrintable());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("tB time: " + System.currentTimeMillis() + ClassLayout.parseInstance(a).toPrintable());
                a.setA("thread B", 2);
                System.out.println("release thread B:" + ClassLayout.parseInstance(a).toPrintable());
            }
        });

        t1.start();
        t2.start();
    }



}
