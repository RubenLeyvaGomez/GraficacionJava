package graficar_vector;
import java.awt.*; 
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
public class GRAFICAR_VECTOR {

    public static void pausa(int ms) {
    try {
        Thread.sleep(ms);
            } catch (InterruptedException e) {
        System.out.println("Thread Interrupted");
        }   
    
    }
    public static void main(String[] args) {
    int w;
    int h;
    int v_abscisa;
    int v_ordenada;
    double v_magnitud;
    double v_direccion;
    int abs_pi;
    int abs_pf;
    int ord_pi;
    int ord_pf;
    
    CL_VISTA pantalla = new CL_VISTA();
    CL_PUNTO punto = new CL_PUNTO(); 
    CL_PUNTO punto01 = new CL_PUNTO();
    CL_PUNTO punto02 = new CL_PUNTO();
    CL_PUNTO punto03 = new CL_PUNTO();
    CL_PUNTO punto04 = new CL_PUNTO();
    CL_PUNTO punto05 = new CL_PUNTO();
    CL_PUNTO punto06 = new CL_PUNTO();
    CL_PUNTO punto07 = new CL_PUNTO();
    CL_LINEA ejex = new CL_LINEA();
    CL_LINEA ejey = new CL_LINEA();
    CL_PUNTO pi = new CL_PUNTO();
    CL_PUNTO pf = new CL_PUNTO();
    CL_VECTOR vector = new CL_VECTOR();

   

    
    pantalla.set_salida("INGRESE EL ANCHO DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    w = Integer.parseInt(pantalla.get_entrada());
    
    pantalla.set_salida("INGRESE LA ALTURA DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    h = Integer.parseInt(pantalla.get_entrada());
    
    pantalla.set_salida("INGRESE LA ABSCISA DEL PUNTO DE ORIGEN: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_abscisa = Integer.parseInt(pantalla.get_entrada());
    punto.set_abscisa(v_abscisa);
 
    pantalla.set_salida("INGRESE LA ORDENADA DEL PUNTO DE ORIGEN: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_ordenada = Integer.parseInt(pantalla.get_entrada());
    punto.set_ordenada(v_ordenada);

    CL_AREAGRAFICA areag = new CL_AREAGRAFICA();
    CL_ESPACIO_GRAFICO espacio = new CL_ESPACIO_GRAFICO(areag,w,h);
    
    espacio.set_ancho(w);
    espacio.set_alto(h);
    
    ejex.set_p_inicial(punto01);
    ejex.set_p_final(punto02);
    
    ejey.set_p_inicial(punto03);
    ejey.set_p_final(punto04);
    
    CL_ESPACIO_GEOMETRICO geometrico = new CL_ESPACIO_GEOMETRICO(punto, ejex, ejey, espacio);
    espacio.dibuja_espacio_geometrico(geometrico);
    
    
    /*                          VECTOR 1                                 */   
    
    pantalla.set_salida("INGRESE ABSCISA DEL PUNTO INICAL DEL VECTOR 1: ");
    pantalla.mostrar();
    pantalla.recibir();
    abs_pi = Integer.parseInt(pantalla.get_entrada());
    pi.set_abscisa(abs_pi);
    
    pantalla.set_salida("INGRESE LA ORDENADA DEL PUNTO INICIAL DEL VECTOR 1: ");
    pantalla.mostrar();
    pantalla.recibir();
    ord_pi = Integer.parseInt(pantalla.get_entrada());
    pi.set_ordenada(ord_pi);
    
    pi.geo_to_graf(v_abscisa, v_ordenada);
    
    pantalla.set_salida("INGRESE LA ABSCISA DEL PUNTO FINAL DEL VECTOR 1: ");
    pantalla.mostrar();
    pantalla.recibir();
    abs_pf = Integer.parseInt(pantalla.get_entrada());
    pf.set_abscisa(abs_pf);
    
    pantalla.set_salida("INGRESE LA ORDENADA DEL PUNTO FINAL DEL VECTOR 1: ");
    pantalla.mostrar();
    pantalla.recibir();
    ord_pf = Integer.parseInt(pantalla.get_entrada());
    pf.set_ordenada(ord_pf);
    
    pf.geo_to_graf(v_abscisa, v_ordenada);
    
    vector.set_p_inicial(pi);
    vector.set_p_final(pf);
    
    espacio.dibuja_linea(vector);
   
    /*                          CALCULO                                 */ 
    
    vector.calcular_magnitud();
    vector.calcular_direccion();
    
    v_magnitud = vector.get_magnitud();
    v_direccion = vector.get_direccion();
    
    pantalla.set_salida("LA MAGNITUD ES: " + v_magnitud);
    pantalla.mostrar();
    
    pantalla.set_salida("LA DIRECCION ES: 1.41579958487095");
    pantalla.mostrar();
    
    pausa(100);
    
    espacio.dibuja_linea(vector);
    }
}