public class MySQLDatabase implements SQLInterface,DBProcedure {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL database.");
    }
    @Override
	public void insertUser(User user) {
		System.out.println("Added to database.");
	}
}