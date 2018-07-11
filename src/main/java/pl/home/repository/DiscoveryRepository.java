package pl.home.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.home.model.Discovery;


@Repository
public interface DiscoveryRepository extends JpaRepository<Discovery,Long> {

	
	
}
