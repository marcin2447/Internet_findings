package pl.home.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.home.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

	
	
	User findFirstByusername(String username);
	
	
}
