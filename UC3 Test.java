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

    @Test
    public void testFindMaxFloat(){
        Assert.assertEquals(11.85, findMax.findMaxFloat(11.85f,5.96f,7.31f), 2);
        Assert.assertEquals(11.85, findMax.findMaxFloat(5.96f,11.85f,7.31f), 2);
        Assert.assertEquals(11.85,findMax.findMaxFloat(5.96f,7.31f,11.85f), 2);
    }

    @Test
    public void testFindMaxString(){
        Assert.assertEquals("Peach", findMax.findMaxString("Peach", "Apple", "Banana"));
        Assert.assertEquals("Peach", findMax.findMaxString("Apple", "Peach", "Banana"));
        Assert.assertEquals("Peach", findMax.findMaxString("Apple", "Banana", "Peach"));
    }
}
