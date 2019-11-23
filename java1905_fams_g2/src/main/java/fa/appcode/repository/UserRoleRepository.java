package fa.appcode.repository;


import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.UserRole;
import fa.appcode.model.Users;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String>{
	Set<UserRole> findUserRoleListByUser(Users user);
}
