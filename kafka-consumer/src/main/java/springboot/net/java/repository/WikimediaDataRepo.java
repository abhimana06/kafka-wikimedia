package springboot.net.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.net.java.entity.Wikimedia;

public interface WikimediaDataRepo extends JpaRepository<Wikimedia, Long>{

}
