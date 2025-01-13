/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graficar_funciones;

import java.awt.*; 
public class GRAFICAR_FUNCIONES {
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
    int v_inferior;
    int v_superior;
    
    CL_VISTA pantalla = new CL_VISTA();
    CL_PUNTO punto = new CL_PUNTO(); 
    CL_PUNTO punto01 = new CL_PUNTO();
    CL_PUNTO punto02 = new CL_PUNTO();
    CL_PUNTO punto03 = new CL_PUNTO();
    CL_PUNTO punto04 = new CL_PUNTO();
    CL_PUNTO punto05 = new CL_PUNTO();
    CL_LINEA ejex = new CL_LINEA();
    CL_LINEA ejey = new CL_LINEA();

    
    pantalla.set_salida("INGRESE EL ANCHO DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    x = Integer.parseInt(pantalla.get_entrada());
    
    pantalla.set_salida("INGRESE LA ALTURA DEL ESPACIO GRAFICO: ");
    pantalla.mostrar();
    pantalla.recibir();
    y = Integer.parseInt(pantalla.get_entrada());
    
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
    
    CL_GRAFICARXY graficar = new CL_GRAFICARXY();

    pantalla.set_salida("INGRESE EL DOMINIO");
    pantalla.mostrar();
    pantalla.set_salida("LIMITE INFERIOR: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_inferior = Integer.parseInt(pantalla.get_entrada());
    graficar.set_limite_inf(v_inferior);
    
    pantalla.set_salida("LIMITE SUPERIOR: ");
    pantalla.mostrar();
    pantalla.recibir();
    v_superior = Integer.parseInt(pantalla.get_entrada());
    graficar.set_limite_sup(v_superior);
    
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

    CL_AREAGRAFICA areag = new CL_AREAGRAFICA();
    CL_ESPACIO_GRAFICO espacio = new CL_ESPACIO_GRAFICO(areag,x,y);
    
    espacio.set_ancho(x);
    espacio.set_alto(y);
    
    ejex.set_p_inicial(punto01);
    ejex.set_p_final(punto02);
    
    ejey.set_p_inicial(punto03);
    ejey.set_p_final(punto04);
    
    CL_ESPACIO_GEOMETRICO geometrico = new CL_ESPACIO_GEOMETRICO(punto, ejex, ejey, espacio);
    
    espacio.dibuja_espacio_geometrico(geometrico);
    
    pausa(100);
    
    graficar.generar_grafica(v_abscisa, v_ordenada);
    
    pausa(100);
    
    espacio.dibuja_grafica(graficar);
   
    }
    
}
