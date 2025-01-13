package graficar_cubo;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
import javax.swing.*;
import java.awt.*;
public class CL_CUBO implements CL_TRAZADOR {
    
    private int longitud;
    private CL_PUNTO3D arista1;
    private CL_PUNTO3D arista2;
    private CL_PUNTO3D arista3;
    private CL_PUNTO3D arista4;
    private CL_PUNTO3D arista5;
    private CL_PUNTO3D arista6;
    private CL_PUNTO3D arista7;
    private CL_PUNTO3D arista8;
    private CL_PUNTO ar1;
    private CL_PUNTO ar2;
    private CL_PUNTO ar3;
    private CL_PUNTO ar4;
    private CL_PUNTO ar5;
    private CL_PUNTO ar6;
    private CL_PUNTO ar7;
    private CL_PUNTO ar8;
    
    public void set_longitud (int x){
        longitud = x;
    }
    
    public void set_arista1 (CL_PUNTO3D x){
        arista1 = x;
    }
    
    public void set_arista2 (CL_PUNTO3D x){
        arista2 = x;
    }
    
    public void set_arista3 (CL_PUNTO3D x){
        arista3 = x;
    }
    
    public void set_arista4 (CL_PUNTO3D x){
        arista4 = x;
    }
    
    public void set_arista5 (CL_PUNTO3D x){
        arista5 = x;
    }
    
    public void set_arista6 (CL_PUNTO3D x){
        arista6 = x;
    }
    
    public void set_arista7 (CL_PUNTO3D x){
        arista7 = x;
    }
    
    public void set_arista8 (CL_PUNTO3D x){
        arista8 = x;
    }
    
    public void set_ar1 (CL_PUNTO x){
        ar1 = x;
    }
    
    public void set_ar2 (CL_PUNTO x){
        ar2 = x;
    }
    
    public void set_ar3 (CL_PUNTO x){
        ar3 = x;
    }
    
    public void set_ar4 (CL_PUNTO x){
        ar4 = x;
    }
    
    public void set_ar5 (CL_PUNTO x){
        ar5 = x;
    }
    
    public void set_ar6 (CL_PUNTO x){
        ar6 = x;
    }
    
    public void set_ar7 (CL_PUNTO x){
        ar7 = x;
    }
    
    public void set_ar8 (CL_PUNTO x){
        ar8 = x;
    }
    
    public int get_longitud(){
        return longitud;
    }
    
    public CL_PUNTO3D get_arista1(){
        return arista1;
    }
    
    public CL_PUNTO3D get_arista2(){
        return arista2;
    }
    
    public CL_PUNTO3D get_arista3(){
        return arista3;
    }
    
    public CL_PUNTO3D get_arista4(){
        return arista4;
    }
    
    public CL_PUNTO3D get_arista5(){
        return arista5;
    }
    
    public CL_PUNTO3D get_arista6(){
        return arista6;
    }
    
    public CL_PUNTO3D get_arista7(){
        return arista7;
    }
    
    public CL_PUNTO3D get_arista8(){
        return arista8;
    }
    
    public CL_PUNTO get_ar1(){
        return ar1;
    }
    
    public CL_PUNTO get_ar2(){
        return ar2;
    }
    
    public CL_PUNTO get_ar3(){
        return ar3;
    }
    
    public CL_PUNTO get_ar4(){
        return ar4;
    }
    
    public CL_PUNTO get_ar5(){
        return ar5;
    }
    
    public CL_PUNTO get_ar6(){
        return ar6;
    }
    
    public CL_PUNTO get_ar7(){
        return ar7;
    }
    
    public CL_PUNTO get_ar8(){
        return ar8;
    }
    
