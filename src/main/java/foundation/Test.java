package foundation;

/**
 * Created by fjx on 2016/8/15.
 */
public class Test {
    public static void main(String[] args) {
        new FinallyTest().test(0);
        System.out.println("------------------");
        new FinallyTest().test(1);
    }

}

class FinallyTest {
    public void test(int a) {
        try {
            int i = 0 / a;
        } catch (Exception ex) {
            System.err.println("程序异常了!");
            return;
        } finally {
            System.out.println("执行finally!");
        }
        System.out.println("执行finally后面的语句!");
    }
}
