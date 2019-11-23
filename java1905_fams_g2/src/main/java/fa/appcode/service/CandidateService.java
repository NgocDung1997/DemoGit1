package fa.appcode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fa.appcode.model.Candidate;

@Service
public interface CandidateService {
	
	Candidate saveCandidate(Candidate candidate);
	
	Candidate findCandidateById(int candidateId);
	
	List<Candidate> findAllCandidate();
	
	boolean deleteCandidate(int candidateId);
}
