package fa.appcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.model.Candidate;
import fa.appcode.repository.CandidateProfileRepository;
import fa.appcode.repository.CandidateRepository;
import fa.appcode.repository.ProfileRepository;

@Service
public class CandidateServiceImpl implements CandidateService{
	
	@Autowired
	CandidateRepository candidateRepository;
	
	@Autowired
	CandidateProfileRepository candidateProfileRepository;
	
	@Autowired
	ProfileRepository profileRepository;

	@Override
	public Candidate saveCandidate(Candidate candidate) {
		candidateProfileRepository.save(candidate.getCandidateProfile());
		//profileRepository.save(candidate.getCandidateProfile().getP)
		candidateRepository.save(candidate);
		return null;
	}

	@Override
	public Candidate findCandidateById(int candidateId) {
		return null;
		//return candidateRepository.findCandidateById(candidateId);
	}

	@Override
	public List<Candidate> findAllCandidate() {
		return candidateRepository.findAll();
	}

	@Override
	public boolean deleteCandidate(int candidateId) {
		// TODO Auto-generated method stub
		return false;
	}

}
