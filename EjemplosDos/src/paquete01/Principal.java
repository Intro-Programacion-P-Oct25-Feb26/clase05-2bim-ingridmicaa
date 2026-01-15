/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete02.DatoTrabajo;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.Final;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        String nombreEmpresa;
        String direccionEmpresa;

        double[] misNotas;
        double promedio;

        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        nombreEmpresa = DatoTrabajo.obtenerNombreEmpresa();
        direccionEmpresa = DatoTrabajo.obtenerDireccionEmpresa();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        Final.imprimir(nombre, apellidoRetornado, ciudad, nombreEmpresa,
                direccionEmpresa, misNotas, promedio);

    }

}
/*
Aqui estamos solicitando el ingreso de datos como el nombre, el apellido y 
la cuidad de la persona por teclado, despues sus notas hasta que el rango sea 
4 es decir 4 notas y después sacar el promedio notas de la persona. Presentar 
en la pantalla todos los datos solicitados, importando paquetes dentro del mismo 
proyecto.
 */
