package espacio_tridimensional;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
import javax.swing.*;
import java.awt.*;
public class CL_PUNTO implements CL_TRAZADOR
{

  private int abscisa;
  private int ordenada;

  public void set_abscisa(int x)
    {
       abscisa = x;
    }

  public void set_ordenada(int x)
    {
      ordenada = x;
    } 

  public int get_abscisa()
    {
      return abscisa;
    }

  public int get_ordenada()
    {
      return ordenada;
    }

  public void Punto(int x, int y) 
    {
        abscisa = x;
        ordenada = y;
    }

  public void geo_to_graf(int x1, int y1)
    {
      abscisa = (x1 + abscisa);
      ordenada = (y1 - ordenada);
    }

  public void dibuja(Graphics g)
    {
      g.drawOval(this.abscisa,this.ordenada,1,1);
    }
  
}
