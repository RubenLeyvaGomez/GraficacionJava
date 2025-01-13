package graficar_cubo;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
public class GRAFICAR_CUBO {
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
        int v_longitud;
        int v_opcion;
        double v_ang;
        
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

        //CUBO
        CL_PUNTO ari1 = new CL_PUNTO();
        CL_PUNTO ari2 = new CL_PUNTO();
        CL_PUNTO ari3 = new CL_PUNTO();
        CL_PUNTO ari4 = new CL_PUNTO();
        CL_PUNTO ari5 = new CL_PUNTO();
        CL_PUNTO ari6 = new CL_PUNTO();
        CL_PUNTO ari7 = new CL_PUNTO();
        CL_PUNTO ari8 = new CL_PUNTO();
        CL_PUNTO3D a1 = new CL_PUNTO3D();
        CL_PUNTO3D a2 = new CL_PUNTO3D();
        CL_PUNTO3D a3 = new CL_PUNTO3D();
        CL_PUNTO3D a4 = new CL_PUNTO3D();
        CL_PUNTO3D a5 = new CL_PUNTO3D();
        CL_PUNTO3D a6 = new CL_PUNTO3D();
        CL_PUNTO3D a7 = new CL_PUNTO3D();
        CL_PUNTO3D a8 = new CL_PUNTO3D();
        
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
        
        CL_ESPACIO_GEOMETRICO geometrico = new CL_ESPACIO_GEOMETRICO(punto, ejex, ejey, espacio,ejez, v_abscisa, v_ordenada, punto07, v_angulo);
        
        espacio.dibuja_espacio_geometrico3D(geometrico);
        
