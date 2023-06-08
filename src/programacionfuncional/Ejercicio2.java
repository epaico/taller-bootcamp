package programacionfuncional;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        var listEmpleados = List.of(
                new Empleado("elvis", 1500.0, 2),
                new Empleado("juan", 900, 4),
                new Empleado("nahu", 1200, 4)
        );

        Predicado<Empleado> predicadoFiltro = valor -> valor.getSueldo() > 1000 && valor.getAniosDeTrabajo() < 3;

        System.out.println(getEmpleadosFiltro(listEmpleados, predicadoFiltro));
    }

    static List<Empleado> getEmpleadosFiltro(List<Empleado> lisEmpleados, Predicado predicado) {
        List<Empleado> listaResult = new ArrayList<>();
        for (Empleado empleado : lisEmpleados) {
            if (predicado.test(empleado)) {
                listaResult.add(empleado);
            }
        }
        return listaResult;
    }
}

interface Predicado<T> {
    boolean test(T value);
}

class Empleado {
    private String nombre;
    private double sueldo;
    private int aniosDeTrabajo;

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo, int aniosDeTrabajo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.aniosDeTrabajo = aniosDeTrabajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAniosDeTrabajo() {
        return aniosDeTrabajo;
    }

    public void setAniosDeTrabajo(int aniosDeTrabajo) {
        this.aniosDeTrabajo = aniosDeTrabajo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", aniosDeTrabajo=" + aniosDeTrabajo +
                '}';
    }
}

