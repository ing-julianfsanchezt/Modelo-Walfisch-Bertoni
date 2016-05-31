package uniminuto.mwb.principal;



/*
Ecuaciones tomadas del documento: Evaluación del modelo de propagación Walfisch – Bertoni en
comunicaciones vía microondas. Autor: Joel Carroll Vargas M.Sc - joel.carroll@uniminuto.edu

 */
/**
 *
 * @author Julian Felipe S
 */
public class calculos {

    //VARIABLE QUE EXPRESA LA INFLUENCIA DE LOS EDIFICIOS EN LA SEÑAL
    public double calculoA(double b, double hb, double hr) {

        double A = 5 * Math.log10(Math.pow((b / 2), 2) + Math.pow((hb - hr), 2)) - 9 * Math.log10(b) + 20 * Math.log10(Math.toDegrees(Math.atan((2 * (hb - hr)) / b)));
        return A;
    }

    //PERDIDAS POR TRAYECTORIA
    public double Lp(double f, double d, double H, double A) {
        
        double Lp = 89.55 + 21 * Math.log10(f) + 38 * Math.log10(d) - 18 * Math.log10(H) + A - 18 * Math.log10(1 - Math.pow(d, 2)/(17*H));
        return Lp;
    }

    public double Friis(double Pt, double Gt, double Lp, double Gr) {
        
        double Pr = Pt + Gt - Lp + Gr;
        return Pr;
    }
}
