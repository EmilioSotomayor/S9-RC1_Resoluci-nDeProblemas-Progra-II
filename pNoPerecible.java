public class pNoPerecible extends Producto {
    public String Aalmacen;

    public pNoPerecible(String id, String nombre, int cantidad, double precio, String areaAlmacen) {
        super(id, nombre, cantidad, precio);
        this.Aalmacen = areaAlmacen;
    }
    @Override
    public String obtenerDetalles() {
        return "numero invetario: " + id + ", Nombre: " + nombre + ", Cantidad: " + cantidad +
                ", Precio: " + precio + ", Zona: " + Aalmacen + " (no perecible)";
    }
}
