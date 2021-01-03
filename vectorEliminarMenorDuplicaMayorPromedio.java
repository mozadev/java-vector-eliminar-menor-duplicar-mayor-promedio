package prueba10;


import javax.swing.JOptionPane;
import java.util.Arrays;


public class Prueba10 {

    public static void main(String[] args) {
        int x, sum = 0, mayor = 0, menor = 999;
        int posicionMenor=0;
        float prom;
        String arreglo=" ";
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de notas: "));
        int vec[] = new int[x];
        for (int i = 0; i < x; i++) {
            vec[i] = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + ". Digite la nota: "));
        }
        JOptionPane.showMessageDialog(null, "ARREGLO\n" + Arrays.toString(vec));
        for (int i = 0; i < x; i++) {
            if (vec[i] > mayor) {
                mayor = vec[i];
            }
            if (vec[i] < menor) {
                menor = vec[i];
                posicionMenor=i;
                
            }
        }
        for (int i = 0; i < x; i++) {
            if (vec[i] == mayor) {
                vec[i] *= 2;
            }
            sum += vec[i];
        }
        for (int i = posicionMenor; i < x - 1; i++) {
            vec[i] = vec[i + 1];
        }
        // vec=ArrayUtils.removeElement(vec, menor);// no es compatible
      //  JOptionPane.showMessageDialog(null, "NUEVO ARREGLO\n" + Arrays.toString(vec));
        for (int i = 0; i < x-1; i++) {
           arreglo=arreglo+"-"+vec[i];
        }
        prom = (sum - menor) / (x - 1);
         JOptionPane.showMessageDialog(null, "elemento: " + arreglo);
        JOptionPane.showMessageDialog(null, "El promedio es: " + prom);
    }

}
