package tfr.APPHOME.dto;


import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.entities.UserAPP;

import java.util.HashSet;
import java.util.Set;

public class UserAPPDTO {

    private Long id;
    private String name;
    private String email;



    public UserAPPDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public UserAPPDTO(UserAPP entity){
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

 
}


