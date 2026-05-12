package Vista;

import Creators.*;
import Modelos.SolicitudTicket;

import java.util.Scanner;

public class MenuConsola {
    private final Scanner sc = new Scanner(System.in);


    public void iniciarMenuConsola(){
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    registrarTicket(new TecnicoCreator());
                    break;
                    case 2:
                        registrarTicket( new CuentaCreator());
                        break;
                        case 3:
                            registrarTicket(new FacturacionCreator());
                            break;
                            case 4:
                                registrarTicket(new ReclamoCreator());
                                break;
                                case 5:
                                    System.out.println("Saliendo del sistema...");
                default:
                    System.out.println("Opcion invalida");

            }
        }while(opcion!=5);
    }
    public void mostrarMenu(){
        System.out.println("||====SISTEMA DE TICKETS DE SOPORTE====||");
        System.out.println("1. Registrar Ticket técnico");
        System.out.println("2. Registrar Ticket de facturación");
        System.out.println("3. Registrar Ticket de cuenta");
        System.out.println("4. Registrar Ticket de reclamo");
        System.out.println("5. Salir");
    }

    private void registrarTicket(TicketsCreator ticketsCreator) {
        SolicitudTicket solicitud = pedirDatos();
        ticketsCreator.procesarSolicitudTicket(solicitud);
    }

    private SolicitudTicket pedirDatos() {
        System.out.println("Cliente: ");
        String cliente = sc.nextLine();

        System.out.println("Correo: ");
        String correo = sc.nextLine();

        System.out.println("Descripcion: ");
        String descripcion = sc.nextLine();

        System.out.println("Codigo del Pedido: ");
        String codigoPedido = sc.nextLine();

        System.out.println("Categoria: ");
        String categoria = sc.nextLine();

        System.out.println("Nivel de urgencia 1 - 5: ");
        int nivelUrgencia = sc.nextInt();

        System.out.println("Client Premium: ");
        boolean premium = sc.nextBoolean();
        return new SolicitudTicket(
                cliente,
                correo,
                descripcion,
                codigoPedido,
                categoria,
                nivelUrgencia,
                premium
        );
    }


    //**
    // SolicitudTicket solicitud = new SolicitudTicket();
    //        TicketsCreator factory;
    //        factory = new CuentaCreator();
    //        factory.procesarSolicitudTicket(solicitud);
    // **//


}
