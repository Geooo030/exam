package concurrent;

import org.openjdk.jol.info.ClassLayout;

/**
 * @author zhaoqi.wang
 * @date 2021/10/8
 */
public class NoLock {

    private static Object o = new Object();
    public static void main(String[] args) {
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        System.out.println("hashcode = " + o.hashCode());
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
    }
}
