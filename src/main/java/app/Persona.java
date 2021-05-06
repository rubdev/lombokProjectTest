package app;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Persona Prueba de la librería lombok para reducir código
 * 
 * @author rubdev
 *
 */
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Persona {

	String sexo;
	private int edad;
	private double peso;
	private double altura;
	private String nombre;

}
