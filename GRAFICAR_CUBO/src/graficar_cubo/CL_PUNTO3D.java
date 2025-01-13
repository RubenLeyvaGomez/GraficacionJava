package graficar_cubo;

/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
public class CL_PUNTO3D {
    private int abscisa;
    private int ordenada;
    private int cota;
    private double angulo;
    
    public void set_abscisa(int x){
        abscisa = x;
    }
    
    public void set_ordenada(int x){
        ordenada = x;
    }
    
    public void set_cota(int x){
        cota = x;
    }
    
    public void set_angulo(double x){
        angulo = x;
    }
    
    public int get_abscisa(){
        return abscisa;
    }
    
    public int get_ordenada(){
        return ordenada;
    }
    
    public int get_cota(){
        return cota;
    }
    
    public double get_angulo(){
        return angulo;
    }
    
    public CL_PUNTO d2_to_3d(){
        int abs;
        int ord;
        int m;
        int n;
        double m1;
        double n1;
        CL_PUNTO mipunto2d = new CL_PUNTO();
        
        m1 = (cota*Math.cos(angulo));
        n1 = (cota*Math.sin(angulo));
        m = (int) (Math.round(m1));
        n = (int) (Math.round(n1));
       
        abs = m + abscisa;
        ord = n + ordenada;
        
        mipunto2d.set_abscisa(abs);
        mipunto2d.set_ordenada(ord);
        
        return mipunto2d;
        
    }
    
}