package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Profile;
@Repository
public interface ProfileRepository extends JpaRepository<Profile, String>{

}
