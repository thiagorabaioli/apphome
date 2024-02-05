package tfr.APPHOME.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import tfr.APPHOME.enums.PRIORITY;
import tfr.APPHOME.enums.STATEOFOCCURRENCE;

import java.util.Date;


@Entity
@Table(name = "tb_occurrence")
public class Occurrence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String occurrenceName;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private Date dataOpenOccurrence;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private Date dataCloseOccurrence;


    private Integer state;

    private Integer priority;

    private String img;

    @ManyToOne
    @JoinColumn(name = "userApp_id")
    private UserAPP userAPP;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    @ManyToOne
    @JoinColumn(name="addressed_id")
    private Addressed addressed;

    public Occurrence(){}

    public Occurrence(Long id, String occurrenceName, Date dataOpenOccurrence, Date dataCloseOccurrence,
                      STATEOFOCCURRENCE state, PRIORITY priority, String img, UserAPP userAPP, Local local, Addressed addressed) {
        this.id = id;
        this.occurrenceName = occurrenceName;
        this.dataOpenOccurrence = dataOpenOccurrence;
        this.dataCloseOccurrence = dataCloseOccurrence;
        this.state = state.getCod();
        this.priority = priority.getCod();
        this.img = img;
        this.userAPP = userAPP;
        this.local = local;
        this.addressed = addressed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOccurrenceName() {
        return occurrenceName;
    }

    public void setOccurrenceName(String occurrenceName) {
        this.occurrenceName = occurrenceName;
    }

    public Date getDataOpenOccurrence() {
        return dataOpenOccurrence;
    }

    public void setDataOpenOccurrence(Date dataOpenOccurrence) {
        this.dataOpenOccurrence = dataOpenOccurrence;
    }

    public Date getDataCloseOccurrence() {
        return dataCloseOccurrence;
    }

    public void setDataCloseOccurrence(Date dataCloseOccurrence) {
        this.dataCloseOccurrence = dataCloseOccurrence;
    }

    public STATEOFOCCURRENCE getState() {
        return STATEOFOCCURRENCE.toEnum(state);
    }

    public void setState(STATEOFOCCURRENCE state) {
        this.state = state.getCod();
    }

    public PRIORITY getPriority() {
        return PRIORITY.toEnum(priority);
    }

    public void setPriority(PRIORITY priority) {
        this.priority = priority.getCod();
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

    public Addressed getAddressed() {
        return addressed;
    }

    public void setAddressed(Addressed addressed) {
        this.addressed = addressed;
    }
}
