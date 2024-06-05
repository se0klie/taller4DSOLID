public class LogInAdmin implements Logable {
    
    
	@Override
	public void log(User user) {
		  
        if(!verifyIfTheUserIsAdmin(user)){
            return;
        }
        System.out.println("Has access to the website in admin mode");
        // Logic
		
	}
	boolean verifyIfTheUserIsAdmin(User user){
		return true;
	}
}
	


//Principio que se violó fue el Single responsability,
//La clase LogInAdmin implementaba dos comportamientos con un objetivo distinto al principal planteado por la clase
//por lo que se creo otra clase para dividir las responsabilidades y que cada una desempeñe un papel especifico