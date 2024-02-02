import org.junit.*;

public class LifeCycleOfTest {
    @BeforeClass
    public static void beforeAll(){
        System.out.println("BeforeClass method");
    }


    @Before
    public void setUp(){
        System.out.println("Begining of the every test! Before method");
    }

    @Test
    public void test(){
        System.out.println("Test method");
    }

    @Test
    public void test2(){
        System.out.println("Test2 method");
    }

    @After
    public void after(){
        System.out.println("End of the every test! After method\n");
    }

    @AfterClass
    public static void afterAll(){
        System.out.println("AfterClass method");
    }


}
