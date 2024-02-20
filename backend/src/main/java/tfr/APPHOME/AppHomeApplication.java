package tfr.APPHOME;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tfr.APPHOME.entities.Addressed;
import tfr.APPHOME.entities.Local;
import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.entities.UserAPP;
import tfr.APPHOME.enums.LOCALENUM;
import tfr.APPHOME.enums.PRIORITY;
import tfr.APPHOME.enums.STATEOFOCCURRENCE;
import tfr.APPHOME.repositories.AddressedRepository;
import tfr.APPHOME.repositories.LocalRepository;
import tfr.APPHOME.repositories.OccurrenceRepository;
import tfr.APPHOME.repositories.UserAPPRepository;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class AppHomeApplication implements CommandLineRunner {

	@Autowired
	private OccurrenceRepository occurrenceRepository;

	@Autowired
	private UserAPPRepository userAPPRepository;

	@Autowired
	private AddressedRepository addressedRepository;
	

	@Autowired
	private LocalRepository localRepository;

	public static void main(String[] args) {
		SpringApplication.run(AppHomeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		UserAPP userApp1 = new UserAPP(null, "personNamw1", "sssss@mail.com");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		Local loca1 = new Local(null, LOCALENUM.OTHER, "eeee");

		Addressed addressed1 = new Addressed(null, "Thiago R", "ddddd@gmail.com");

		Occurrence occurrence1 = new Occurrence(null,"Luz Avariada wc", sdf.parse("24/01/2024 10:00"), sdf.parse("28/01/2024 10:37"), STATEOFOCCURRENCE.OTHER
				, PRIORITY.LOW, "img...", userApp1, loca1, addressed1);


		userAPPRepository.save(userApp1);
		localRepository.save(loca1);
		addressedRepository.save(addressed1);
		occurrenceRepository.save(occurrence1);


	}
}
