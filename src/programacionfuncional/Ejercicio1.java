package programacionfuncional;

public class Ejercicio1 {
    public static void main(String[] args) {

        Operacion operacionSumar = (a,b) -> a + b;
        Operacion operacionRestar = (a,b) -> a-b;

        System.out.println(calcular(5,6, operacionSumar));
        System.out.println(calcular(5,6, operacionRestar));

    }

    static int calcular(int a, int b, Operacion operacion){
        return operacion.ejecutar(a,b);
    }
}

interface Operacion{
    int ejecutar(int a, int b);
}
