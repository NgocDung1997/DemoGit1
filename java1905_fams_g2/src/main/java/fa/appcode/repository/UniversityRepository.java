package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, String>{

}
