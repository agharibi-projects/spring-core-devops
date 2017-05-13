package guru.springframework2.ds;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"dev", "default"})
public class DevDataSource implements FakeDataSource {

    @Override
    public String getConnectionInfo() {
        return "Dev data source";
    }
}
