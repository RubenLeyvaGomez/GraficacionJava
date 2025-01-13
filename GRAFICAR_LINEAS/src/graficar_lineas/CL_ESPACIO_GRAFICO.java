package graficar_lineas;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class CL_ESPACIO_GRAFICO extends JFrame
{
  JPanel panel;
  CL_TRAZADOR trazador;
  private int ancho;
  private int alto;

  public void set_ancho(int x)
    {
      ancho = x;
    }

  public void set_alto(int x)
    {
      alto = x;
    }

  public int get_ancho()
    {
      return ancho;
    }

  public int get_alto()
    { 
      return alto;
    }

  public CL_ESPACIO_GRAFICO (CL_TRAZADOR grf, int w, int h)
    { 
      trazador = grf;
      ancho = w;
      alto = h;
 
      initPanel();
      initPantalla();
    }

    private void initPanel() {  
        panel = new JPanel(); 
        add(panel);
        panel.setPreferredSize(new Dimension(ancho, alto));
    }


    private void initPantalla() {  
        setTitle("Graficador");
        setSize(ancho, alto);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        trazador.dibuja(g);  
    }

    public void dibuja_punto(CL_TRAZADOR grf) {
        trazador = grf;
        repaint();
    }
    
    public void dibuja_linea(CL_TRAZADOR grf){
        trazador = grf;
        repaint();
    }
}
    
