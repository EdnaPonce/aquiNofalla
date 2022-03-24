public class Principal{
	public static void main (String[] args){
		Empleado emp1=new Empleado("Edna Ponce", 23, 100000, "33102512", "lazaro 33");
		Empleado emp2=new Empleado("Paulina Trujillo", 14, 60000, "33313565", "Sauz 111");
	

		Seguro empp1=new Seguro("Edna Ponce", 23, 11111, "ROPE1101", "IMSS");
		Seguro empp2=new Seguro("Paulina Trujillo", 14, 22222, "MAPA3311", "IMSS");

		Preferencias emppp1=new Preferencias("Edna Ponce", 23, "Saltar", "Tamales");
		Preferencias emppp2=new Preferencias("Paulina Trujillo", 14, "Comer", "Vegana & Sugar free");

		Fecha_ingreso empppp1=new Fecha_ingreso("Edna Ponce", 23, "14 de Julio 2002");
		Fecha_ingreso empppp2=new Fecha_ingreso("Paulina Trujillo", 14, "28 de enero 2017");

		EstatusEnEmpresa emppppp1=new EstatusEnEmpresa("Edna Ponce", 23, "LEGAL\n");
		EstatusEnEmpresa emppppp2=new EstatusEnEmpresa("Paulina Trujillo", 14, "Poquito ILEGAL\n");

		emp1.verDatos();
		empp1.verDatos();
		emppp1.verDatos();
		empppp1.verDatos();
		emppppp1.verDatos();

		emp2.verDatos();
		empp2.verDatos();
		emppp2.verDatos();
		empppp2.verDatos();
		emppppp2.verDatos();		
	}
}