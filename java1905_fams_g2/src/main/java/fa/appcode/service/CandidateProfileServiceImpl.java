package fa.appcode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.repository.CandidateProfileRepository;

@Service
public class CandidateProfileServiceImpl implements CandidateProfileService {
	@Autowired
	private CandidateProfileRepository candidateProfileRepository;

	@Override
	public Long countCandidate() {
		// TODO Auto-generated method stub	
		return candidateProfileRepository.count();
	}

}
