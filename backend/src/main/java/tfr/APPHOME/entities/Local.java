package tfr.APPHOME.entities;

import jakarta.persistence.*;
import tfr.APPHOME.enums.LOCAL;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_local")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer local;

    private String equipement;

    @OneToMany(mappedBy = "local")
    private List<Occurrence> localOccurrences = new ArrayList<>();

    public Local(){}

    public Local(Long id, LOCAL local, String equipement) {
        this.id = id;
        this.local = local.getCod();
        this.equipement = equipement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LOCAL getLocal() {
        return LOCAL.toEnum(local);
    }

    public void setLocal(LOCAL local) {
        this.local = local.getCod();
    }

    public String getEquipement() {
        return equipement;
    }

    public void setEquipement(String equipement) {
        this.equipement = equipement;
    }

    public List<Occurrence> getLocalOccurrences() {
        return localOccurrences;
    }

    public void setLocalOccurrences(List<Occurrence> localOccurrences) {
        this.localOccurrences = localOccurrences;
    }
}
