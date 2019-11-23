package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Interview;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, String>{

}
