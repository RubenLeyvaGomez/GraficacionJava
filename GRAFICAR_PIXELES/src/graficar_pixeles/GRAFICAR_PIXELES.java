package graficar_pixeles;
import java.awt.*;        
public class GRAFICAR_PIXELES {
    
    
    public static void pausa(int ms) {
    try {
        Thread.sleep(ms);
    } catch (InterruptedException e) {
        System.out.println("Thread Interrupted");
    }
    
    }

    public static void main(String[] args) {
    int x;
    int y;
    int v_abscisa;
    int v_ordenada; 
    
    CL_VISTA pantalla = new CL_VISTA();
    CL_PUNTO punto = new CL_PUNTO();
    CL_PUNTO punto01 = new CL_PUNTO();

    pantalla.set_salida("INGRESE EL ANCHO DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    x = Integer.parseInt(pantalla.get_entrada());
    
    pantalla.set_salida("INGRESE LA ALTURA DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    y = Integer.parseInt(pantalla.get_entrada());

    pantalla.set_salida("INGRESE LA ABSCISA: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_abscisa = Integer.parseInt(pantalla.get_entrada());
    punto.set_abscisa(v_abscisa);
 
    pantalla.set_salida("INGRESE LA ORDENADA: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_ordenada = Integer.parseInt(pantalla.get_entrada());
    punto.set_ordenada(v_ordenada);

    CL_AREAGRAFICA areag = new CL_AREAGRAFICA();
    CL_ESPACIO_GRAFICO espacio = new CL_ESPACIO_GRAFICO(areag,x,y);
    
    pausa(100);
    
    espacio.dibuja_punto(punto);
    
    pausa(100);
    
    espacio.dibuja_punto(punto01);
        
    
    }
    
}

