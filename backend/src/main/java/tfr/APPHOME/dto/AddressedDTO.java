package tfr.APPHOME.dto;

import tfr.APPHOME.entities.Addressed;

public class AddressedDTO {

    private Long id;
    private String name;
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
