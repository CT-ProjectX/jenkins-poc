package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aplication {

  @RequestMapping("/")
  public String home() {
    return "POC AAA CT";
  }

  public static void main(String[] args) {
    SpringApplication.run(Aplication.class, args);
  }
}