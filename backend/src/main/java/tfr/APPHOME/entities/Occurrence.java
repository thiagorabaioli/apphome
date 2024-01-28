package tfr.APPHOME.entities;

import jakarta.persistence.*;
import tfr.APPHOME.enums.PRIORITY;
import tfr.APPHOME.enums.STATEOFOCCURRENCE;

import java.util.Date;

@Entity
@Table(name = "occurrence_db")
public class Occurrence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String occorrenceName;

    private Date dataOpenOccorrence;

    private Date dataCloseOccorrence;

    private STATEOFOCCURRENCE state;

    private PRIORITY priority;

    private String img;

    @ManyToOne
    @JoinColumn(name = "userApp_id")
    private UserAPP userAPP;

    public Occurrence(){}

    public Occurrence(Long id, String occorrenceName, Date dataOpenOccorrence,
                      Date dataCloseOccorrence, STATEOFOCCURRENCE state, PRIORITY priority, String img, UserAPP userAPP) {

        this.id = id;
        this.occorrenceName = occorrenceName;
        this.dataOpenOccorrence = dataOpenOccorrence;
        this.dataCloseOccorrence = dataCloseOccorrence;
        this.state = state;
        this.priority = priority;
        this.img = img;
        this.userAPP = userAPP;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOccorrenceName() {
        return occorrenceName;
    }

    public void setOccorrenceName(String occorrenceName) {
        this.occorrenceName = occorrenceName;
    }

    public Date getDataOpenOccorrence() {
        return dataOpenOccorrence;
    }

    public void setDataOpenOccorrence(Date dataOpenOccorrence) {
        this.dataOpenOccorrence = dataOpenOccorrence;
    }

    public Date getDataCloseOccorrence() {
        return dataCloseOccorrence;
    }

    public void setDataCloseOccorrence(Date dataCloseOccorrence) {
        this.dataCloseOccorrence = dataCloseOccorrence;
    }

    public STATEOFOCCURRENCE getState() {
        return state;
    }

    public void setState(STATEOFOCCURRENCE state) {
        this.state = state;
    }

    public PRIORITY getPriority() {
        return priority;
    }

    public void setPriority(PRIORITY priority) {
        this.priority = priority;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public UserAPP getUserAPP() {
        return userAPP;
    }

    public void setUserAPP(UserAPP userAPP) {
        this.userAPP = userAPP;
    }
}
