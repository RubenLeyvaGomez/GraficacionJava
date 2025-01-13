package graficar_planos;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
import javax.swing.*;
import java.awt.*;

public class CL_LINEA implements CL_TRAZADOR
{
    private CL_PUNTO p_inicial;
    private CL_PUNTO p_final;
    
    public void set_p_inicial(CL_PUNTO x)
    {
        p_inicial = x;
    }
    
    public void set_p_final (CL_PUNTO x)
    {
        p_final = x;
    }
    
    public CL_PUNTO get_p_inicial()
    {
        return p_inicial;
    }
    
    public CL_PUNTO get_p_final(){
        return p_final;
    }
    
    public void linea(CL_PUNTO pi, CL_PUNTO pf){
        p_inicial = pi;
        p_final = pf;
    }
    
    public  void dibuja(Graphics g){
  
        g.drawLine(p_inicial.get_abscisa(), p_inicial.get_ordenada(), p_final.get_abscisa(), p_final.get_ordenada());

    }
    
}