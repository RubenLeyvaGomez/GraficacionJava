package graficar_cubo;
/**
 AUTOR: RUBÉN ALBERTO LEYVA GÓMEZ
 */
public class CL_ROTACION {
    private CL_CUBO forma;
    private int angulo;
    
    public void set_forma (CL_CUBO x){
        forma = x;
    }
    
    public void set_angulo(int x){
        angulo = x;
    }
    
    public CL_CUBO get_forma(){
        return forma;
    }
    
    public int get_angulo(){
        return angulo;
    }
    
    public CL_ROTACION(CL_CUBO cubo, int ag) {
        forma = cubo;
        angulo = ag;
    }
    
    public void rotacion_x(){
        double abs1;
        double ord1;
        double cota1;
        int abs;
        int ord;
        int cota;
        
        
        
        //PRIMER PUNTO 
        abs = forma.get_arista1().get_abscisa();
        ord = forma.get_arista1().get_ordenada();
        cota = forma.get_arista1().get_cota();
        
        ord1 = (ord*Math.cos(angulo) + cota*Math.sin(angulo));
        ord = (int) Math.round(ord1);
       
        
        cota1 = (-ord*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) Math.round(cota1);
        
        forma.get_arista1().set_abscisa(abs);
        forma.get_arista1().set_ordenada(ord);
        forma.get_arista1().set_cota(cota);
        
        //SEGUNDO PUNTO 
        abs = forma.get_arista2().get_abscisa();
        ord = forma.get_arista2().get_ordenada();
        cota = forma.get_arista2().get_cota();
        
        ord1 = ((ord*Math.cos(angulo)) + (cota*Math.sin(angulo)));
        ord = (int) Math.round(ord1);
        //ord = (int) Math.floor(ord1);
     
        
        cota1 = ((-ord*Math.sin(angulo)) + (cota*Math.cos(angulo)));
        cota = (int) Math.round(cota1);
        
        //cota = (int) Math.floor(cota1);
        
        forma.get_arista2().set_abscisa(abs);
        forma.get_arista2().set_ordenada(ord);
        forma.get_arista2().set_cota(cota);
        
        //TERCER PUNTO 
        abs = forma.get_arista3().get_abscisa();
        ord = forma.get_arista3().get_ordenada();
        cota = forma.get_arista3().get_cota();
        
        ord1 = (ord*Math.cos(angulo) + cota*Math.sin(angulo));
        ord = (int) Math.round(ord1);
        
        cota1 = (-ord*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) Math.round(cota1);
        
        forma.get_arista3().set_abscisa(abs);
        forma.get_arista3().set_ordenada(ord);
        forma.get_arista3().set_cota(cota);
        
        //CUARTO PUNTO 
        abs = forma.get_arista4().get_abscisa();
        ord = forma.get_arista4().get_ordenada();
        cota = forma.get_arista4().get_cota();
        
        ord1 = (ord*Math.cos(angulo) + cota*Math.sin(angulo));
        ord = (int) Math.round(ord1);
        
        cota1 = (-ord*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) Math.round(cota1);
        
        forma.get_arista4().set_abscisa(abs);
        forma.get_arista4().set_ordenada(ord);
        forma.get_arista4().set_cota(cota);
        
        //QUINTO PUNTO 
        abs = forma.get_arista5().get_abscisa();
        ord = forma.get_arista5().get_ordenada();
        cota = forma.get_arista5().get_cota();
        
        ord1 = (ord*Math.cos(angulo) + cota*Math.sin(angulo));
        ord = (int) Math.round(ord1);
        
        cota1 = (-ord*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) Math.round(cota1);
        
        forma.get_arista5().set_abscisa(abs);
        forma.get_arista5().set_ordenada(ord);
        forma.get_arista5().set_cota(cota);
        
        //SEXTO PUNTO 
        abs = forma.get_arista6().get_abscisa();
        ord = forma.get_arista6().get_ordenada();
        cota = forma.get_arista6().get_cota();
        
        ord1 = (ord*Math.cos(angulo) + cota*Math.sin(angulo));
        ord = (int) Math.round(ord1);
        
        cota1 = (-ord*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) Math.round(cota1);
        
        forma.get_arista6().set_abscisa(abs);
        forma.get_arista6().set_ordenada(ord);
        forma.get_arista6().set_cota(cota);
        
        //SEPTIMO PUNTO 
        abs = forma.get_arista7().get_abscisa();
        ord = forma.get_arista7().get_ordenada();
        cota = forma.get_arista7().get_cota();
        
        ord1 = (ord*Math.cos(angulo) + cota*Math.sin(angulo));
        ord = (int) Math.round(ord1);
        
        cota1 = (-ord*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) Math.round(cota1);
        
        forma.get_arista7().set_abscisa(abs);
        forma.get_arista7().set_ordenada(ord);
        forma.get_arista7().set_cota(cota);
        
        //OCTAVO PUNTO 
        abs = forma.get_arista8().get_abscisa();
        ord = forma.get_arista8().get_ordenada();
        cota = forma.get_arista8().get_cota();
        
        ord1 = (ord*Math.cos(angulo) + cota*Math.sin(angulo));
        ord = (int) Math.round(ord1);
        
        cota1 = (-ord*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) Math.round(cota1);
        
        forma.get_arista8().set_abscisa(abs);
        forma.get_arista8().set_ordenada(ord);
        forma.get_arista8().set_cota(cota);
    }
    
