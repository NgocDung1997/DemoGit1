package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, String>{
	
}
