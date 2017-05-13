package guru.springframework2.config;


import guru.springframework2.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource({"classpath:testing.properties", "classpath:encrypted-testing.properties"})
public class ExternalPropsMultiFile {

    @Autowired
    Environment env;

    @Bean
    public FakeJmsBroker fakeJmsBrokerMulti() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();

        fakeJmsBroker.setUrl(env.getProperty("guru.jms.url"));
        fakeJmsBroker.setPort(env.getRequiredProperty("guru.jms.port", Integer.class));
        fakeJmsBroker.setUser(env.getProperty("guru.jms.user"));
        fakeJmsBroker.setPassword(env.getProperty("guru.jms.encrypted.password"));

        return fakeJmsBroker;
    }
}