    public void rotacion_y(){
        double abs1;
        double ord1;
        double cota1;
        int abs;
        int ord;
        int cota;
        
        //angulo = (int)Math.toDegrees((double) (angulo));
        
        //PRIMER PUNTO 
        abs = forma.get_arista1().get_abscisa();
        ord = forma.get_arista1().get_ordenada();
        cota = forma.get_arista1().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
        
        forma.get_arista1().set_abscisa(abs);
        forma.get_arista1().set_ordenada(ord);
        forma.get_arista1().set_cota(cota);
        
        //SEGUNDO PUNTO 
        abs = forma.get_arista2().get_abscisa();
        ord = forma.get_arista2().get_ordenada();
        cota = forma.get_arista2().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
        
        forma.get_arista2().set_abscisa(abs);
        forma.get_arista2().set_ordenada(ord);
        forma.get_arista2().set_cota(cota);
        
        //TERCER PUNTO 
        abs = forma.get_arista3().get_abscisa();
        ord = forma.get_arista3().get_ordenada();
        cota = forma.get_arista3().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
        
        forma.get_arista3().set_abscisa(abs);
        forma.get_arista3().set_ordenada(ord);
        forma.get_arista3().set_cota(cota);
        
        //CUARTO PUNTO
        abs = forma.get_arista4().get_abscisa();
        ord = forma.get_arista4().get_ordenada();
        cota = forma.get_arista4().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
        
        forma.get_arista4().set_abscisa(abs);
        forma.get_arista4().set_ordenada(ord);
        forma.get_arista4().set_cota(cota);
        
        //QUINTO PUNTO 
        abs = forma.get_arista5().get_abscisa();
        ord = forma.get_arista5().get_ordenada();
        cota = forma.get_arista5().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
        
        forma.get_arista5().set_abscisa(abs);
        forma.get_arista5().set_ordenada(ord);
        forma.get_arista5().set_cota(cota);
        
        //SEXTO PUNTO 
        abs = forma.get_arista6().get_abscisa();
        ord= forma.get_arista6().get_ordenada();
        cota = forma.get_arista6().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
        
        forma.get_arista6().set_abscisa(abs);
        forma.get_arista6().set_ordenada(ord);
        forma.get_arista6().set_cota(cota);
        
        //SEPTIMO PUNTO 
        abs = forma.get_arista7().get_abscisa();
        ord = forma.get_arista7().get_ordenada();
        cota = forma.get_arista7().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
       
        forma.get_arista7().set_abscisa(abs);
        forma.get_arista7().set_ordenada(ord);
        forma.get_arista7().set_cota(cota);
        
        //OCTAVO PUNTO 
        abs = forma.get_arista8().get_abscisa();
        ord = forma.get_arista8().get_ordenada();
        cota = forma.get_arista8().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + cota*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        cota1 = (-abs*Math.sin(angulo) + cota*Math.cos(angulo));
        cota = (int) (Math.round(cota1));
        
        forma.get_arista8().set_abscisa(abs);
        forma.get_arista8().set_ordenada(ord);
        forma.get_arista8().set_cota(cota);
    }
    