        pantalla.set_salida("INGRESE LONGITUD DEL CUBO: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_longitud = Integer.parseInt(pantalla.get_entrada());
        
        int v_long = 100;
        
        CL_CUBO cubo = new CL_CUBO(a1, a2, a3, a4, a5, a6, a7, a8, ari1, ari2, ari3, ari4, ari5, ari6, ari7, ari8, v_angulo,v_abscisa, v_ordenada, v_longitud);
        //CL_CUBO cubo1 = new CL_CUBO(a1, a2, a3, a4, a5, a6, a7, a8, ari1, ari2, ari3, ari4, ari5, ari6, ari7, ari8, v_angulo,v_abscisa, v_ordenada, v_longitud);
        
        //espacio.dibuja_cubo(cubo);
        
        pantalla.set_salida("¿EN DONDE QUIERES ROTAR EL CUBO?\n 1) Eje X\n 2) Eje Y\n 3) EJE Z ");
        pantalla.mostrar();
        pantalla.set_salida("ELIGE UN NUMERO: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_opcion = Integer.parseInt(pantalla.get_entrada());
        
        pantalla.set_salida("INGRESA ANGULO DE INCLINACION: ");
        pantalla.mostrar();
        pantalla.recibir();
        v_ang = Double.parseDouble(pantalla.get_entrada());
        
        int v_ang2 = (int) Math.round(v_ang);
        
        int v_ang1 = (int)(Math.toDegrees(v_ang2));
        
        
        
        CL_ROTACION rotacion = new CL_ROTACION(cubo, v_ang1);
        
        switch(v_opcion){
            case 1:
               
                rotacion.rotacion_x();
        
                CL_CUBO cubox = new CL_CUBO();
                
        
                cubox.transforma(rotacion.get_forma(), v_abscisa, v_ordenada, v_angulo);
        
                pantalla.set_salida("PUNTO: " + cubox.get_arista1().get_abscisa()+ "," + cubox.get_arista1().get_ordenada() + "," + cubox.get_arista1().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO: " + cubox.get_arista2().get_abscisa()+ "," + cubox.get_arista2().get_ordenada() + "," + cubox.get_arista2().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO: " + cubox.get_arista3().get_abscisa()+ "," + cubox.get_arista3().get_ordenada() + "," + cubox.get_arista3().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO: " + cubox.get_arista4().get_abscisa()+ "," + cubox.get_arista4().get_ordenada() + "," + cubox.get_arista4().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO: " + cubox.get_arista5().get_abscisa()+ "," + cubox.get_arista5().get_ordenada() + "," + cubox.get_arista5().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO: " + cubox.get_arista6().get_abscisa()+ "," + cubox.get_arista6().get_ordenada() + "," + cubox.get_arista6().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO: " + cubox.get_arista7().get_abscisa()+ "," + cubox.get_arista7().get_ordenada() + "," + cubox.get_arista7().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO: " + cubox.get_arista8().get_abscisa()+ "," + cubox.get_arista8().get_ordenada() + "," + cubox.get_arista8().get_cota());
                pantalla.mostrar();
                
                pausa(100);
                ari1 = cubox.get_ar1();
                ari2 = cubox.get_ar4();
                
                CL_LINEA lineax = new CL_LINEA();
                lineax.set_p_inicial(ari1);
                lineax.set_p_final(ari2);
                
                //espacio.dibuja_linea(lineax);
                
                espacio.dibuja_cubo(cubox);
                
                break;
            
                case 2:
                    rotacion.rotacion_y();
        
                CL_CUBO cuboy = new CL_CUBO();
        
                cuboy.transforma(rotacion.get_forma(), v_abscisa, v_ordenada, v_angulo);
                
                
                pantalla.set_salida("PUNTO 1: " + cuboy.get_arista1().get_abscisa()+ "," + cuboy.get_arista1().get_ordenada() + "," + cuboy.get_arista1().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 2: " + cuboy.get_arista2().get_abscisa()+ "," + cuboy.get_arista2().get_ordenada() + "," + cuboy.get_arista2().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 3: " + cuboy.get_arista3().get_abscisa()+ "," + cuboy.get_arista3().get_ordenada() + "," + cuboy.get_arista3().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 4: " + cuboy.get_arista4().get_abscisa()+ "," + cuboy.get_arista4().get_ordenada() + "," + cuboy.get_arista4().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 5: " + cuboy.get_arista5().get_abscisa()+ "," + cuboy.get_arista5().get_ordenada() + "," + cuboy.get_arista5().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 6: " + cuboy.get_arista6().get_abscisa()+ "," + cuboy.get_arista6().get_ordenada() + "," + cuboy.get_arista6().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 7: " + cuboy.get_arista7().get_abscisa()+ "," + cuboy.get_arista7().get_ordenada() + "," + cuboy.get_arista7().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 8: " + cuboy.get_arista8().get_abscisa()+ "," + cuboy.get_arista8().get_ordenada() + "," + cuboy.get_arista8().get_cota());
                pantalla.mostrar();
                
                
                
                pausa(100);
                espacio.dibuja_cubo(cuboy);
                break;
              
                
            case 3: 
                rotacion.rotacion_z();
        
                CL_CUBO cuboz = new CL_CUBO();
        
                cuboz.transforma(rotacion.get_forma(), v_abscisa, v_ordenada, v_angulo);
                
                
                pantalla.set_salida("PUNTO 1: " + cuboz.get_arista1().get_abscisa()+ "," + cuboz.get_arista1().get_ordenada() + "," + cuboz.get_arista1().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 2: " + cuboz.get_arista2().get_abscisa()+ "," + cuboz.get_arista2().get_ordenada() + "," + cuboz.get_arista2().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 3: " + cuboz.get_arista3().get_abscisa()+ "," + cuboz.get_arista3().get_ordenada() + "," + cuboz.get_arista3().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 4: " + cuboz.get_arista4().get_abscisa()+ "," + cuboz.get_arista4().get_ordenada() + "," + cuboz.get_arista4().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 5: " + cuboz.get_arista5().get_abscisa()+ "," + cuboz.get_arista5().get_ordenada() + "," + cuboz.get_arista5().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 6: " + cuboz.get_arista6().get_abscisa()+ "," + cuboz.get_arista6().get_ordenada() + "," + cuboz.get_arista6().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 7: " + cuboz.get_arista7().get_abscisa()+ "," + cuboz.get_arista7().get_ordenada() + "," + cuboz.get_arista7().get_cota());
                pantalla.mostrar();
                pantalla.set_salida("PUNTO 8: " + cuboz.get_arista8().get_abscisa()+ "," + cuboz.get_arista8().get_ordenada() + "," + cuboz.get_arista8().get_cota());
                pantalla.mostrar();
                
                
                
                pausa(100);
                espacio.dibuja_cubo(cuboz);
                
                break;
                
             
        }
        
        
    } 
    
}