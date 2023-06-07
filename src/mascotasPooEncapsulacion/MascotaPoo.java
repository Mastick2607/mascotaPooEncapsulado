package mascotasPooEncapsulacion;

import javax.swing.JOptionPane;

public class MascotaPoo {
	
	private String id;
    private String nombre;
    private String tipo;
    private int edad;

    public MascotaPoo() {
    }

    public MascotaPoo(String id, String nombre, String tipo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "------------Información----------\n" +
                "Identificación: " + id + "\n" +
                "Nombre: " + nombre + "\n" +
                "Tipo: " + tipo + "\n" +
                "Edad: " + edad + " años\n" +
                "---------------------------------");
        hacerSonido();
        comida();
    }

    public void hacerSonido() {
        if (tipo.equalsIgnoreCase("perro")) {
            JOptionPane.showMessageDialog(null, "¡Guau guau!");
        } else if (tipo.equalsIgnoreCase("gato")) {
            JOptionPane.showMessageDialog(null, "¡Miau miau!");
        } else {
            JOptionPane.showMessageDialog(null, "La mascota no hace sonidos conocidos.");
        }
    }

    public void comida() {
        if (tipo.equalsIgnoreCase("perro")) {
            JOptionPane.showMessageDialog(null, "¡Come carne de vaca y carne de cerdo!");
        } else if (tipo.equalsIgnoreCase("gato")) {
            JOptionPane.showMessageDialog(null, "¡Come pescado y comidad de gato!");
        } else {
            JOptionPane.showMessageDialog(null, "La mascota no tiene hambre.");
        }
    }

    public void ingresarDatos() {
        id = JOptionPane.showInputDialog("Ingrese la identificación: ");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        tipo = JOptionPane.showInputDialog("Ingrese el tipo:");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad:"));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


