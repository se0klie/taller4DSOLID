public class AWS implements cloudService{
	@Override
	public void connect() {
		System.out.println("Connected to AWS.");
	}
}
//azure, googleCloud, cloud services
class MicrosoftAzure implements cloudService{

	@Override
	public void connect() {
		System.out.println("Connected to Microsoft Azure.");
	}
	
}

class GoogleCloud implements cloudService{

	@Override
	public void connect() {
		System.out.println("Connected to Google Cloud.");
	}
	
}

class CloudServicePlatform{
	void hostingTo(AppWeb app, cloudService CS){
		CS.connect();
	}
}

//OPEN/CLOSED PRINCIPLE. Se creó una interfaz cloudService
//para acceder a un mismo método de distintas 
//maneras dependiendo de dónde se accede y además
//se corrige principio Single responsability ya que se dividio
//las responsabilidades para sus clases especificas