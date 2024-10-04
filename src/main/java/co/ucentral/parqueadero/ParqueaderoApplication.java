package co.ucentral.parqueadero;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ParqueaderoApplication {
	private static final Logger log = LogManager.getLogger(ParqueaderoApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ParqueaderoApplication.class, args);
		log.info("Inicio correctamente la aplicacion");
	}

}
