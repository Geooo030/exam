package concurrent;

import org.openjdk.jol.info.ClassLayout;
import test.A;

/**
 * @author zhaoqi.wang
 * @date 2021/9/27
 */
public class Exam01 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
    }

}
