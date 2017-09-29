package daw.basket.data.repository;

import daw.basket.data.domain.Equipo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long>{


    Equipo findByNombre(String nombre);


    List<Equipo> findByLocalidad(String loc);
}
