package daw.basket.data;

import daw.basket.data.service.EquipoService;
import daw.basket.data.service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sun.awt.EventQueueItem;

@SpringBootApplication
public class DataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataApplication.class, args);


		context.getBean(EquipoService.class).testEquipo();
		context.getBean(JugadorService.class).testJugador();
	}
}
