package tfr.APPHOME.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tfr.APPHOME.dto.UserAPPDTO;
import tfr.APPHOME.entities.UserAPP;
import tfr.APPHOME.repositories.UserAPPRepository;

import java.util.Optional;


@Service
public class UserAPPService {

    @Autowired
    private UserAPPRepository repo;

    @Transactional(readOnly = true)
    public UserAPPDTO findById(Long id){
        Optional<UserAPP> result = repo.findById(id); //BUsca no banco para o objeto Optional
        UserAPP entity = result.get(); // entity extrai a referência do objeto Optional
        UserAPPDTO dto = new UserAPPDTO(entity);
        return dto;
    }

    public Page<UserAPPDTO> findPage(Pageable pageable){
        Page<UserAPP> result = repo.findAll(pageable);
        return result.map(x -> new UserAPPDTO(x));
    }



    public UserAPPDTO insert (UserAPPDTO dto){
        UserAPP entity = new UserAPP();
        copyToDto(dto,entity);
        return new UserAPPDTO(entity);
    }

    private void copyToDto(UserAPPDTO dto, UserAPP entity) {
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity = repo.save(entity);
    }


}
