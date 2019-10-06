package com.example.kms.zalando.awskmsexamplezalando;

import de.zalando.spring.cloud.config.aws.kms.KmsTextEncryptor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AwsKmsExampleZalandoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwsKmsExampleZalandoApplication.class, args);
    }


    @Bean
    public CommandLineRunner commandLineRunner(KmsTextEncryptor kmsTextEncryptor) {

        return (args) -> {

            String stringToEncrypt = "welcome Mahmoud";

            String afterEncryption = kmsTextEncryptor.encrypt(stringToEncrypt);

            System.out.println(afterEncryption);

            String afterDecryption = kmsTextEncryptor.decrypt(afterEncryption);

            System.out.println("-----------------------");

            System.out.println(afterDecryption);

        };


    }
}
