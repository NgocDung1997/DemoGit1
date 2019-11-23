package fa.appcode.service;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fa.appcode.common.utility.UserPrincipal;
import fa.appcode.model.Role;
import fa.appcode.model.UserRole;
import fa.appcode.model.Users;
import fa.appcode.repository.RoleRepository;
import fa.appcode.repository.UserRepository;
import fa.appcode.repository.UserRoleRepository;

@Service
public class MyUserDetailService implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserRoleRepository userRoleRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Users user=userRepository.findUsersByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("User 404");
		}
		Set<GrantedAuthority> grandtedAuthorities=new HashSet<>();
		Set<UserRole> listUserRole=userRoleRepository.findUserRoleListByUser(user);
		for(UserRole userRole:listUserRole) {
			Role role=roleRepository.findRoleByUserRoles(userRole);
			grandtedAuthorities.add(new SimpleGrantedAuthority("ROLE_"+role.getRoleName()));
		}
		String userName=user.getUserName();
		String password=user.getPassword();
		return new org.springframework.security.core.userdetails.User(userName,password,grandtedAuthorities);
	}

}
