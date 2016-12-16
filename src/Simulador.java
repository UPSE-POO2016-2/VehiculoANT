
public class Simulador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo miCarrito = new Vehiculo("abc-123", "Rolando", 2009, 5);
	
		Vehiculo mustang = new Vehiculo("ymd-256", "Chuck Norris", 2019, 1);
		
		Vehiculo trooper = new Vehiculo("pic-695", "Rafael C.", 2017, 2);
		
		Vehiculo combi = new Vehiculo("gmd-564", "Bob Marley", 1976, 15);
		
		ANT agenciaSE = new ANT("Agencia ANT Santa Elena");
		
		agenciaSE.registrarVehiculo(miCarrito);
		agenciaSE.registrarVehiculo(combi);
		agenciaSE.registrarVehiculo(trooper);
		
		agenciaSE.presentarListaVehiculosRegistrados();
		
		agenciaSE.cambiarDuenoVehiculoRegistro(combi, "Homero Simpson");
		System.out.println(combi);
		
		Vehiculo VehiculoRobado = agenciaSE.buscarVehiculoEnRegistroPorPlaca("gmd-584");
		if(VehiculoRobado!=null)
		{
			System.out.println("Encontamos el vehiculo robado: " + VehiculoRobado);
		}else{
			System.out.println("Salao pelao, siga buscando.");
		}
		
		
		if(agenciaSE.verificarRegistroVehiculo(mustang))
		{
			System.out.println("Si esta registrado " + mustang);
		}else{
			System.out.println("No esta registrado" + mustang);
		}
		
		//System.out.println(miCarrito);
	}

}
