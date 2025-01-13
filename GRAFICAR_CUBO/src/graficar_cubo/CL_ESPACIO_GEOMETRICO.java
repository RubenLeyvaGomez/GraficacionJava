package graficar_cubo;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
import javax.swing.*;
import java.awt.*;
public class CL_ESPACIO_GEOMETRICO implements CL_TRAZADOR {
    private CL_PUNTO origen;
    private CL_LINEA ejex ;
    private CL_LINEA ejey; 
    private CL_LINEA ejez;
    private double angulo;
    
    
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
    
    public void set_ejez (CL_LINEA x)
    {
        ejez = x;
    }
    
    public void set_angulo (double x)
    {
        angulo = x;
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
    
    public CL_LINEA get_ejez()
    {
        return ejez;
    }
    
    public double angulo(){
        return angulo;
    }
    
    public CL_ESPACIO_GEOMETRICO (CL_PUNTO o, CL_LINEA ex, CL_LINEA ey, CL_ESPACIO_GRAFICO eg, CL_LINEA ez,int x1, int y1, CL_PUNTO pz, double ang)
    {
        origen = o;
        ejex = ex;
        ejey = ey;
        ejez = ez;
        angulo = ang;
        int n;
        int m;
        int d;
        double n1;
        double m1;
        
        d = eg.get_ancho()/2;
        //angulo = (int)((ang*180)/3.1416);
        n1 = d*Math.cos(angulo);
        m1 = d*Math.sin(angulo);
        n = (int)Math.round(n1);
        m = (int)Math.round(m1);
        
        pz.set_abscisa(n);
        pz.set_ordenada(m);
        pz.geo_to_graf(x1, y1);
        
        ejex.get_p_inicial().set_abscisa(0);
        ejex.get_p_inicial().set_ordenada(origen.get_ordenada());
        ejex.get_p_final().set_abscisa(eg.get_ancho());
        ejex.get_p_final().set_ordenada(origen.get_ordenada());
        
        ejey.get_p_inicial().set_abscisa(origen.get_abscisa());
        ejey.get_p_inicial().set_ordenada(0);
        ejey.get_p_final().set_abscisa(origen.get_abscisa());
        ejey.get_p_final().set_ordenada(eg.get_alto());
        
        ejez.get_p_inicial().set_abscisa(x1);
        ejez.get_p_inicial().set_ordenada(y1);
        ejez.get_p_final().set_abscisa(pz.get_abscisa());
        ejez.get_p_final().set_ordenada(pz.get_ordenada());
       
    }
    
    public void dibuja(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(ejex.get_p_inicial().get_abscisa(), ejex.get_p_inicial().get_ordenada(), ejex.get_p_final().get_abscisa(), ejex.get_p_final().get_ordenada());
        g.drawLine(ejey.get_p_inicial().get_abscisa(), ejey.get_p_inicial().get_ordenada(), ejey.get_p_final().get_abscisa(), ejey.get_p_final().get_ordenada());
        g.drawLine(ejez.get_p_inicial().get_abscisa(), ejez.get_p_inicial().get_ordenada(), ejez.get_p_final().get_abscisa(), ejez.get_p_final().get_ordenada());
    }
    
}