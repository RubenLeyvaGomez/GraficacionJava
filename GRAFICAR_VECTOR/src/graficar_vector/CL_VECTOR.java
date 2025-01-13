package graficar_vector;

/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
public class CL_VECTOR extends CL_LINEA {
    private String nombre;
    private double magnitud;
    private double direccion; 
    
    public void set_nombre(String x){
        nombre = x;
    }
    
    public void set_magnitud(double x){
        magnitud = x;
    }
    
    public void set_direccion(double x){
        direccion = x;
    }
    
    public String get_nombre(){
        return nombre;
    }
    
    public double get_magnitud(){
        return magnitud;
    }
    
    public double get_direccion(){
        return direccion;
    }
    
    public void calcular_magnitud(){
        magnitud = Math.sqrt(Math.pow(get_p_final().get_abscisa()-get_p_inicial().get_abscisa(),2)+ Math.pow(get_p_final().get_ordenada()-get_p_inicial().get_ordenada(),2));
    }
    
    public void calcular_direccion(){
        double Ordenadas = get_p_final().get_ordenada() - get_p_inicial().get_ordenada();
        double Abscisas = get_p_final().get_abscisa() - get_p_inicial().get_abscisa();
        
            direccion = Math.toDegrees(Math.atan2(Ordenadas, Abscisas));
    }
 
}
