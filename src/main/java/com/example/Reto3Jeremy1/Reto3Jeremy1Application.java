package com.example.Reto3Jeremy1;

import com.example.Reto3Jeremy1.repository.Interface.OrderInterface;
import com.example.Reto3Jeremy1.repository.Interface.SupplementsInterface;
import com.example.Reto3Jeremy1.repository.Interface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class Reto3Jeremy1Application implements CommandLineRunner {

    @Autowired
    private OrderInterface orderInterface;
    @Autowired
    private UserInterface userInterface;
    @Autowired
    private SupplementsInterface supplementsInterface;

    public static void main(String[] args) {
        SpringApplication.run(Reto3Jeremy1Application.class, args);
    }

	@Override
    public void run(String... args) throws Exception {
        supplementsInterface.deleteAll();
        userInterface.deleteAll();
        orderInterface.deleteAll();
    }
}
