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

        createFindRootTest(x -> Math.sin(x) , x -> Math.cos(x), 1, 0);
        createFindRootTest(x -> Math.sin(x) , x -> Math.cos(x), 2.8, Math.PI);
        createFindRootTest(x -> Math.sin(x) , x -> Math.cos(x), 5.8, 2*Math.PI);
        
    }

    public void createFindRootTest(Function f, Function df, double x0, double expected) {
        Newton newton = new Newton();
        
        Assert.assertEquals(expected, newton.findRoot(f,df,x0,1e-12), 1e-12);
    }
}