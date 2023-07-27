package alumnosapp.services;

import alumnosapp.entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Alumno a = new Alumno();
    ArrayList<Alumno> alumnos = new ArrayList();

    //metodo para crear alumnos por input: 
    public Alumno crearAlumno() {
        System.out.println("Ingresa el nombre del alumno");
        String nombre = leer.next();

        int[] notas = new int[3];

        System.out.println("Ingresaremos ahora las " + a.getNotas().length + " notas del alumno");

        for (int i = 0; i < a.getNotas().length; i++) {
            System.out.println("Ingresa nota: ");
            notas[i] = leer.nextInt();
        }

        return new Alumno(nombre, notas);
    }

    //metodo para bucle de ingreso de alumnos
    public void enlistarAlumnos() {

        boolean verificador = true;

        do {
            System.out.println("Ingresa un estudiante");
            alumnos.add(crearAlumno());

            System.out.println("Deseas ingresar otro alumno? s/n");
            String check = leer.next();

            if (check.equalsIgnoreCase("n")) {
                verificador = false;
            }
        } while (verificador);

        System.out.println("Saliendo de crear alumnos....");
        System.out.println("");
        System.out.println("La lista actual de alumnos es: ");
        mostrarLista();

    }

    //metodo para mostrar la lista de alumnos
    public void mostrarLista() {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    //metodo notaFinal()
    /*
    : El usuario ingresa el nombre del alumno que quiere calcular su nota 
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro 
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este 
    promedio final, devuelto por el método y mostrado en el main
     */
    
    public void buscarAlumno(){
        System.out.println("Ingresa el nombre del alumno que debemos buscar");
        String buscado = leer.next();
        
        boolean encontrado = true;
        
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(buscado)){
                notaFinal(alumno);
            }else{
                encontrado = false;            }
        }
        if(!encontrado){
            System.out.println("El alumno no se encuentra en la lista");
        }
    }
    
    private void notaFinal(Alumno al){
        int[] notas = al.getNotas();
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("[" + notas[i] + "]");
            suma += notas[i];
        }
        
        int promedio = suma/(notas.length);
        System.out.println("El promedio nota final del alumno es " + promedio);
        
        
    }
}
