import java.util.ArrayList;

public class GInventario {
    public ArrayList<Producto> lista = new ArrayList<>();

    public void agregarAlInventario(Producto p) {
        lista.add(p);
    }
    public void imprimirTodo() {
        if (lista.size() == 0) {
            System.out.println("No hay nada en la lista.");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i).obtenerDetalles());
            }
        }
    }
    public double calcularTotalDinero() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + (lista.get(i).cantidad * lista.get(i).precio);
        }
        return suma;
    }
}
