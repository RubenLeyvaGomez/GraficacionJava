package graficar_vector;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
public class CL_SUMAV {
    private CL_VECTOR vector1;
    private CL_VECTOR vector2;
    private CL_VECTOR resultante;
    
    public void set_vector1(CL_VECTOR x){
        vector1 = x;
    }
    
    public void set_vector2(CL_VECTOR x){
        vector2 = x;
    }
    
    public void set_resultante(CL_VECTOR x){
        resultante = x;
    }
    
    public CL_VECTOR get_vector1(){
        return vector1;
    }
    
    public CL_VECTOR get_vector2(){
        return vector2;
    }
    
    public CL_VECTOR get_resultante(){
        return resultante;
    }
    
    public void calcular_suma(){
//      resultante.set_p_inicial(vector1.get_p_inicial());
//      resultante.set_p_final(vector2.get_p_final());
        resultante.get_p_inicial().set_abscisa(vector2.get_p_inicial().get_abscisa() + vector1.get_p_inicial().get_abscisa());
        resultante.get_p_inicial().set_ordenada(vector2.get_p_inicial().get_ordenada() + vector1.get_p_inicial().get_ordenada());
        
        resultante.get_p_final().set_abscisa(vector2.get_p_final().get_abscisa() + vector1.get_p_final().get_abscisa());
        resultante.get_p_final().set_ordenada(vector2.get_p_final().get_ordenada() + vector1.get_p_final().get_ordenada());
                
    }
    
}
