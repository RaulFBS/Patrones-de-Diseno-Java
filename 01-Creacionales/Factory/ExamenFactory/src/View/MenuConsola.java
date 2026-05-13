package View;

import Creators.*;
import Modelos.SolicitudDocumento;
import Productos.DocumentoAcademico;

import java.util.Scanner;

public class MenuConsola {
    private final Scanner sc = new Scanner(System.in);

    public void iniciarMenuConsola() {
        int opcion= 0;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    procesarSolicitud(new ConstanciaMatriculaCreator());
                    break;
                    case 2:
                        procesarSolicitud(new CertificadoNotasCreator());
                        break;
                        case 3:
                            procesarSolicitud(new CartaPresentacionCreator());
                            break;
                            case 4:
                                procesarSolicitud(new SolicitudBecaCreator());
                                break;
                                case 5:
                                    System.out.println("Saliendo del sistema");
                                    break;
                                    default:
                                        System.out.println("Opcion invalida");




            }


        }while(opcion!=5);
    }

    public void mostrarMenu(){
        System.out.println("---Menu---");
        System.out.println("1. Generar constancia de matrícula");
        System.out.println("2. Generar certificado de notas");
        System.out.println("3. Generar carta de presentación");
        System.out.println("4. Generar solicitud de beca");
        System.out.println("5. Salir");



    }
    private  void procesarSolicitud(DocumentoCreator documentoCreator){
        SolicitudDocumento solicitudDocumento =pedirDatosSolicitud();
        documentoCreator.procesarSolicitud(solicitudDocumento);
    }

    private SolicitudDocumento pedirDatosSolicitud(){
        System.out.println("Nombre de Estudiante");
        String nombreEstudiante= sc.nextLine();
        System.out.println("Codigo de Estudiante");
        String codigoEstudiante= sc.nextLine();
        System.out.println("Correo de Estudiante");
        String correo= sc.nextLine();
        System.out.println("Carrera de Estudiante");
        String carrera= sc.nextLine();
        System.out.println("Ciclo de Estudiante");
        int ciclo= sc.nextInt();
        System.out.println("Promedio de Estudiante");
        double promedio= sc.nextDouble();
        sc.nextLine();
        System.out.println("Matriculado SI/NO");
        String respuesta= sc.nextLine();
        boolean matriculado= respuesta.equals("SI");
        System.out.println("Motivo");
        String motivo= sc.nextLine();
        return new SolicitudDocumento(
                nombreEstudiante,codigoEstudiante,correo,carrera,ciclo,promedio,matriculado,motivo
        );

    }
}