    public CL_CUBO(CL_PUNTO3D a1, CL_PUNTO3D a2, CL_PUNTO3D a3, CL_PUNTO3D a4, CL_PUNTO3D a5, CL_PUNTO3D a6, CL_PUNTO3D a7, CL_PUNTO3D a8, CL_PUNTO ari1, CL_PUNTO ari2, CL_PUNTO ari3, CL_PUNTO ari4, CL_PUNTO ari5, CL_PUNTO ari6, CL_PUNTO ari7, CL_PUNTO ari8, double ag, int x1, int y1, int lon){
        arista1 = a1;
        arista2 =  a2;
        arista3 = a3;
        arista4 = a4;
        arista5 = a5;
        arista6 = a6;
        arista7 = a7;
        arista8 = a8;
        longitud = lon;
        ar1 = ari1;
        ar2 = ari2;
        ar3 = ari3;
        ar4 = ari4;
        ar5 = ari5;
        ar6 = ari6;
        ar7 = ari7;
        ar8 = ari8;
        
        arista1.set_angulo(ag);
        arista1.set_abscisa(0);
        arista1.set_ordenada(0);
        arista1.set_cota(0);
        ar1 = arista1.d2_to_3d();
        ar1.geo_to_graf(x1, y1);
        
        arista2.set_angulo(ag);
        arista2.set_abscisa(0);
        arista2.set_ordenada(longitud);
        arista2.set_cota(0);
        ar2 = arista2.d2_to_3d();
        ar2.geo_to_graf(x1, y1);
        
        arista3.set_angulo(ag);
        arista3.set_abscisa(longitud);
        arista3.set_ordenada(longitud);
        arista3.set_cota(0);
        ar3 = arista3.d2_to_3d();
        ar3.geo_to_graf(x1, y1);
        
        arista4.set_angulo(ag);
        arista4.set_abscisa(longitud);
        arista4.set_ordenada(0);
        arista4.set_cota(0);
        ar4 = arista4.d2_to_3d();
        ar4.geo_to_graf(x1, y1);
        
        arista5.set_angulo(ag);
        arista5.set_abscisa(0);
        arista5.set_ordenada(0);
        arista5.set_cota(longitud);
        ar5 = arista5.d2_to_3d();
        ar5.geo_to_graf(x1, y1);
        
        arista6.set_angulo(ag);
        arista6.set_abscisa(longitud);
        arista6.set_ordenada(0);
        arista6.set_cota(longitud);
        ar6 = arista6.d2_to_3d();
        ar6.geo_to_graf(x1, y1);
        
        arista7.set_angulo(ag);
        arista7.set_abscisa(longitud);
        arista7.set_ordenada(longitud);
        arista7.set_cota(longitud);
        ar7 = arista7.d2_to_3d();
        ar7.geo_to_graf(x1, y1);
        
        arista8.set_angulo(ag);
        arista8.set_abscisa(0);
        arista8.set_ordenada(longitud);
        arista8.set_cota(longitud);
        ar8 = arista8.d2_to_3d();
        ar8.geo_to_graf(x1, y1);
        
    }
    
    public void transforma(CL_CUBO x, int x1, int y1, double ag){
        
       arista1.set_angulo(ag);
       arista1.set_abscisa(x.get_arista1().get_abscisa());
       arista1.set_ordenada(x.get_arista1().get_ordenada());
       arista1.set_cota(x.get_arista1().get_cota());
       ar1 = arista1.d2_to_3d();
       ar1.geo_to_graf(x1, y1);
       
       arista2.set_angulo(ag);
       arista2.set_abscisa(x.get_arista2().get_abscisa());
       arista2.set_ordenada(x.get_arista2().get_ordenada());
       arista2.set_cota(x.get_arista2().get_cota());
       ar2 = arista2.d2_to_3d();
       ar2.geo_to_graf(x1, y1);
       
       arista3.set_angulo(ag);
       arista3.set_abscisa(x.get_arista3().get_abscisa());
       arista3.set_ordenada(x.get_arista3().get_ordenada());
       arista3.set_cota(x.get_arista3().get_cota());
       ar3 = arista3.d2_to_3d();
       ar3.geo_to_graf(x1, y1);
       
       arista4.set_angulo(ag);
       arista4.set_abscisa(x.get_arista4().get_abscisa());
       arista4.set_ordenada(x.get_arista4().get_ordenada());
       arista4.set_cota(x.get_arista4().get_cota());
       ar4 = arista4.d2_to_3d();
       ar4.geo_to_graf(x1, y1);
       
       arista5.set_angulo(ag);
       arista5.set_abscisa(x.get_arista5().get_abscisa());
       arista5.set_ordenada(x.get_arista5().get_ordenada());
       arista5.set_cota(x.get_arista5().get_cota());
       ar5 = arista5.d2_to_3d();
       ar5.geo_to_graf(x1, y1);
       
       arista6.set_angulo(ag);
       arista6.set_abscisa(x.get_arista6().get_abscisa());
       arista6.set_ordenada(x.get_arista6().get_ordenada());
       arista6.set_cota(x.get_arista6().get_cota());
       ar6 = arista6.d2_to_3d();
       ar6.geo_to_graf(x1, y1);
       
       arista7.set_angulo(ag);
       arista7.set_abscisa(x.get_arista7().get_abscisa());
       arista7.set_ordenada(x.get_arista7().get_ordenada());
       arista7.set_cota(x.get_arista7().get_cota());
       ar7 = arista7.d2_to_3d();
       ar7.geo_to_graf(x1, y1);
       
       arista8.set_angulo(ag);
       arista8.set_abscisa(x.get_arista8().get_abscisa());
       arista8.set_ordenada(x.get_arista8().get_ordenada());
       arista8.set_cota(x.get_arista8().get_cota());
       ar8 = arista8 .d2_to_3d();
       ar8.geo_to_graf(x1, y1);
       
       
    }
    
