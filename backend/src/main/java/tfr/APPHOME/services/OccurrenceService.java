package tfr.APPHOME.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tfr.APPHOME.dto.OccurrenceDTO;
import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.repositories.OccurrenceRepository;

@Service
public class OccurrenceService {

    @Autowired
    private OccurrenceRepository repo;

    public Page<OccurrenceDTO> findPage(Pageable pageable){
        Page<Occurrence> entity = repo.findAll(pageable);
        return entity.map(x -> new OccurrenceDTO(x));
    }

}
