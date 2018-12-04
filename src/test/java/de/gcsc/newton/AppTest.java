package de.gcsc.newton;

import org.junit.Test;
import org.junit.Assert;

public class AppTest {
    @Test public void getNameTest() {
        App app = new App();

        app.getName();

        Assert.assertEquals("name",app.getName());
    }
}