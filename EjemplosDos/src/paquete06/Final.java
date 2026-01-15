/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author Usuario
 */
public class Final {

    public static void imprimir(String a, String b, String c, String d,
            String e, double[] f, double g) {
        
        String notas = "";
        String mensaje;
        for (int i = 0; i < f.length; i++) {
            notas = String.format("%s%s\n", notas, f[i]);
        }

        mensaje= String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Nombre Empresa: %s\n"
                + "Dirección Empresa: %s\n"
                + "Notas: \n%s\n"
                + "Promedio: %.2f\n",
                a,
                b,
                c,
                d, e, notas, g);
        
        System.out.printf("%s", mensaje);
    }
    
}

