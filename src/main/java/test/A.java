package test;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author zhaoqi.wang
 * @date 2021/9/28
 */
public class A {
    private Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(String name, Integer a) {
        synchronized (this) {
            try {
                this.a = a;
                Thread.sleep(1000);
                System.out.println("innerPrint1: " + name + "   " + ClassLayout.parseInstance(this).toPrintable());
                Thread.sleep(1000);
                System.out.println("innerPrint2:" + name + "   "  + ClassLayout.parseInstance(this).toPrintable());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
