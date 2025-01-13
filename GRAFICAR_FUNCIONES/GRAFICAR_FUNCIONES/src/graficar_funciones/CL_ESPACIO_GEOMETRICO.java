package graficar_funciones;
import javax.swing.*;
import java.awt.*;
public class CL_ESPACIO_GEOMETRICO implements CL_TRAZADOR {
    private CL_PUNTO origen;
    private CL_LINEA ejex ;
    private CL_LINEA ejey; 
    
    
    public void set_origen (CL_PUNTO x)
    {
        origen = x;
    }
    
    public void set_ejex(CL_LINEA x)
    {
        ejex = x;
    }
    
    public void set_ejey(CL_LINEA x)
    {
        ejey = x;
    }
    
    public CL_PUNTO get_origen()
    {
        return origen;
    }
    
    public CL_LINEA get_ejex()
    {
        return ejex;
    }
    
    public CL_LINEA get_ejey()
    {
        return ejey;
    }
    
    public CL_ESPACIO_GEOMETRICO (CL_PUNTO o, CL_LINEA ex, CL_LINEA ey, CL_ESPACIO_GRAFICO eg)
    {
        origen = o;
        ejex = ex;
        ejey = ey;
        
        ejex.get_p_inicial().set_abscisa(0);
        ejex.get_p_inicial().set_ordenada(origen.get_ordenada());
        ejex.get_p_final().set_abscisa(eg.get_ancho());
        ejex.get_p_final().set_ordenada(origen.get_ordenada());
        
        ejey.get_p_inicial().set_abscisa(origen.get_abscisa());
        ejey.get_p_inicial().set_ordenada(0);

        ejey.get_p_final().set_abscisa(origen.get_abscisa());
        ejey.get_p_final().set_ordenada(eg.get_alto());
       
    }
    
    public void dibuja(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(ejex.get_p_inicial().get_abscisa(), ejex.get_p_inicial().get_ordenada(), ejex.get_p_final().get_abscisa(), ejex.get_p_final().get_ordenada());
        g.drawLine(ejey.get_p_inicial().get_abscisa(), ejey.get_p_inicial().get_ordenada(), ejey.get_p_final().get_abscisa(), ejey.get_p_final().get_ordenada());
    }
    
}

