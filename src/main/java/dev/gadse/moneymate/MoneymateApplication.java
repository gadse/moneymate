package dev.gadse.moneymate;

import dev.gadse.moneymate.account.Account;
import dev.gadse.moneymate.account.AccountService;
import dev.gadse.moneymate.account.BIC;
import dev.gadse.moneymate.account.IBAN;
import dev.gadse.moneymate.account.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@ConfigurationPropertiesScan
@RequiredArgsConstructor
//@PropertySource("application.properties")
public class MoneymateApplication {

	@Autowired
	private AccountService accountService;

	public static void main(String[] args) {
		SpringApplication.run(MoneymateApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			Account account = new Account(
					"Musteraccount",
					new Person("Max Mustermann"),
					new IBAN("DE57500105174628189851"),
					new BIC("GENODED1AAC")
			);
			System.out.println(account.toString());

			System.out.println(accountService.readAccounts());
		};
	}

}
