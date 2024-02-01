package tfr.APPHOME.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import tfr.APPHOME.dto.OccurrenceDTO;
import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.entities.UserAPP;
import tfr.APPHOME.enums.PRIORITY;
import tfr.APPHOME.enums.STATEOFOCCURRENCE;
import tfr.APPHOME.repositories.OccurrenceRepository;

@Service
public class OccurrenceService {

    @Autowired
    private OccurrenceRepository repo;

    public Page<OccurrenceDTO> findPage(Pageable pageable){
        Page<Occurrence> entity = repo.findAll(pageable);
        return entity.map(x -> new OccurrenceDTO(x));
    }

    public OccurrenceDTO insert (OccurrenceDTO dto){
        Occurrence entity = new Occurrence();
        entity.setOccurrenceName(dto.getOccurrenceName());
        entity.setDataOpenOccurrence(dto.getDataOpenOccurrence());
        entity.setDataCloseOccurrence(dto.getDataCloseOccurrence());
        entity.setState(STATEOFOCCURRENCE.OTHER);
        entity.setPriority(PRIORITY.LOW);
        entity.setImg(dto.getImg());
        UserAPP user = new UserAPP();
        user.setId(dto.getUserAppDto().getId());
        entity.setUserAPP(user);
        entity = repo.save(entity);
        return new OccurrenceDTO(entity);

    }

}
