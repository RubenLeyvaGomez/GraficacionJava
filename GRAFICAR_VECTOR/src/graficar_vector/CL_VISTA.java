package graficar_vector;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
import java.util.Scanner;

import java.util.Scanner;

public class CL_VISTA
{
	private String entrada;
	private String salida;

public void set_entrada (String a)
{
	
	entrada = a;
} 

public void set_salida (String a)
{
	
	salida = a;
} 

public String get_entrada() 
{
	
	return entrada;
} 

public String get_salida() 
{
	
	return salida;
} 

public void recibir() 
{
	
	Scanner sc = new Scanner(System.in);
	entrada = sc.nextLine();
} 
public void mostrar()
{
	
	System.out.println(salida);
} 

} 
