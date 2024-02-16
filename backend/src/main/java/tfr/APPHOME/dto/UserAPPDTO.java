package tfr.APPHOME.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import tfr.APPHOME.entities.UserAPP;

public class UserAPPDTO {

    private Long id;
    @Size(min=3, max = 80, message = "nName must be between 3 and 80 characters")
    @NotBlank(message = "required field")
    private String name;
    @Email(message = "email not valid")
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


