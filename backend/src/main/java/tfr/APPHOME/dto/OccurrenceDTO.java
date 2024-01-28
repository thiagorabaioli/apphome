package tfr.APPHOME.dto;


import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.entities.UserAPP;

import java.util.Date;

public class OccurrenceDTO {
    private Long id;
    private String occurrenceName;

    private Date dataOpenOccurrence;

    private Date dataCloseOccurrence;

    private Integer state;

    private Integer priority;

    private String img;

    //private UserAPP userAPP;

    public OccurrenceDTO(){}

    public OccurrenceDTO(Long id, String occurrenceName, Date dataOpenOccurrence, Date dataCloseOccurrence, Integer state, Integer priority, String img) {
        this.id = id;
        this.occurrenceName = occurrenceName;
        this.dataOpenOccurrence = dataOpenOccurrence;
        this.dataCloseOccurrence = dataCloseOccurrence;
        this.state = state;
        this.priority = priority;
        this.img = img;
    }

    public OccurrenceDTO(Occurrence entity){
        id = entity.getId();
        occurrenceName = entity.getOccurrenceName();
        dataOpenOccurrence = entity.getDataOpenOccurrence();
        dataCloseOccurrence = entity.getDataCloseOccurrence();
        state = entity.getState().getCod();
        priority = entity.getPriority().getCod();
        img = entity.getImg();

    }

    public Long getId() {
        return id;
    }

    public String getOccurrenceName() {
        return occurrenceName;
    }

    public Date getDataOpenOccurrence() {
        return dataOpenOccurrence;
    }

    public Date getDataCloseOccurrence() {
        return dataCloseOccurrence;
    }

    public Integer getState() {
        return state;
    }

    public Integer getPriority() {
        return priority;
    }

    public String getImg() {
        return img;
    }
}
