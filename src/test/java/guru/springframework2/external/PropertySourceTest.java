package guru.springframework2.external;


import guru.springframework2.config.ExternalPropsPropertySourceTestConfig;
import guru.springframework2.jms.FakeJmsBroker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsPropertySourceTestConfig.class)
public class PropertySourceTest {

    private FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropSet() throws Exception {

        assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        assertEquals(3330, fakeJmsBroker.getPort().intValue());
        assertEquals("Ron", fakeJmsBroker.getUser());
        assertEquals("Burgundy", fakeJmsBroker.getPassword());
    }

    @Autowired
    public void setFakeJmsBroker(FakeJmsBroker fakeJmsBroker) {
        this.fakeJmsBroker = fakeJmsBroker;
    }
}
