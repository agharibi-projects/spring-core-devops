package guru.springframework2.dstest;


import guru.springframework2.config.DataSourceConfig;
import guru.springframework2.ds.FakeDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DataSourceConfig.class)
public class DataSourceTest {

    private FakeDataSource fakeDataSource;

    @Autowired
    public void setFakeDataSource(FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }


    @Test
    public void testDataSource() throws Exception {
        System.out.println("\n********************************");
        System.out.println("\n"+ fakeDataSource.getConnectionInfo());
        System.out.println("\n********************************");
    }


}
