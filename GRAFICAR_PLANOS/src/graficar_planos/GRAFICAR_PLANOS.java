package graficar_planos;

public class GRAFICAR_PLANOS {
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
        String v_opcion;
        int v_inf;
        int v_sup;
        String v_curva;
        
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
        CL_PUNTO3D punto3d = new CL_PUNTO3D();
        CL_GRAFICARXYZ graficar = new CL_GRAFICARXYZ();
        
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
        
        punto3d.set_angulo(v_angulo);
        
        CL_ESPACIO_GEOMETRICO geometrico = new CL_ESPACIO_GEOMETRICO(punto, ejex, ejey, espacio,ejez, v_abscisa, v_ordenada, punto07, v_angulo);
        
        pausa(100);
        espacio.dibuja_espacio_geometrico3D(geometrico);
        
        pantalla.set_salida(" a) Plano XY\n b) Plano XZ\n c) Plano YZ\n d) Plano XZ y YZ");
        pantalla.mostrar();
        pantalla.set_salida("ESCOGE UN PLANO: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_opcion = pantalla.get_entrada();
        
        pantalla.set_salida("INGRESE LIMITE INFERIOR: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_inf = Integer.parseInt(pantalla.get_entrada());
        graficar.set_limite_inf(v_inf);
        
        pantalla.set_salida("INGRESE LIMITE SUPERIOR: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_sup = Integer.parseInt(pantalla.get_entrada());
        graficar.set_limite_sup(v_sup);
        
        if (v_opcion.equals("a")) {
            graficar.generar_planoXY(v_abscisa, v_ordenada, v_angulo);
            espacio.dibuja_plano(graficar);
            
        }
        else if (v_opcion.equals("b")) {
            graficar.generar_planoXZ(v_abscisa, v_ordenada, v_angulo);
            espacio.dibuja_plano(graficar);
        } 
        else if (v_opcion.equals("c")) {
            graficar.generar_planoYZ(v_abscisa, v_ordenada, v_angulo);
            espacio.dibuja_plano(graficar);
        } 
        
        else if (v_opcion.equals("d")) {
            graficar.generar_planoXZ(v_abscisa, v_ordenada, v_angulo);
            espacio.dibuja_plano(graficar);
            pausa(15000);
            
            graficar.generar_planoYZ(v_abscisa, v_ordenada, v_angulo);
            espacio.dibuja_plano(graficar);
            
        }
        
    } 
   
}