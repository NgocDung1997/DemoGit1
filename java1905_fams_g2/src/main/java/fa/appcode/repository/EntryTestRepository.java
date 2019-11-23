package fa.appcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fa.appcode.model.EntryTest;

@Repository
public interface EntryTestRepository extends JpaRepository<EntryTest, String>{

}
