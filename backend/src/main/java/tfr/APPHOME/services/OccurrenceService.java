package tfr.APPHOME.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tfr.APPHOME.repositories.OccurrenceRepository;

@Service
public class OccurrenceService {

    @Autowired
    private OccurrenceRepository repo;


}
