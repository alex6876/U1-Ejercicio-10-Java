public class ProyectoSoftware {
    String nombreProyecto;
    String clienteEmpresa;
    int faseActual;

    public ProyectoSoftware(String nombreProyecto, String clienteEmpresa, int faseActual) {
        this.nombreProyecto = nombreProyecto;
        this.clienteEmpresa = clienteEmpresa;
        this.faseActual = 1;
    }

    public void avanzarFase() {
        if (faseActual < 3) {
            faseActual ++;
        }
    }

    public void obtenerFase() {
        if (faseActual == 1) {
            System.out.println("Analisis");
        } else if (faseActual == 2) {
            System.out.println("Desarrollo");
        }else {
            System.out.println("Despliegue");
        }
    }

}
