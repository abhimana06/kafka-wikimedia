package springboot.net.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.net.java.entity.Wikimedia;

@Repository
public interface WikimediaDataRepo extends JpaRepository<Wikimedia, Long>{

}
