package co.com.amarie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.amarie.models.entity.MatPrimas;

@Repository
public interface MatPrimasRepository extends JpaRepository<MatPrimas, Integer> {

}
