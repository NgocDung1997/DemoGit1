package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String>{
	Users findUsersByUserName(String userName);
}
