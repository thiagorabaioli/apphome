package tfr.APPHOME.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tfr.APPHOME.entities.UserAPP;

@Repository
public interface UserAPPRepository extends JpaRepository<UserAPP, Long> {
}
