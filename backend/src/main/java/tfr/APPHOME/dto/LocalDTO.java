package tfr.APPHOME.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import tfr.APPHOME.entities.Local;
import tfr.APPHOME.enums.LOCALENUM;

public class LocalDTO {

    private Long id;
    private Integer local;
    @Size(min=3, max = 300, message = "Equipement description must be between 3 and 300 characters")
    @NotBlank(message = "required field")
    private String equipement;

    public LocalDTO(){}

    public LocalDTO(Long id, LOCALENUM local, String equipement) {
        this.id = id;
        this.local = local.getCod();
        this.equipement = equipement;
    }

    public LocalDTO(Local entity) {
       id = entity.getId();
       local = entity.getLocal().getCod();
       equipement = entity.getEquipement();
    }

    public Long getId() {
        return id;
    }

    public Integer getLocal() {
        return local;
    }

    public String getEquipement() {
        return equipement;
    }
}
