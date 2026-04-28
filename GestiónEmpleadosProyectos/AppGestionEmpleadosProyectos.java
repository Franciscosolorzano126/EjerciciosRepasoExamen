package GestiónEmpleadosProyectos;

import java.util.Scanner;

public class AppGestionEmpleadosProyectos {
    static Scanner entrada = new Scanner(System.in);
    static Empresa empresa = new Empresa("002ll", "Securitas SL");

    public static void main(String[] args) {
        menu();
        int num = entrada.nextInt();
        entrada.nextLine();
        do {
            switch (num) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    agregarProyecto();
                    break;
                case 3:
                    asignarEmpleadoProyecto();
                    break;
                default:
                    System.out.println("Opcion no valida. Adios.");
                    break;
            }
        } while (num != 8);

    }

    private static void menu() {
        System.out.println("======= MENU =======");
        System.out.println("1. Añadir empleado"
                + "\n2. Añadir proyecto"
                + "\n3. Asignar empleado a proyecto"
                + "\n4. Mostrar todos los empleados"
                + "\n5. Mostrar todos los proyectos "
                + "\n6. Eliminar empleado de un proyecto"
                + "\n7. Eliminar empleado de la empresa"
                + "\n8. Salir");
    }

    private static void subMenu() {
        System.out.println("\n1. Desarrollador"
                + "\n2. Manager");
    }

    private static void agregarEmpleado() {
        subMenu();
        int tipo = entrada.nextInt();
        entrada.nextLine();

        System.out.println("DNI:");
        String dni = entrada.nextLine();
        System.out.println("Nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Salario base:");
        double salarioBase = entrada.nextDouble();
        entrada.nextLine();

        if (tipo == 1) {
            System.out.println("Lenguaje principal:");
            String lenguaje = entrada.nextLine();
            Desarrollador dev1 = new Desarrollador(dni, nombre, salarioBase, lenguaje);
            dev1.calcularSalarioFinal();
            empresa.aniadirEmpleado(dev1);
            System.out.println("El empleado se ha añadido correctamente.");
        } else if (tipo == 2) {
            System.out.println("Departamento: ");
            String dep = entrada.nextLine();
            Manager man1 = new Manager(dni, nombre, salarioBase, dep, salarioBase, tipo);
            empresa.aniadirEmpleado(man1);
            System.out.println("El manager a sido introducido correctamente.");
        }
    }

    private static void agregarProyecto() {
        System.out.println("Nombre del proyecto:");
        String nombre = entrada.nextLine();
        System.out.println("Introduzca su presupuesto:");
        double presupuesto = entrada.nextDouble();
        entrada.nextLine();

        Proyecto p = new Proyecto(nombre, presupuesto);
        System.out.println("Proyecto careado correctamente.");
    }

    private static void asignarEmpleadoProyecto() {
        System.out.print("\nDNI del empleado: ");
        String dni = entrada.nextLine();
        System.out.print("Nombre del proyecto: ");
        String nombreProyecto = entrada.nextLine();

        Empleado empleado = empresa.buscarEmpleado(dni);
        Proyecto proyecto = empresa.buscarProyecto(nombreProyecto);

        if (empleado == null) {
            System.out.println("Empleado no encontrado.");
        } else if (proyecto == null) {
            System.out.println("Proyecto no encontrado.");
        } else {

            proyecto.getEmpleadosAsignados().add(empleado);

            if (empleado instanceof Manager) {
                System.out.println("Manager asignado al proyecto.");
            }
            System.out.println("Empleado asignado al proyecto correctamente.");
        }
    }

    
}
