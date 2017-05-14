package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevProfileSysout {


    @Autowired
    public DevProfileSysout(@Value("${guru.springframework.profile.message}") String message) {
        System.out.println("########################");
        System.out.println("########################");
        System.out.println("####      DEV      #####");
        System.out.println("##   " + message);
        System.out.println("########################");
        System.out.println("########################");
    }
}
