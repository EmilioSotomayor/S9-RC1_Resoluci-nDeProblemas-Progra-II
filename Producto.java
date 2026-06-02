public class Producto {
    public String id;
    public String nombre;
    public int cantidad;
    public double precio;
    public Producto(String id, String nombre, int cantidad, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public String obtenerDetalles() {
        return "numero invetario: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad + ", Precio: " + precio;
    }
}
