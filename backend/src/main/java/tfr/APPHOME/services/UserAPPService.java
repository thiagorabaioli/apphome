package tfr.APPHOME.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tfr.APPHOME.dto.UserAPPDTO;
import tfr.APPHOME.entities.UserAPP;
import tfr.APPHOME.repositories.UserAPPRepository;

@Service
public class UserAPPService {

    @Autowired
    private UserAPPRepository repo;

    public UserAPPDTO insert (UserAPPDTO dto){
        UserAPP entity = new UserAPP();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity = repo.save(entity);
        return new UserAPPDTO(entity);
    }
}
