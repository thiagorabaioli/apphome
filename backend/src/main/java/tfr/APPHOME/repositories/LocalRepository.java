package tfr.APPHOME.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tfr.APPHOME.entities.Local;




@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
}
