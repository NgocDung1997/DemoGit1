package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Faculity;

@Repository
public interface FaculityRepository extends JpaRepository<Faculity, String>{

}
