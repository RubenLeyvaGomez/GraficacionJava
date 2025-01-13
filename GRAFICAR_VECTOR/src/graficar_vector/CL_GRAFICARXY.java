package graficar_vector;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CL_GRAFICARXY implements CL_TRAZADOR {
    private ArrayList<CL_PUNTO> puntos = new ArrayList<>();
    private int limite_inf;
    private int limite_sup;
    
    public void set_puntos(CL_PUNTO[] x){
          for (CL_PUNTO punto : x) {
            puntos.add(punto);
        }
    }
    
    public void set_limite_inf(int x){
        limite_inf = x;
    }
    
    public void set_limite_sup(int x){
        limite_sup = x;
    }
    
    public ArrayList<CL_PUNTO> get_puntos(){
        return puntos; 
    }
    
    public int get_limite_inf(){
        return limite_inf;
    }
    
    public int get_limite_sup(){
        return limite_sup;
    }
        
    public void generar_grafica(int x1, int y1){
        int  x=0;
        int fx;
        int i=0;
        CL_PUNTO punto= new CL_PUNTO();
        for (x = 2; x <= 6; ) {
            fx = x-2; 
            
            punto.set_abscisa(x);
            punto.set_ordenada(fx);
            punto.geo_to_graf(x1, y1);
            puntos.add(punto);
        }
            for (x = 6; x <= 10; ) {
            fx = 10-x;
            
            punto.set_abscisa(x);
            punto.set_ordenada(fx);
            punto.geo_to_graf(x1, y1);
            puntos.add(punto);  
            x++;
            }
           
        
    }
    
    public void dibuja(Graphics g){
        for (int i = 0; i < puntos.size() -1; i++) {
            
        CL_PUNTO punto1 = puntos.get(i);
        CL_PUNTO punto2 = puntos.get(i + 1);
      
        g.drawLine(punto1.get_abscisa(), punto1.get_ordenada(), punto2.get_abscisa(),punto2.get_ordenada());
        
            if (i + 1 >= limite_sup - limite_inf) {
            break;
            }
        }
        
    }
    
}
