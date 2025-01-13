package graficar_planos;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CL_GRAFICARXYZ implements CL_TRAZADOR {
    private CL_PUNTO[] puntos2d = new CL_PUNTO[40000];
    private CL_PUNTO3D[] puntos3d = new CL_PUNTO3D[40000];
    private int limite_inf;
    private int limite_sup;
    
    public void set_puntos2d(CL_PUNTO[] x){
        puntos2d = x;
    }
    
    public void set_puntos3d(CL_PUNTO3D[] x){
        puntos3d = x;
    }
    
    public void set_limite_inf(int x){
        limite_inf = x;
    }
    
    public void set_limite_sup(int x){
        limite_sup = x;
    }
    
    public CL_PUNTO[] get_puntos2d(){
        return puntos2d; 
    }
    
    public CL_PUNTO3D[] get_puntos3d(){
        return puntos3d;
    }
    
    public int get_limite_inf(){
        return limite_inf;
    }
    
    public int get_limite_sup(){
        return limite_sup;
    }
    
    public void generar_planoXY(int x1, int y1, double ag){
        int x;
        int y;
        int z=0;
        int i=0;
  
        for (x = limite_inf; x <= limite_sup; x++) {
                if (x > limite_sup) {
            break; 
        }
        for (y = limite_inf; y <= limite_sup;){
               if (y > limite_sup) {
            break; 
        }     
                

            puntos3d[i].set_angulo(ag);
            puntos3d[i].set_abscisa(x);
            puntos3d[i].set_ordenada(y);
            puntos3d[i].set_cota(z);
            puntos2d[i] = puntos3d[i].d2_to_3d();
            puntos2d[i].geo_to_graf(x1, y1);
            
            i++;
            y++;
            }
        x++;
      }
    }
    
    public void generar_planoXZ(int x1, int y1, double ag){
        int x;
        int y=0;
        int z;
        int i=0;
  
        for (x = limite_inf; x <= limite_sup; x++) {
                if (x > limite_sup) {
            break; 
        }
                for (z = limite_inf; z <= limite_sup;){
               if (z > limite_sup) {
            break; 
        }  
                

            puntos3d[i].set_angulo(ag);
            puntos3d[i].set_abscisa(x);
            puntos3d[i].set_ordenada(y);
            puntos3d[i].set_cota(z);
            puntos2d[i] = puntos3d[i].d2_to_3d();
            puntos2d[i].geo_to_graf(x1, y1);
            z++;
            i++;
            
                }
            x++;    
      }
    
    }
    
    public void generar_planoYZ(int x1, int y1, double ag){
        int x=0;
        int y;
        int z;
        int i=0;
  
        for (y = limite_inf; y <= limite_sup; y++) {
                if (x > limite_sup) {
            break; 
        }
                for (z = limite_inf; z <= limite_sup;){
               if (z > limite_sup) {
            break; 
        }  

            puntos3d[i].set_angulo(ag);
            puntos3d[i].set_abscisa(x);
            puntos3d[i].set_ordenada(y);
            puntos3d[i].set_cota(z);
            puntos2d[i] = puntos3d[i].d2_to_3d();
            puntos2d[i].geo_to_graf(x1, y1);
            z++;
            i++;
            }
          y++;      
      }
    }
   
    public void dibuja(Graphics g){
        
        for (int i = 0; i < puntos2d.length; i++) {
            Color verdet = new Color(0, 255, 0, 128);
            g.setColor(verdet);
            int abscisa = puntos2d[i].get_abscisa();
            int ordenada = puntos2d[i].get_ordenada();
            
            g.drawOval(abscisa, ordenada, 1, 1);
        }
    }
    
    public CL_GRAFICARXYZ() {
        for (int i = 0; i < puntos2d.length; i++) {
            puntos2d[i] = new CL_PUNTO();
        }
    
        for (int i = 0; i < puntos3d.length; i++) {
            puntos3d[i] = new CL_PUNTO3D();
        }
    }
}

    
   