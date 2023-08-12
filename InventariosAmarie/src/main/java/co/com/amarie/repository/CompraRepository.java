package co.com.amarie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.amarie.models.entity.Compra;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Integer>{
	
}
