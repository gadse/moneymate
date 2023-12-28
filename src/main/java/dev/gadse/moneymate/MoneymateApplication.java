package dev.gadse.moneymate;

import dev.gadse.moneymate.account.Account;
import dev.gadse.moneymate.account.BIC;
import dev.gadse.moneymate.account.IBAN;
import dev.gadse.moneymate.account.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@ConfigurationPropertiesScan
public class MoneymateApplication {

	public static void main(String[] args) {
		Account account = new Account(
				"Musteraccount",
				new Person("Max Mustermann"),
				new IBAN("DE57500105174628189851"),
				new BIC("GENODED1AAC")
		);
		System.out.println(account.toString());

		SpringApplication.run(MoneymateApplication.class, args);
	}

}
