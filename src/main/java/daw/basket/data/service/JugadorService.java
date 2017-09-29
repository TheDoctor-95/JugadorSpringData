package daw.basket.data.service;

import daw.basket.data.domain.Equipo;
import daw.basket.data.repository.EquipoRepository;
import daw.basket.data.repository.JugadorRepository;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import daw.basket.data.domain.Jugador;

import java.time.LocalDate;

@Service
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugador() {
        Jugador kelvin = new Jugador("Kelvin", LocalDate.of(1996,1,27),1,6,5,"alero");
        kelvin.setEquipo(equipoRepository.findByNombre("stucom"));
        System.out.println(kelvin);
        jugadorRepository.save(kelvin);


        Jugador saiden = new Jugador("Saiden",LocalDate.of(1996,12,24),2,2,3,"base");
        saiden.setEquipo(equipoRepository.findByNombre("stucom"));
        jugadorRepository.save(saiden);

        Jugador sergi = new Jugador("Sergi", LocalDate.of(1996, 11, 21),3,0,2,"pivot");
        sergi.setEquipo(equipoRepository.findByNombre("stucom"));
        jugadorRepository.save(sergi);

        Jugador aleix = new Jugador("Aleix", LocalDate.of(1995,7,4),1,1,1,"alero");
        aleix.setEquipo(equipoRepository.findByNombre("stucom"));
        jugadorRepository.save(aleix);

        Jugador zerus = new Jugador("Zerus", LocalDate.of(1994,4,14),4,3,4,"base");
        zerus.setEquipo(equipoRepository.findByNombre("stucom"));
        jugadorRepository.save(zerus);


        Jugador shya = new Jugador("Shya",LocalDate.of(1989, 1, 2),4,2,8,"base");
        shya.setEquipo(equipoRepository.findByNombre("Vault Hunters"));
        jugadorRepository.save(shya);

        Jugador miquel = new Jugador("Miquel",LocalDate.of(1972, 10, 2),4,1999,88,"base");
        miquel.setEquipo(equipoRepository.findByNombre("Vault Hunters"));
        jugadorRepository.save(miquel);

        Jugador jose = new Jugador("Jose",LocalDate.of(1974, 10, 5),9,19,8,"base");
        jose.setEquipo(equipoRepository.findByNombre("Vault Hunters"));
        jugadorRepository.save(jose);

        Jugador inquisidor = new Jugador("Inquisidor",LocalDate.of(1425, 1, 29),568,1587,1547,"base");
        inquisidor.setEquipo(equipoRepository.findByNombre("Vault Hunters"));
        jugadorRepository.save(inquisidor);

        Jugador adeu = new Jugador("Adeu",LocalDate.of(1984, 8, 29),15,25,17,"alero");
        adeu.setEquipo(equipoRepository.findByNombre("Vault Hunters"));
        jugadorRepository.save(adeu);

        Jugador hans = new Jugador("Hans",LocalDate.of(1986, 10, 8),7,17,45,"alero");
        hans.setEquipo(equipoRepository.findByNombre("moscow 5"));
        jugadorRepository.save(hans);

        Jugador balon = new Jugador("Balon",LocalDate.of(1964, 1, 21),4,8,9,"pivot");
        balon.setEquipo(equipoRepository.findByNombre("moscow 5"));
        jugadorRepository.save(balon);

        Jugador javi = new Jugador("Javi",LocalDate.of(1991, 4, 24),8,9,17,"pivot");
        javi.setEquipo(equipoRepository.findByNombre("moscow 5"));
        jugadorRepository.save(javi);

        Jugador equestre = new Jugador("Equestre",LocalDate.of(1984, 7, 17),5,2,7,"alero");
        equestre.setEquipo(equipoRepository.findByNombre("moscow 5"));
        jugadorRepository.save(equestre);

        Jugador pote = new Jugador("Pote",LocalDate.of(1982, 3, 4),6,8,2,"alero");
        pote.setEquipo(equipoRepository.findByNombre("moscow 5"));
        jugadorRepository.save(pote);

        Jugador pablo = new Jugador("pablo",LocalDate.of(1996,5,17),2,3,2,"pivot");
        pablo.setEquipo(equipoRepository.findByNombre("Estrella"));
        jugadorRepository.save(pablo);

        Jugador josep = new Jugador("josep",LocalDate.of(1996,3,8),3,5,4,"alero");
        josep.setEquipo(equipoRepository.findByNombre("Estrella"));
        jugadorRepository.save(josep);

        Jugador pau = new Jugador("pau",LocalDate.of(1996,7,12),1,2,3,"base");
        pau.setEquipo(equipoRepository.findByNombre("Estrella"));
        jugadorRepository.save(pau);

        Jugador joan = new Jugador("joan",LocalDate.of(1995,1,3),2,3,4,"pivot");
        joan.setEquipo(equipoRepository.findByNombre("Estrella"));
        jugadorRepository.save(joan);

        Jugador alejandro = new Jugador("alejandro",LocalDate.of(1996,3,23),9,8,7,"alero");
        alejandro.setEquipo(equipoRepository.findByNombre("Estrella"));
        jugadorRepository.save(alejandro);

        Jugador alex= new Jugador("alex",LocalDate.of(1987,10,3),8,9,5,"base");
        alex.setEquipo(equipoRepository.findByNombre("Zanarcan Racers"));
        jugadorRepository.save(alex);

        Jugador berjen = new Jugador("berjen",LocalDate.of(1990,3,7),5,1,2,"pivot");
        berjen.setEquipo(equipoRepository.findByNombre("Zanarcan Racers"));
        jugadorRepository.save(berjen);

        Jugador darien = new Jugador("darien",LocalDate.of(1989,1,10),11,6,4,"alero");
        darien.setEquipo(equipoRepository.findByNombre("Zanarcan Racers"));
        jugadorRepository.save(darien);

        Jugador faker= new Jugador("faker",LocalDate.of(1993,7,17),10,10,10,"base");
        faker.setEquipo(equipoRepository.findByNombre("Zanarcan Racers"));
        jugadorRepository.save(faker);

        Jugador darc = new Jugador("darc",LocalDate.of(1428,12,1),1,6,0,"pivot");
        darc.setEquipo(equipoRepository.findByNombre("Zanarcan Racers"));
        jugadorRepository.save(darc);


        System.out.println("ENTIDAD JUGADOR");
        System.out.println("a ===============================================================================================================================");
        System.out.println(jugadorRepository.findByNombreContaining("al"));
        System.out.println();


        System.out.println("b ===============================================================================================================================");
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(10));
        System.out.println();

        System.out.println("c ===============================================================================================================================");
        System.out.println(jugadorRepository.findByAsistenciasBetween(5, 7));
        System.out.println();

        System.out.println("d ===============================================================================================================================");
        System.out.println(jugadorRepository.findByPosicion("alero"));
        System.out.println();

        System.out.println("e ===============================================================================================================================");
        System.out.println(jugadorRepository.findByFechaNacBetween(LocalDate.of(1400,1,1),LocalDate.of(1500,1,1)));
        System.out.println();

        System.out.println("f ===============================================================================================================================");
        System.out.println(jugadorRepository.mostrarMediasAgrupadoPorPosicion());
        System.out.println();

        System.out.println("g ===============================================================================================================================");
        System.out.println(jugadorRepository.mostrarMediasMinimosMaximosAgrupadoPorPosicion());
        System.out.println();


        System.out.println("ENTIDAD EQUIPO");
        System.out.println("a ===============================================================================================================================");
        System.out.println(equipoRepository.findByLocalidad("barcelona"));
        System.out.println();

        System.out.println("b ===============================================================================================================================");
        System.out.println(jugadorRepository.findByEquipoNombre("Vault Hunters"));
        System.out.println();

        System.out.println("c ===============================================================================================================================");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("Vault Hunters", "alero"));
        System.out.println();

        System.out.println("d ===============================================================================================================================");
        System.out.println(jugadorRepository.findTopByEquipoNombreOrderByCanastasDesc("Vault Hunters"));
        System.out.println();

    }

}
