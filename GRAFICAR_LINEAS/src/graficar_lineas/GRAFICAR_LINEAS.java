package graficar_lineas;

public class GRAFICAR_LINEAS {
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
    CL_LINEA linea1 = new CL_LINEA();

    pantalla.set_salida("INGRESE EL ANCHO DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    x = Integer.parseInt(pantalla.get_entrada());
    
    pantalla.set_salida("INGRESE LA ALTURA DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    y = Integer.parseInt(pantalla.get_entrada());

    pantalla.set_salida("INGRESE LA ABSCISA DEL PUNTO 1: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_abscisa = Integer.parseInt(pantalla.get_entrada());
    punto.set_abscisa(v_abscisa);
 
    pantalla.set_salida("INGRESE LA ORDENADA DEL PUNTO 1: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_ordenada = Integer.parseInt(pantalla.get_entrada());
    punto.set_ordenada(v_ordenada);
    
    pantalla.set_salida("INGRESE LA ABSCISA DEL PUNTO 2: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_abscisa = Integer.parseInt(pantalla.get_entrada());
    punto01.set_abscisa(v_abscisa);
 
    pantalla.set_salida("INGRESE LA ORDENADA DEL PUNTO 2: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_ordenada = Integer.parseInt(pantalla.get_entrada());
    punto01.set_ordenada(v_ordenada);
   
    CL_AREAGRAFICA areag = new CL_AREAGRAFICA();
    CL_ESPACIO_GRAFICO espacio = new CL_ESPACIO_GRAFICO(areag,x,y);
    
    linea1.set_p_inicial(punto);
    
    linea1.set_p_final(punto01);
    
    pausa(100);
    
    espacio.dibuja_linea(linea1);
    
    }
    
}