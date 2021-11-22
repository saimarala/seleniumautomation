package MyPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class faliedTest {


    @Test
    public void test1(){
        Assert.assertTrue(false);
    }
    @Test
    public void test2(){
        Assert.assertFalse(false);
    }
}
