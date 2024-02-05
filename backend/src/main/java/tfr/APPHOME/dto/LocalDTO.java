package tfr.APPHOME.dto;


import tfr.APPHOME.entities.Local;

public class LocalDTO {

    private Long id;
    private Integer local;

    private String equipement;

    public LocalDTO(){}

    public LocalDTO(Long id, Integer local, String equipement) {
        this.id = id;
        this.local = local;
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
