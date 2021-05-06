package app;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Clase Persona Prueba de la librer�a lombok para reducir c�digo
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
