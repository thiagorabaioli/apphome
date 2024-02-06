package tfr.APPHOME.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tfr.APPHOME.dto.LocalDTO;
import tfr.APPHOME.entities.Local;
import tfr.APPHOME.enums.LOCALENUM;
import tfr.APPHOME.repositories.LocalRepository;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository;

    public LocalDTO insert (LocalDTO objDto){
        Local entity = new Local();
        entity.setId(objDto.getId());
        entity.setLocal(LOCALENUM.OTHER);
        entity.setEquipement(objDto.getEquipement());
        entity = localRepository.save(entity);
        return new LocalDTO(entity);
    }
}
