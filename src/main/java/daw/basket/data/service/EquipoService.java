package daw.basket.data.service;

import daw.basket.data.domain.Equipo;
import daw.basket.data.repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo() {

        Equipo team = new Equipo(
                "Vault Hunters",
                "Sanctuary",
                LocalDate.of(1995,12,12)
        );
        equipoRepository.save(team);

        Equipo team2 = new Equipo(
                "Estrella",
                "Reino Champiñon",
                LocalDate.of(1995,12,12)
        );
        equipoRepository.save(team2);

        Equipo team3 = new Equipo(
                "Zanarcan Racers",
                "Zanarcan",
                LocalDate.of(1995,12,12)
        );
        equipoRepository.save(team3);
        Equipo stucom = new Equipo(
                "Stucom",
                "barcelona",
                LocalDate.of(1996, 12, 1));
        equipoRepository.save(stucom);

        Equipo moscow5 = new Equipo(
                "Moscow 5",
                "moscow",
                LocalDate.of(2001, 2, 16));
        equipoRepository.save(moscow5);


    }
}