    public void dibuja (Graphics g){
        // PRIMER CUADRO
        g.drawLine(ar1.get_abscisa(), ar1.get_ordenada(), ar2.get_abscisa(), ar2.get_ordenada());
        g.drawLine(ar2.get_abscisa(), ar2.get_ordenada(), ar3.get_abscisa(), ar3.get_ordenada());
        g.drawLine(ar3.get_abscisa(), ar3.get_ordenada(), ar4.get_abscisa(), ar4.get_ordenada());
        g.drawLine(ar4.get_abscisa(), ar4.get_ordenada(), ar1.get_abscisa(), ar1.get_ordenada());
        
        // SEGUNDO CUADRO 
        g.drawLine(ar5.get_abscisa(), ar5.get_ordenada(), ar6.get_abscisa(), ar6.get_ordenada());
        g.drawLine(ar6.get_abscisa(), ar6.get_ordenada(), ar7.get_abscisa(), ar7.get_ordenada());
        g.drawLine(ar7.get_abscisa(), ar7.get_ordenada(), ar8.get_abscisa(), ar8.get_ordenada());
        g.drawLine(ar8.get_abscisa(), ar8.get_ordenada(), ar5.get_abscisa(), ar5.get_ordenada());
        
        // FORMACION DEL CUBO 
        g.drawLine(ar1.get_abscisa(), ar1.get_ordenada(), ar5.get_abscisa(), ar5.get_ordenada());
        g.drawLine(ar2.get_abscisa(), ar2.get_ordenada(), ar8.get_abscisa(), ar8.get_ordenada());
        g.drawLine(ar3.get_abscisa(), ar3.get_ordenada(), ar7.get_abscisa(), ar7.get_ordenada());
        g.drawLine(ar4.get_abscisa(), ar4.get_ordenada(), ar6.get_abscisa(), ar6.get_ordenada());
       
    }
    
    public CL_CUBO() {
        
        longitud = 0;
        arista1 = new CL_PUNTO3D();
        arista2 = new CL_PUNTO3D();
        arista3 = new CL_PUNTO3D();
        arista4 = new CL_PUNTO3D();
        arista5 = new CL_PUNTO3D();
        arista6 = new CL_PUNTO3D();
        arista7 = new CL_PUNTO3D();
        arista8 = new CL_PUNTO3D();
        ar1 = new CL_PUNTO();
        ar2 = new CL_PUNTO();
        ar3 = new CL_PUNTO();
        ar4 = new CL_PUNTO();
        ar5 = new CL_PUNTO();
        ar6 = new CL_PUNTO();
        ar7 = new CL_PUNTO();
        ar8 = new CL_PUNTO();
    }

    
}

