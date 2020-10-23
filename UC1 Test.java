import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFindMax {
    FindMax findMax;
    @Before
    public void initialize(){
        findMax = new FindMax();
    }
    @Test
    public void testFindMaxInt(){
        Assert.assertEquals(9, findMax.findMaxInt(9,3,7));
        Assert.assertEquals(9, findMax.findMaxInt(3,9,7));
        Assert.assertEquals(9,findMax.findMaxInt(3,7,9));
    }
}
