package tfr.APPHOME.services;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tfr.APPHOME.dto.UserAPPDTO;
import tfr.APPHOME.entities.UserAPP;
import tfr.APPHOME.repositories.UserAPPRepository;
import tfr.APPHOME.services.exceptions.ResourceNotFoundException;


import java.util.Optional;


@Service
public class UserAPPService {

    @Autowired
    private UserAPPRepository repo;

    @Transactional(readOnly = true)
    public UserAPPDTO findById(Long id){
       UserAPP entity = repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Object not found!"));
       return new UserAPPDTO(entity);
    }

    public Page<UserAPPDTO> findPage(Pageable pageable){
        Page<UserAPP> result = repo.findAll(pageable);
        return result.map(x -> new UserAPPDTO(x));
    }



    public UserAPPDTO insert (UserAPPDTO dto){
        UserAPP entity = new UserAPP(); //Não monitorizado pela JPA
         copyToDto(dto,entity);
         entity = repo.save(entity);
        return new UserAPPDTO(entity);
    }
  @Transactional
    public UserAPPDTO update(Long id, UserAPPDTO dto){
        UserAPP entity = repo.getReferenceById(id);  // obtém a referência
        copyToDto(dto,entity);
        entity = repo.save(entity);
        return new UserAPPDTO(entity);
    }

    @Transactional
    public void delete (Long id){
        repo.deleteById(id);
    }


    private void copyToDto(UserAPPDTO dto, UserAPP entity) {
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
    }



}
