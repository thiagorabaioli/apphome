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
		UserAPP userApp1 = new UserAPP(null, "personNamw1", "sssss@mail.com");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		Occurrence occurrence1 = new Occurrence(null,"Luz Avariada wc", sdf.parse("24/01/2024 10:00"), sdf.parse("28/01/2024 10:37"), STATEOFOCCURRENCE.OTHER
		, PRIORITY.LOW, "img...", userApp1);
	}
}
