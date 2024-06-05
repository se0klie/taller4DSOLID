public class SimpleLogIn implements Logable{
	private DBProcedure db;
	
	@Override
	public void log(User user) {
		System.out.println("Logged in.");
		db.insertUser(user);
	}
	//
}

//SINGLE RESPONSABILITY PRINCIPLE: EN una misma clase (simpleLogIn) existían dos métodos
// con distintas funcionalidades: 1. ingresar usuario 2. añadir a base de datos, por lo que
// se creó una segunda clase enfocada en el acceso a la DB e insertar el usuario ingresado en Log
// sin necesidad de aquel segundo método.