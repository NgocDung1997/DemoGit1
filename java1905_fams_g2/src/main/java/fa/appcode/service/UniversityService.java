package fa.appcode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import fa.appcode.model.University;

@Service
public interface UniversityService {

	List<University> findAllUniversity();
	
	University saveUniversity(University university);
}
