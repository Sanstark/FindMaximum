import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFindMax {
    FindMax findMax;

    @Test
    public void testFindMaxInt(){
        findMax = new FindMax(9,3,7);
        Assert.assertEquals((Integer)9, findMax.testMaximum());
    }

    @Test
    public void testFindMaxFloat(){
        findMax = new FindMax(11.85,5.96,7.31);
        Assert.assertEquals(11.85, findMax.testMaximum());
    }

    @Test
    public void testFindMaxString(){
        findMax = new FindMax("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", findMax.testMaximum());
    }
}
