package mascotasPooEncapsulacion;

import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class procesosMascota {
	
	 private ArrayList<MascotaPoo> listaMascotas = new ArrayList<>();
	    private HashMap<String, MascotaPoo> mapaMascotas = new HashMap<>();

	    public void iniciarSistema() {
	        int opcion;
	        do {
	            opcion = mostrarMenu();

	            switch (opcion) {
	                case 1:
	                    crearMascota();
	                    break;
	                case 2:
	                    consultarMascota();
	                    break;
	                case 3:
	                    consultarListaMascotas();
	                    break;
	                case 4:
	                    modificarMascota();
	                    break;
	                case 5:
	                    JOptionPane.showMessageDialog(null, "*************Saliendo del sistema***********\n");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Opción inválida. Intente nuevamente.");
	            }
	        } while (opcion != 5);
	    }

	    private int mostrarMenu() {
	        String menu = "";
	        menu += "MENU\n";
	        menu += "1. Crear mascota\n";
	        menu += "2. Consultar mascota individual\n";
	        menu += "3. Consultar lista de mascotas\n";
	        menu += "4. Modificar una mascota\n";
	        menu += "5. Salir\n";
	        menu += "Ingrese una opción:\n ";

	        return Integer.parseInt(JOptionPane.showInputDialog(menu));
	    }

	    private void crearMascota() {
	    	MascotaPoo mascota = new MascotaPoo();
	        mascota.ingresarDatos();
	        listaMascotas.add(mascota);
	        mapaMascotas.put(mascota.getId(), mascota);
	    }

	    private void consultarMascota() {
	        String id = JOptionPane.showInputDialog("Ingrese la identificación de la mascota a consultar: ");
	        if (mapaMascotas.containsKey(id)) {
	        	MascotaPoo mascotaConsultada = mapaMascotas.get(id);
	            mascotaConsultada.mostrarInformacion();
	        } else {
	            JOptionPane.showMessageDialog(null, "No se encontró ninguna mascota con la identificación ingresada.");
	        }
	    }

	    private void consultarListaMascotas() {
	        String lista = "Lista de mascotas:\n";
	        for (MascotaPoo mascotaLista : listaMascotas) {
	            lista += "Identificación: " + mascotaLista.getId() + ", Nombre: " + mascotaLista.getNombre() + "\n";
	        }
	        JOptionPane.showMessageDialog(null, lista);
	    }

	    private void modificarMascota() {
	        String id = JOptionPane.showInputDialog("Ingrese la identificación de la mascota a modificar: ");
	        if (mapaMascotas.containsKey(id)) {
	        	MascotaPoo mascotaModificar = mapaMascotas.get(id);
	            mascotaModificar.ingresarDatos();
	        } else {
	            JOptionPane.showMessageDialog(null, "No se encontró ninguna mascota con la identificación ingresada.");
	        }
	    }
	}


