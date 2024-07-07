package br.com.mascenadev.screanmatchfrases;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("test")
public class ScreanmatchFrasesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScreanmatchFrasesApplication.class, args);
    }
}