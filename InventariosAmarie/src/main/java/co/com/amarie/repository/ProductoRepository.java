package co.com.amarie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.amarie.models.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
