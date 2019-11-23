package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.Offer;

@Repository
public interface OfferRepository extends JpaRepository<Offer, String>{

}
