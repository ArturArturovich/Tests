import org.testng.annotations.AfterSuite;

public class Test2 {
    @AfterSuite
    public void taskAfter() {
        System.out.println(getClass().getSimpleName() + " after");
    }

    @Test
    public void task1() {
        System.out.println(getClass().getSimpleName() + " task1");
    }

    @Test(2)
    public void task2(){
        System.out.println(getClass().getSimpleName() + " task2");
    }
}
