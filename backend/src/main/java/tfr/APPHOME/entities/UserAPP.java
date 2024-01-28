package tfr.APPHOME.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "tb_user_app")
public class UserAPP {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "userAPP")
    private Set<Occurrence> occurrences = new HashSet<>();

    public UserAPP(){}

    public UserAPP(Long id, String name, String email) {
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

    public Set<Occurrence> getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(Set<Occurrence> occurrences) {
        this.occurrences = occurrences;
    }
}
