package tfr.APPHOME.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_addressed")
public class Addressed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "addressed")
    private List<Occurrence> addressedOccurrences = new ArrayList<>();

    public Addressed(){}

    public Addressed(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Occurrence> getAddressedOccurrences() {
        return addressedOccurrences;
    }

    public void setAddressedOccurrences(List<Occurrence> addressedOccurrences) {
        this.addressedOccurrences = addressedOccurrences;
    }
}