    public void rotacion_z (){
        double abs1;
        double ord1;
        double cota1;
        int abs;
        int ord;
        int cota;
        
        //angulo = (int)Math.toDegrees((double) (angulo));
        
        //PRIMER PUNTO
        abs = forma.get_arista1().get_abscisa();
        ord = forma.get_arista1().get_ordenada();
        cota = forma.get_arista1().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista1().set_abscisa(abs);
        forma.get_arista1().set_ordenada(ord);
        forma.get_arista1().set_cota(cota);
        
        //SEGUNDO PUNTO 
        abs = forma.get_arista2().get_abscisa();
        ord = forma.get_arista2().get_ordenada();
        cota = forma.get_arista2().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista2().set_abscisa(abs);
        forma.get_arista2().set_ordenada(ord);
        forma.get_arista2().set_cota(cota);
        
        //TERCER PUNTO 
        abs = forma.get_arista3().get_abscisa();
        ord = forma.get_arista3().get_ordenada();
        cota = forma.get_arista3().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista3().set_abscisa(abs);
        forma.get_arista3().set_ordenada(ord);
        forma.get_arista3().set_cota(cota);
        
        //CUARTO PUNTO
        abs = forma.get_arista4().get_abscisa();
        ord = forma.get_arista4().get_ordenada();
        cota = forma.get_arista4().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista4().set_abscisa(abs);
        forma.get_arista4().set_ordenada(ord);
        forma.get_arista4().set_cota(ord);
        
        //QUINTO PUNTO 
        abs = forma.get_arista5().get_abscisa();
        ord = forma.get_arista5().get_ordenada();
        cota = forma.get_arista5().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista5().set_abscisa(abs);
        forma.get_arista5().set_ordenada(ord);
        forma.get_arista5().set_cota(cota);
        
        //SEXTO PUNTO 
        abs = forma.get_arista6().get_abscisa();
        ord = forma.get_arista6().get_ordenada();
        cota = forma.get_arista6().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista6().set_abscisa(abs);
        forma.get_arista6().set_ordenada(ord);
        forma.get_arista6().set_cota(cota);
        
        //SEPTIMO PUNTO 
        abs = forma.get_arista7().get_abscisa();
        ord = forma.get_arista7().get_ordenada();
        ord = forma.get_arista7().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista7().set_abscisa(abs);
        forma.get_arista7().set_ordenada(ord);
        forma.get_arista7().set_cota(cota);
        
        //OCTAVO PUNTO
        abs = forma.get_arista8().get_abscisa();
        ord = forma.get_arista8().get_ordenada();
        cota = forma.get_arista8().get_cota();
        
        abs1 = (abs*Math.cos(angulo) + -ord*Math.sin(angulo));
        abs = (int) (Math.round(abs1));
        
        ord1 = (abs*Math.sin(angulo) + ord*Math.cos(angulo));
        ord = (int) (Math.round(ord1));
        
        forma.get_arista8().set_abscisa(abs);
        forma.get_arista8().set_ordenada(ord);
        forma.get_arista8().set_cota(cota);
        
    }
    
    
}
