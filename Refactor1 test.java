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
        Assert.assertEquals((Integer)9, findMax.findMax(9,3,7));
        Assert.assertEquals((Integer)9, findMax.findMax(3,9,7));
        Assert.assertEquals((Integer)9,findMax.findMax(3,7,9));
    }

    @Test
    public void testFindMaxFloat(){
        Assert.assertEquals(11.85, findMax.findMax(11.85f,5.96f,7.31f), 2);
        Assert.assertEquals(11.85, findMax.findMax(5.96f,11.85f,7.31f), 2);
        Assert.assertEquals(11.85,findMax.findMax(5.96f,7.31f,11.85f), 2);
    }

    @Test
    public void testFindMaxString(){
        Assert.assertEquals("Peach", findMax.findMax("Peach", "Apple", "Banana"));
        Assert.assertEquals("Peach", findMax.findMax("Apple", "Peach", "Banana"));
        Assert.assertEquals("Peach", findMax.findMax("Apple", "Banana", "Peach"));
    }
}
