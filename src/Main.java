public class Main {
    public static void main(String[] args) {
        ProyectoSoftware proyectoSoftware = new ProyectoSoftware("Sistema de Gestion Empresarial",
                "Empresa AFA",0);

        System.out.println("================== Fase 1 ==================");
        proyectoSoftware.obtenerFase();
        System.out.println("================== Fase 2 ==================");
        proyectoSoftware.avanzarFase();
        proyectoSoftware.obtenerFase();
        System.out.println("================== Fase 3 ==================");
        proyectoSoftware.avanzarFase();
        proyectoSoftware.obtenerFase();


    }
}