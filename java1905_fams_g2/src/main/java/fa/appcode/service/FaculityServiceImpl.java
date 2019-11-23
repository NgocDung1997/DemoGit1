package fa.appcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.model.Faculity;
import fa.appcode.repository.FaculityRepository;

@Service
public class FaculityServiceImpl implements FaculityService{

	@Autowired
	FaculityRepository faculityRepository;

	@Override
	public List<Faculity> findAllFaculity() {
		return faculityRepository.findAll();
	}

	@Override
	public Faculity saveFaculity(Faculity faculity) {
		return faculityRepository.save(faculity);
	}
}
