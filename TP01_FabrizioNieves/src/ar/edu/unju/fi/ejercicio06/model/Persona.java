package ar.edu.unju.fi.ejercicio06.model;
import java.time.LocalDate;

	public class Persona {
private String dni;
private String nombre;
private LocalDate fechaNacimiento;
private String provincia;

	//Contructor default
	public Persona() {
this.dni = "";
this.nombre = "";
this.fechaNacimiento = LocalDate.now();
this.provincia = "Jujuy";
	}
	//Constructor Parametrizado
	public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
this.dni = dni;
this.nombre = nombre;
this.fechaNacimiento = fechaNacimiento;
this.provincia = provincia;
    }
	//contructor con fecha de nacimiento,nombre y dni
	public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
this.dni = dni;
this.nombre = nombre;
this.fechaNacimiento = fechaNacimiento;
this.provincia = "Jujuy";
    }
	//Getters
    public String getDni() {
return dni;
    }

    public String getNombre() {
return nombre;
    }

    public LocalDate getFechaNacimiento() {
 return fechaNacimiento;
    }

    public String getProvincia() {
return provincia;
    }
    //edad calc
    public int calcularEdad() {
 LocalDate hoy = LocalDate.now();
int edad = hoy.getYear() - fechaNacimiento.getYear();

        if (hoy.getMonthValue() < fechaNacimiento.getMonthValue() || (hoy.getMonthValue() == fechaNacimiento.getMonthValue() && hoy.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
            edad--;
        }

return edad;
    }
    //si es mayorcito
    public boolean esMayorDeEdad() {
        return calcularEdad() > 18;
    }
    //salida de datos
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());

        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor");
        } else {
            System.out.println("La persona no es mayor");
        }}
	public static void main(String[] args) {
		
	}

}
