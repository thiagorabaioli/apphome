package tfr.APPHOME.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import tfr.APPHOME.entities.Addressed;

public class AddressedDTO {

    private Long id;
    @Size(min=3, max = 80, message = "occurrence description must be between 3 and 80 characters")
    @NotBlank(message = "required field")
    private String name;
    @Email
    private String email;

    public AddressedDTO(){}

    public AddressedDTO(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public AddressedDTO(Addressed entity){
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
