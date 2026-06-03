import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Arreglos
        String[] nombres           = new String[10];
        String[] identificacion    = new String[10];
        int[]    edades            = new int[10];
        String[] generos           = new String[10];
        String[] programas         = new String[10];
        int[]    semestres         = new int[10];
        double[] promedios         = new double[10];
        int[]    estratos          = new int[10];
        String[] nivelSatisfaccion = new String[10];
        String[] estadoSalud       = new String[10];

        System.out.println("=================================");
        System.out.println("  SISTEMA AURA - Caracterizacion");
        System.out.println("=================================");

        int i = 0;

        System.out.println("\n--- DATOS PERSONALES ---");
        System.out.print("Nombre completo: ");
        nombres[i] = scanner.nextLine();
        System.out.print("Numero de identificacion: ");
        identificacion[i] = scanner.nextLine();
        System.out.print("Edad: ");
        edades[i] = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Genero (Masculino/Femenino/Otro): ");
        generos[i] = scanner.nextLine();

        
        System.out.println("\n--- INFORMACION ACADEMICA ---");
        System.out.print("Programa academico: ");
        programas[i] = scanner.nextLine();
        System.out.print("Semestre actual (1-10): ");
        semestres[i] = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Promedio academico (0,0 - 5,0): ");
        promedios[i] = scanner.nextDouble();
        scanner.nextLine();

      
        System.out.println("\n--- SITUACION SOCIOECONOMICA ---");
        System.out.print("Estrato (1-6): ");
        estratos[i] = scanner.nextInt();
        scanner.nextLine();

        
        System.out.println("\n--- ASPECTOS PSICOSOCIALES ---");
        System.out.print("Nivel de satisfaccion (Alto/Medio/Bajo): ");
        nivelSatisfaccion[i] = scanner.nextLine();

      
        System.out.println("\n--- SALUD Y BIENESTAR ---");
        System.out.print("Estado de salud (Excelente/Buena/Regular/Mala): ");
        estadoSalud[i] = scanner.nextLine();

        // Mostrar datos
        System.out.println("\n=================================");
        System.out.println("  DATOS REGISTRADOS");
        System.out.println("=================================");
        System.out.println("Nombre        : " + nombres[i]);
        System.out.println("Identificacion: " + identificacion[i]);
        System.out.println("Edad          : " + edades[i]);
        System.out.println("Genero        : " + generos[i]);
        System.out.println("Programa      : " + programas[i]);
        System.out.println("Semestre      : " + semestres[i]);
        System.out.println("Promedio      : " + promedios[i]);
        System.out.println("Estrato       : " + estratos[i]);
        System.out.println("Satisfaccion  : " + nivelSatisfaccion[i]);
        System.out.println("Salud         : " + estadoSalud[i]);

        //  Analisis de riesgo
        System.out.println("\n=================================");
        System.out.println("  ANALISIS DE RIESGO");
        System.out.println("=================================");

        int totalRiesgos = 0;

        if (promedios[i] < 3.0) {
            System.out.println("Riesgo academico: promedio bajo");
            totalRiesgos = totalRiesgos + 1;
        }

        if (estratos[i] == 1 || estratos[i] == 2) {
            System.out.println("Riesgo financiero: estrato bajo");
            totalRiesgos = totalRiesgos + 1;
        }

        if (estadoSalud[i].equals("Mala") || estadoSalud[i].equals("mala")) {
            System.out.println("Riesgo de salud: estado de salud deficiente");
            totalRiesgos = totalRiesgos + 1;
        }

        if (nivelSatisfaccion[i].equals("Bajo") || nivelSatisfaccion[i].equals("bajo")) {
            System.out.println("Riesgo psicosocial: nivel de satisfaccion bajo");
            totalRiesgos = totalRiesgos + 1;
        }

        if (totalRiesgos == 0) {
            System.out.println("Sin factores de riesgo detectados");
        }

        System.out.println("---------------------------------");
        System.out.println("Total de riesgos detectados: " + totalRiesgos);

        // RF08 - Clasificacion del estudiante
        System.out.println("\n=================================");
        System.out.println("  CLASIFICACION DEL ESTUDIANTE");
        System.out.println("=================================");

        if (totalRiesgos == 0) {
            System.out.println("Nivel de riesgo: BAJO");
            System.out.println("El estudiante no presenta factores de riesgo.");
        }

        if (totalRiesgos == 1 || totalRiesgos == 2) {
            System.out.println("Nivel de riesgo: MEDIO");
            System.out.println("El estudiante presenta algunos factores de riesgo.");
        }

        if (totalRiesgos >= 3) {
            System.out.println("Nivel de riesgo: ALTO");
            System.out.println("El estudiante requiere atencion prioritaria.");
        }

        scanner.close();
    }
}