package daw.basket.data.repository;

import daw.basket.data.domain.Equipo;
import daw.basket.data.domain.EstadisticasPosicion;
import daw.basket.data.domain.EstadisticasPosicionCompletas;
import daw.basket.data.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    //prueba dfxdf fdfxdfxd


    List<Jugador> findByNombreContaining(String nombre);

    List<Jugador> findByCanastasGreaterThanEqual(Integer canastas);

    List<Jugador> findByAsistenciasBetween(Integer min, Integer max);

    List<Jugador> findByPosicion(String posicion);

    List<Jugador> findByFechaNacBetween(LocalDate min, LocalDate max);

    @Query("SELECT new daw.basket.data.domain.EstadisticasPosicion(j.posicion, AVG(j.rebotes), AVG(j.asistencias), AVG(j.canastas)) from Jugador j group by j.posicion")
    List<EstadisticasPosicion> mostrarMediasAgrupadoPorPosicion();

    @Query("SELECT new daw.basket.data.domain.EstadisticasPosicionCompletas(j.posicion, MAX(j.canastas),MIN(j.canastas),  AVG(j.canastas), MAX(j.rebotes),MIN(j.rebotes), AVG(j.rebotes), MAX(j.asistencias),MIN(j.asistencias), AVG(j.asistencias)) from Jugador j group by j.posicion")
    List<EstadisticasPosicionCompletas> mostrarMediasMinimosMaximosAgrupadoPorPosicion();


    List<Jugador> findByEquipoNombre(String nombre);

    List<Jugador> findByEquipo(Equipo equipo);


    List<Jugador> findByEquipoNombreAndPosicion(String equipo, String posicion);

    Jugador findTopByEquipoNombreOrderByCanastasDesc(String equipo);

}
