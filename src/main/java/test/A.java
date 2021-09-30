package test;

/**
 * @author zhaoqi.wang
 * @date 2021/9/28
 */
public class A {
    private Integer a;

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        synchronized (this) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.a = a;
        }
    }
}
