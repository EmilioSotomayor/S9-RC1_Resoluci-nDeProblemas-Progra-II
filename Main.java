import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    GInventario miInventario = new GInventario();
    int opc = 0;

    while (opc != 5) {
      System.out.println("Inventario de Productos");
      System.out.println("1. Agregar P_Perecedero");
      System.out.println("2. Agregar P_No_Perecedero");
      System.out.println("3. Listado");
      System.out.println("4. Dinero del establecimiento");
      System.out.println("5. Salir");
      System.out.print("Elija opcion: ");
      opc = leer.nextInt();
      leer.nextLine();

      if (opc == 1) {
        System.out.print("ID: ");
        String id = leer.nextLine();
        System.out.print("Nombre: ");
        String nom = leer.nextLine();
        System.out.print("Cantidad: ");
        int cant = leer.nextInt();
        System.out.print("Precio: ");
        double prec = leer.nextDouble();
        leer.nextLine();
        System.out.print("Fecha Vencimiento: ");
        String fecha = leer.nextLine();

        if (id.equals("") || nom.equals("")) {
          System.out.println("el ID o el Nombre no pueden estar vacíos.");
        } else if (cant < 0 || prec <= 0) {
          System.out.println("numero invalido.");
        } else {
          pperecible p1 = new pperecible(id, nom, cant, prec, fecha);
          miInventario.agregarAlInventario(p1);
          System.out.println("producto guardado");
        }

      } else if (opc == 2) {
        System.out.print("ID: ");
        String id = leer.nextLine();
        System.out.print("Nombre: ");
        String nom = leer.nextLine();
        System.out.print("Cantidad: ");
        int cant = leer.nextInt();
        System.out.print("Precio: ");
        double prec = leer.nextDouble();
        leer.nextLine();
        System.out.print("Zona de bodega: ");
        String zona = leer.nextLine();

        if (id.equals("") || nom.equals("")) {
          System.out.println("ID o Nombre no pueden estar vacíos.");
        } else if (cant < 0 || prec <= 0) {
          System.out.println("Cantidad o Precio inválidos.");
        } else {
          pNoPerecible p2 = new pNoPerecible(id, nom, cant, prec, zona);
          miInventario.agregarAlInventario(p2);
          System.out.println("producto guardado");
        }

      } else if (opc == 3) {
        miInventario.imprimirTodo();

      } else if (opc == 4) {
        double res = miInventario.calcularTotalDinero();
        System.out.println("Dinero total en inventario: $" + res);

      } else if (opc == 5) {
        System.out.println("Fin del programa.");
      } else {
        System.out.println("Opcion no existe.");
      }
    }
    leer.close();
  }
}
