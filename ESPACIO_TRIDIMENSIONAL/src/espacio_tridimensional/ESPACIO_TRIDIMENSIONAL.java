package espacio_tridimensional;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
public class ESPACIO_TRIDIMENSIONAL {
    
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
        double v_angulo; 
        double v_num;
        double v_den;
        
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
        CL_LINEA ejez = new CL_LINEA();
        
        pantalla.set_salida("INGRESE EL ANCHO DEL ESPACIO GRAFICO: ");
        pantalla.mostrar();
        pantalla.recibir();
        w = Integer.parseInt(pantalla.get_entrada());
        
        pantalla.set_salida("INGRESE EL ALTO DEL ESPACIO GRAFICO: ");
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
        
        punto01.set_abscisa(0);
        punto01.set_ordenada(0);
    
        punto02.set_abscisa(0);
        punto02.set_ordenada(0);
    
        punto03.set_abscisa(0);
        punto03.set_ordenada(0);
    
        punto04.set_abscisa(0);
        punto04.set_ordenada(0);
    
        punto05.set_abscisa(0);
        punto05.set_ordenada(0);
    
        punto06.set_abscisa(0);
        punto06.set_ordenada(0);
        
        punto07.set_abscisa(0);
        punto07.set_ordenada(0);
        
        CL_AREAGRAFICA areag = new CL_AREAGRAFICA();
        CL_ESPACIO_GRAFICO espacio = new CL_ESPACIO_GRAFICO(areag,w,h);
        
        ejex.set_p_inicial(punto01);
        ejex.set_p_final(punto02);
    
        ejey.set_p_inicial(punto03);
        ejey.set_p_final(punto04);

        ejez.set_p_inicial(punto05);
        ejez.set_p_final(punto06);
        
        pantalla.set_salida("ANGULO");
        pantalla.mostrar();
        pantalla.set_salida("INGRESE NUMERADOR: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_num = Double.parseDouble(pantalla.get_entrada());
        
        pantalla.set_salida("INGRESE DENOMINADOR: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_den = Double.parseDouble(pantalla.get_entrada());
        
        v_angulo = ((v_num/v_den)*Math.PI);
        
        CL_ESPACIO_GEOMETRICO geometrico = new CL_ESPACIO_GEOMETRICO(punto, ejex, ejey, espacio,ejez, v_abscisa, v_ordenada, punto07, v_angulo);
        
        pausa(100);
        espacio.dibuja_espacio_geometrico3D(geometrico);
        
    }
    
}