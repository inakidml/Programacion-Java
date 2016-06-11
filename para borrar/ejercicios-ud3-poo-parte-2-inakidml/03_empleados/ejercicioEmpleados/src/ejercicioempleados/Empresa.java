/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioempleados;

/**
 *
 * @author widemos
 */
public class Empresa {

    // Constante definida a nivel de clase
    public static final int MAX_EMPLE = 40;

    private Trabajador[] trabajadors = new Trabajador[MAX_EMPLE];
    private int contador = 0; // Número de objetos en el array
    private int dimensionArray;

    public Trabajador buscarTrabajador(String nombre) {

        // Aquí dejaremos el Trabajador, si lo encontramos
        Trabajador encontrado = null;

        int i = 0;

        // Recorrer hasta que se nos acaben los datos o lo encontremos
        while (i < contador && !trabajadors[i].getNombre().equals(nombre)) {
            i++;
        }

        // ¿Hemos parado antes del final? -> Encontrado
        if (i < contador) {
            // Copiamos su referencia para devolverla al programa principal
            encontrado = getTrabajadors()[i];
        }

        // Devolvemos el objeto. Si no hemos encontrado Trabajador, devolverá null
        return encontrado;
    }

    public void add(Trabajador trabajador) {
        trabajadors[contador] = trabajador;
        contador++;
    }

    /**
     * @return the contador
     */
    public int totalTrabajadors() {
        return contador;
    }

    public Trabajador[] listadoAntiguedad() {
        Trabajador[] listadoViejos = new Trabajador[totalTrabajadors()];
        Trabajador[] listadoNuevos = new Trabajador[totalTrabajadors()];
        int antiguo = Integer.MIN_VALUE;
        int nuevo = Integer.MAX_VALUE;
        int repeticionesA = 0;
        int repeticionesN = 0;

        for (int i = 0; i < totalTrabajadors(); i++) {
            if (trabajadors[i].getNumDias() >= antiguo) {
                antiguo = trabajadors[i].getNumDias();
            }
            if (trabajadors[i].getNumDias() <= nuevo) {
                nuevo = trabajadors[i].getNumDias();
            }

        }
        for (int i = 0; i < totalTrabajadors(); i++) {
            if (trabajadors[i].getNumDias() == antiguo) {
                listadoViejos[repeticionesA] = trabajadors[i];
                repeticionesA++;
            }
            if (trabajadors[i].getNumDias() == nuevo) {
                listadoNuevos[repeticionesN] = trabajadors[i];
                repeticionesN++;
            }
        }
        int dimensionArray = repeticionesA + repeticionesN;
        Trabajador[] listadoAntiguedad = new Trabajador[dimensionArray];
        for (int i = 0; i < repeticionesA; i++) {
            listadoAntiguedad[i] = listadoViejos[i];

        }
        int indice;
        for (int i = repeticionesA; i < dimensionArray; i++) {
            indice = i - repeticionesA;
            listadoAntiguedad[i] = listadoNuevos[indice];
        }

        return listadoAntiguedad;
    }

    public Trabajador[] ordenarTrabajadors(Trabajador[] trabajadors) {
        Trabajador[] trabajadorsOrdenados = new Trabajador[totalTrabajadors()];

        int contador = 0;

        for (int i = 0; i < totalTrabajadors(); i++) {
            for (int j = 0; j < totalTrabajadors(); j++) {
                if (trabajadors[i].getNumDias() < trabajadors[j].getNumDias()) {
                    contador++;
                }

            }
            if (trabajadorsOrdenados[(totalTrabajadors() - 1) - contador] == trabajadors[i]) {//por si salen repetidos, que es bastante habitual por cierto...
                trabajadorsOrdenados[(totalTrabajadors() - 1) - (contador + 1)] = trabajadors[i];
            } else {
                trabajadorsOrdenados[(totalTrabajadors() - 1) - contador] = trabajadors[i];
            }
            contador = 0;
        }

        return trabajadorsOrdenados;

    }

    /**
     * @return the trabajadors
     */
    public Trabajador[] getTrabajadors() {
        return trabajadors;
    }

    /**
     * @return the dimensionArray
     */
    public int getDimensionArray() {
        return dimensionArray;
    }

}
