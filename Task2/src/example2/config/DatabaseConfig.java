package example2.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DatabaseConfig
{
    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;


    @PostConstruct
    public void connectToDatabase(){
        System.out.println("Connecting to database...");
    }

    @PreDestroy
    public void disconnectFromDatabase(){
        System.out.println("disconnecting from database...");
    }
}
