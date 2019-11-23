package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Status;

@Repository
public interface StatusRepository extends JpaRepository<Status, String>{

}
