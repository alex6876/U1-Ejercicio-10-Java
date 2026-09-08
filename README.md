# 💻 Ejercicio — Gestión de Proyecto de Software

---

##  Descripción

El sistema implementa la clase ProyectoSoftware para gestionar el avance de un desarrollo tecnológico corporativo, asegurando que la fase inicial comience en el nivel 1 e incrementando gradualmente el ciclo de vida hasta su despliegue final sin superar el límite de fases.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase ProyectoSoftware

* **Atributos:**
* **nombreProyecto** (String): Nombre o título del proyecto informático.
* **clienteEmpresa** (String): Razón social o cliente corporativo asignado.
* **faseActual** (int): Indicador de la etapa de desarrollo (inicializado por defecto en 1).


* **Métodos Implementados:**
* **Constructor ProyectoSoftware:** Registra el nombre del proyecto y cliente, fijando la fase inicial en 1.
* **avanzarFase():** Incrementa la fase actual en una unidad siempre que sea menor a 3.
* **obtenerFase():** Evalúa el número de la etapa actual e imprime en consola su descripción ("Análisis" para fase 1, "Desarrollo" para fase 2, o "Despliegue" para fase 3).



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente simulación de ciclo de vida:

1. Instancia el proyecto "Sistema de Gestion Empresarial" para el cliente "Empresa AFA".
2. **Fase 1:** Muestra en pantalla la etapa inicial ("Análisis").
3. **Fase 2:** Invoca avanzarFase() y muestra la segunda etapa ("Desarrollo").
4. **Fase 3:** Invoca avanzarFase() y muestra la etapa final ("Despliegue").
