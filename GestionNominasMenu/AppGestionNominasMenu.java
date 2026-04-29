package GestionNominasMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class AppGestionNominasMenu {
    static Scanner entrada = new Scanner(System.in);
    static Empresa empresaActual = null;
    public static void main(String[] args) {
        int num = entrada.nextInt();
        entrada.nextLine();
        do {
            menu();
            switch (num) {
                case 1:
                    crearEmpresa();
                    break;
                case 2:
                    agregarEmpleado();
                    break;
                case 3:
                    eliminarTrabajador();
                    break;
                case 4:
                    listarTrabajadores();
                    break;
                case 5:
                    listarTrabajadores();
                    break;
                case 6:
                    System.out.println("Adios.");
                default:
                    System.out.println("Introduzca un valor valido.");
                    break;
            }
        } while (num != 6);
    }

    private static void menu() {
        System.out.println("===== GESTIÓN DE NÓMINAS =====");
        System.out.println("\n1. Crear nueva empresa" +
                "\n2. Añadir trabajador" +
                "\n3. Eliminar trabajador (por DNI)" +
                "\n4. Listar todos los trabajadores" +
                "\n5. Calcular y mostrar nóminas" +
                "\n6. Salir" +
                "\n===================================");
    }

    private static void subMenu() {
        System.out.println("\n  ===== TIPO DE TRABAJADOR =====" +
                "\n  1. Analista" +
                "\n  2. Programador" +
                "\n  3. Administrativo" +
                "\n  4. Auxiliar");
    }

    protected static void crearEmpresa() {
        System.out.println("Intoduzca el CIF de la empresa.");
        String cif = entrada.nextLine();
        System.out.println("introduzca el nombre de la empresa.");
        String nombre = entrada.nextLine();

        Empresa emp1 = new Empresa(cif, nombre);
        System.out.println("Empresa creada correctamente.");

        System.out.println(emp1.toString());
    }

    private static void agregarEmpleado() {
        subMenu();

        int num = entrada.nextInt();
        entrada.nextLine();

        if (num == 1) {
            System.out.println("Intoduzca su DNI.");
            String dni = entrada.nextLine();
            System.out.println("Intoduzca su nombre.");
            String nombre = entrada.nextLine();
            System.out.println("Intoduzca su titulacion.");
            String titulacion = entrada.nextLine();

            Analista analista1 = new Analista(dni, nombre, titulacion);
            analista1.calcularSalarioFinal();

        } else if (num == 2) {
            System.out.println("Intoduzca su DNI.");
            String dni = entrada.nextLine();
            System.out.println("Intoduzca su nombre.");
            String nombre = entrada.nextLine();
            System.out.println("Intoduzca su titulacion.");
            String titulacion = entrada.nextLine();

            Programador programador1 = new Programador(dni, nombre, titulacion);
            programador1.calcularSalarioFinal();

        } else if (num == 3) {
            System.out.println("Intoduzca su DNI.");
            String dni = entrada.nextLine();
            System.out.println("Intoduzca su nombre.");
            String nombre = entrada.nextLine();
            System.out.println("Intoduzca su antiguedad en años.");
            String antiguedad = entrada.nextLine();

            Administrativos admin1 = new Administrativos(dni, nombre, num);
            admin1.calcularSalarioFinal();

        } else if (num == 4) {
            System.out.println("Intoduzca su DNI.");
            String dni = entrada.nextLine();
            System.out.println("Intoduzca su nombre.");
            String nombre = entrada.nextLine();
            System.out.println("Intoduzca su antiguedad en años.");
            String antiguedad = entrada.nextLine();

            Auxiliares aux1 = new Auxiliares(dni, nombre, num);
            aux1.calcularSalarioFinal();
            
        }
    }

    private static void eliminarTrabajador(){
        System.out.println("Introduzca el DNI del trabajador a eliminar: ");
        String dni = entrada.nextLine();
        
        try {
            empresaActual.eliminarTrabajador(dni);
        } catch (TrabajadorNoExistenteException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listarTrabajadores(){
        ArrayList<Trabajadores> lista = empresaActual.getTrabajadores();

        for (Trabajadores trabajadores : lista) {
            System.out.println(trabajadores.toString());
        }
    }

    private static void mostrarNominas(){
        
    }
    
}
