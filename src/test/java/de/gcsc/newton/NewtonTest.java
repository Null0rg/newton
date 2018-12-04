package de.gcsc.newton;

import org.junit.Test;

import de.gcsc.newton.Newton.Function;
import junit.framework.Assert;

public class NewtonTest {

    @Test(timeout=1000)
    public void findRootTest() {

        createFindRootTest(x -> x, x -> 1, 1, 0);
        createFindRootTest(x -> x +1 , x -> 1, 1, -1);

        try {
            createFindRootTest(x -> 1 , x -> 0, 1, 0);
            Assert.fail();
        } catch(RuntimeException ex) {
            //
        }


    }

    public void createFindRootTest(Function f, Function df, double x0, double expected) {
        Newton newton = new Newton();
        
        Assert.assertEquals(expected, newton.findRoot(f,df,1,1e-12), 1e-12);
    }
}