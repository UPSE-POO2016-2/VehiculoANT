import java.io.LineNumberInputStream;
import java.util.ArrayList;

public class ANT {
	
	private ArrayList<Vehiculo> vehiculosRegistrados = new ArrayList<Vehiculo>();
	private String nombreAgencia;
	private int numeroUltimaMatricula;
	private String serieMatriculacion;
	
	public ANT(String nombreAgencia, int numeroUltimaMatricula, String serieMatriculacion)
	{
		this.nombreAgencia = nombreAgencia;
		this.numeroUltimaMatricula = numeroUltimaMatricula;
		this.serieMatriculacion = serieMatriculacion;
	}
	
	public ANT(String nombreAgencia)
	{
		this.nombreAgencia = nombreAgencia;
	}
	
	public void registrarVehiculo(Vehiculo v)
	{
		vehiculosRegistrados.add(v);
	}
	
	public boolean verificarRegistroVehiculo(Vehiculo v)
	{
		boolean estadoRegistro = vehiculosRegistrados.contains(v);
		return estadoRegistro;
	}
	
	public void removerVehiculoRegistro(Vehiculo v)
	{
		vehiculosRegistrados.remove(v);
	}
	
	public void cambiarDuenoVehiculoRegistro(Vehiculo v, String nuevoDueno)
	{
		Vehiculo vehiculoACambiarDueno = buscarVehiculoEnRegistroPorPlaca(v.getMatricula());
		
		if(vehiculoACambiarDueno!=null)
		{
			vehiculoACambiarDueno.setDueno(nuevoDueno);
		}else{
			System.out.println("Vehiculo No Encontrado. Cambio no existoso.");
		}
	}
	
	public Vehiculo buscarVehiculoEnRegistroPorPlaca(String placa)
	{
		Vehiculo vehiculoEncontrado = null;
		
		for(Vehiculo vt:vehiculosRegistrados)
		{
			if(vt.getMatricula()==placa)
			{
				vehiculoEncontrado = vt;
			}
		}
		
		return vehiculoEncontrado;
	}
	
	public void presentarListaVehiculosRegistrados()
	{
		System.out.println("**********Lista Vehiculos Registrados*********");
		for(Vehiculo v:vehiculosRegistrados)
		{
			System.out.println(v);
		}
		System.out.println("\n\n");
				
	}

	@Override
	public String toString() {
		return "ANT [nombreAgencia=" + nombreAgencia + "]";
	}
	
	public ArrayList<Vehiculo> listaVehiculosMayoresAlAnio(int anio)
	{
		ArrayList<Vehiculo> listaVehiculoMayores = new ArrayList<Vehiculo>();
		
		for(Vehiculo v: vehiculosRegistrados)
		{
			if(v.getAnioFabricacion()<anio)
			{
				listaVehiculoMayores.add(v);
			}
		}
		
		return listaVehiculoMayores;
	}
	

}
