package dev.gadse.moneymate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

@SpringBootTest
class MoneymateApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void writeDocumentationSnippets() {

		var modules = ApplicationModules.of(MoneymateApplication.class).verify();

		new Documenter(modules)
				.writeModulesAsPlantUml()
				.writeIndividualModulesAsPlantUml();
	}

}
