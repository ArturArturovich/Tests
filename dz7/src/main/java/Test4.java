import org.testng.annotations.BeforeSuite;

public class Test4 {
    @BeforeSuite
    public void taskBefore() {
        System.out.println(getClass().getSimpleName() + " before");
    }

    @BeforeSuite
    public void taskBefore2() {
        System.out.println(getClass().getSimpleName() + " before");
    }

    @Test(1)
    public void task1() {
        System.out.println(getClass().getSimpleName() + " task1");
    }
}
