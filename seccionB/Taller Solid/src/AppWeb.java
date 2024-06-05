public class AppWeb {
    
    public AppWeb (Logable logIn, MySQL mySQL) {
        // Logic
    }
}

//Se violó el principio Single Responsability. Existía en esta clase
//tres métodos, uno enfocado en el appweb usando un login de admin,
//otro usando un login Normal y finalmente el conectar a la base de datos.
//por lo que se creó una clase aparte para los procedimientos de DB
//y una interfaz general para el LogIn siguiendo el principio
// de sustitución de Liskov.