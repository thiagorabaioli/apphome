package tfr.APPHOME.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tfr.APPHOME.entities.Addressed;


@Repository
public interface AddressedRepository extends JpaRepository<Addressed, Long> {
}
