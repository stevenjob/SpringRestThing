package hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quotes[] = restTemplate.getForObject("http://localhost:9090/QuoterThing-1.0/quotes", Quote[].class);

        List<Quote> list = new ArrayList<>(Arrays.asList(quotes));
        System.out.println("--------------------");
        list.forEach(System.out::println);
        System.out.println("--------------------");
    }
}