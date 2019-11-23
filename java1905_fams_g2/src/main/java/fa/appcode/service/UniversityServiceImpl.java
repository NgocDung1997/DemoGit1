package fa.appcode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fa.appcode.model.University;
import fa.appcode.repository.UniversityRepository;

@Service
public class UniversityServiceImpl implements UniversityService{
	
	@Autowired
	UniversityRepository universityRepository;

	@Override
	public List<University> findAllUniversity() {
		return universityRepository.findAll();
	}

	@Override
	public University saveUniversity(University university) {
		return universityRepository.save(university);
	}

	
}
