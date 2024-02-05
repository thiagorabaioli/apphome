package tfr.APPHOME.dto;

import tfr.APPHOME.entities.Occurrence;
import tfr.APPHOME.enums.PRIORITY;
import tfr.APPHOME.enums.STATEOFOCCURRENCE;

import java.util.Date;

public class OccurrenceDTOid {

    private Long id;
    private String occurrenceName;

    private Date dataOpenOccurrence;

    private Date dataCloseOccurrence;

    private Integer state;

    private Integer priority;

    private String img;

    private Long userAppId;



    public OccurrenceDTOid(Long id, String occurrenceName, Date dataOpenOccurrence, Date dataCloseOccurrence, Integer state, Integer priority, String img, Long userAppId) {
        this.id = id;
        this.occurrenceName = occurrenceName;
        this.dataOpenOccurrence = dataOpenOccurrence;
        this.dataCloseOccurrence = dataCloseOccurrence;
        this.state = state;
        this.priority = priority;
        this.img = img;
        this.userAppId = userAppId;



    }

    public OccurrenceDTOid (Occurrence entity){
       id = entity.getId();
        occurrenceName = entity.getOccurrenceName();
        dataOpenOccurrence = entity.getDataOpenOccurrence();
        dataCloseOccurrence = entity.getDataCloseOccurrence();
        state = STATEOFOCCURRENCE.OPEN.getCod();
        priority = PRIORITY.HIGH.getCod();
        img = entity.getImg();
        userAppId = entity.getUserAPP().getId();


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

    public Long getUserAppId() {
        return userAppId;
    }


}
