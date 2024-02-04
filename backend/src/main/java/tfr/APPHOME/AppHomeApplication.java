package tfr.APPHOME;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.entities.UserAPP;
import tfr.APPHOME.enums.PRIORITY;
import tfr.APPHOME.enums.STATEOFOCCURRENCE;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class AppHomeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppHomeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
