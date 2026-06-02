public class pperecible extends Producto {
    public String fVencimiento;

    public pperecible(String id, String nombre, int cantidad, double precio, String fVencimiento) {
        super(id, nombre, cantidad, precio);
        this.fVencimiento = fVencimiento;
    }
    @Override
    public String obtenerDetalles() {
        return "numero invetario: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad +
                ", Precio: " + precio + ", Vence: " + fVencimiento + " (perecible)";
    }
}
