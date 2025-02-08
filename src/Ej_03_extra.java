import java.util.ArrayList;
import java.util.Scanner;

public class Ej_03_extra {
    /*Crea una agenda de contactos por terminal.
     * - Debes implementar funcionalidades de búsqueda, inserción, actualización
     *   y eliminación de contactos.
     * - Cada contacto debe tener un nombre y un número de teléfono.
     * - El programa solicita en primer lugar cuál es la operación que se quiere realizar,
     *   y a continuación los datos necesarios para llevarla a cabo.
     * - El programa no puede dejar introducir números de teléfono no númericos y con más
     *   de 11 dígitos (o el número de dígitos que quieras).
     * - También se debe proponer una operación de finalización del programa.
     */
    static class Contacto {
        private String nombre;
        private String telefono;

        public Contacto(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public String getNombre(){
            return nombre;
        }

        public String getTelefono(){
            return telefono;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public void setTelefono(String telefono){
            this.telefono = telefono;
        }
        @Override
        public String toString() {
            return "Nombre: " + nombre + ", Teléfono: " + telefono;
        }
    }

    public static class AgendaContacto {
        public static ArrayList<Contacto> contactos = new ArrayList<>();
        public static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            while (true){
                System.out.println("\n ---Agenda de Contacto ---");
                System.out.println("1. Agregar Contacto");
                System.out.println("2. Buscar Contacto");
                System.out.println("3. Actualizar Contacto");
                System.out.println("4. Eliminar Contacto");
                System.out.println("5. Mostrar todos los contactos");
                System.out.println("6. Salir");
                int opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer de entrada
                switch (opcion){
                    case 1:
                        System.out.println(" Agregando Contacto");
                        agregarContacto();
                        break;
                    case 2:
                        System.out.println(" Buscar Contacto por Nombre");
                        String nombre = sc.nextLine();
                        Contacto contacto = obtenerContactoPorNombre(nombre);
                        if (contacto != null) {
                            System.out.println(contacto);
                        } else {
                            System.out.println("Contacto no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.println(" Actualizar Contacto");
                        actualizarContacto();
                        break;
                    case 4:
                        System.out.println(" Eliminar Contacto");
                        eliminarContacto();
                        break;
                    case 5:
                        System.out.println("Mostrar contactos");
                        mostrarContactos();
                        break;
                    case 6:
                        System.out.println(" Saliendo del programa");
                        return;
                    default:
                        System.out.println("Opcion invalida");
                }
            }
        }

        private static boolean esNumeroValido(String telefono) {
            return telefono.matches("\\d{1,11}"); // Verifica que sea un número entre 1 y 11 dígitos
        }

        public static void agregarContacto(){
            System.out.println("Ingresa nombre del Contacto ");
            String nombre = sc.nextLine();
            System.out.println("Ingresa telefono del Contacto ");
            String telefono = sc.nextLine();
            if (!esNumeroValido(telefono)){
                System.out.println("Número inválido, debe tener entre 1 y 11 caracteres.");
                return;
            }
            contactos.add(new Contacto(nombre, telefono));
        }

        public static Contacto obtenerContactoPorNombre(String nombre) {
            for (Contacto contacto : contactos) {
                if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                    return contacto;
                }
            }
            return null; // Retorna null si no encuentra el contacto
        }

        public static void actualizarContacto(){
            System.out.println("Ingresa nombre del Contacto a actualizar: ");
            String nombre = sc.nextLine();
            Contacto contacto = obtenerContactoPorNombre(nombre);
            if (contacto != null){
                System.out.println("Ingresa el nuevo nombre del Contacto ");
                String nuevoNombre = sc.nextLine();
                System.out.println("Ingresa el nuevo teléfono del Contacto ");
                String nuevoTelefono = sc.nextLine();
                if(!esNumeroValido(nuevoTelefono)){
                    System.out.println("Número inválido, debe tener entre 1 y 11 caracteres.");
                    return;
                }
                contacto.setNombre(nuevoNombre);
                contacto.setTelefono(nuevoTelefono);
                System.out.println("Contacto actualizado");
            } else {
                System.out.println("Contacto no encontrado");
            }
        }

        public static void eliminarContacto(){
            System.out.println("Ingresa el nombre del Contacto a eliminar: ");
            String nombre = sc.nextLine();
            Contacto contacto = obtenerContactoPorNombre(nombre);
            if (contacto != null){
                contactos.remove(contacto);
                System.out.println("Contacto eliminado");
            } else {
                System.out.println("Contacto no encontrado");
            }
        }

        public static void mostrarContactos() {
            if (contactos.isEmpty()) {
                System.out.println("No hay contactos registrados.");
            } else {
                for (Contacto contacto : contactos) {
                    System.out.println(contacto);
                }
            }
        }
    }
}




