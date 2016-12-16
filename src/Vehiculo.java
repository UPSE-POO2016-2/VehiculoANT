
public class Vehiculo {
	public String marca;
	public String dueno;
	public int kmRecorridos;
	public int anioFabricacion;
	public String matricula;
	public int capacidadPasajeros;
	
	public Vehiculo(String matricula, 
			String dueno, int anioFabricacion, 
			int capacidadPasajeros){
		this.matricula = matricula;
		this.dueno = dueno;
		this.anioFabricacion = anioFabricacion;
		this.capacidadPasajeros = capacidadPasajeros;
	}
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public int getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public int getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(int anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	
	@Override
	public boolean equals(Object o)
	{
		boolean sonIguales = false;
		if(o.getClass()==Vehiculo.class)
		{
			Vehiculo otroVehiculo = (Vehiculo) o;
			if(otroVehiculo!= null)
			{
				if(this.getMatricula()==otroVehiculo.getMatricula()
						&& this.anioFabricacion == otroVehiculo.getAnioFabricacion())
				{
					sonIguales = true;
				}
			}
		}
		
		return sonIguales;
	}



	@Override
	public String toString() {
		return "Vehiculo [dueno=" + dueno + ", anioFabricacion=" + anioFabricacion + ", matricula=" + matricula
				+ ", capacidadPasajeros=" + capacidadPasajeros + "]";
	}

	
}
