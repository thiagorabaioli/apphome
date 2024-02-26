package tfr.APPHOME.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tfr.APPHOME.Projections.UserAPPMinProjection;
import tfr.APPHOME.entities.UserAPP;

import java.util.List;

@Repository
public interface UserAPPRepository extends JpaRepository<UserAPP, Long> {

    @Query(nativeQuery = true, value="SELECT name FROM tb_user_app WHERE UPPER(name)=UPPER(:name)")
    List<UserAPPMinProjection> search1(String state);

}
