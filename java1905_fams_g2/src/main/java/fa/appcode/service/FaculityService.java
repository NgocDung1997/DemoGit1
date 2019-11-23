package fa.appcode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fa.appcode.model.Faculity;
import fa.appcode.repository.FaculityRepository;

@Service
public interface FaculityService {

	List<Faculity> findAllFaculity();
	
	Faculity saveFaculity(Faculity faculity);
}
