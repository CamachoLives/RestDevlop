package Stian.Crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplication {

	public static void main(String[] args) {

        final var Nombre = "Ubaldo Acosta Soto";
        final var Empresa = "Global Mentoring";
        final var Dominio = "com.mx";

        System.out.println("Email --> " + Nombre.toLowerCase().replace(" ", ".") + "@" + Empresa.toLowerCase().concat(".").replace(" ","") + Dominio);

		//SpringApplication.run(CrudApplication.class, args);
	}

}
