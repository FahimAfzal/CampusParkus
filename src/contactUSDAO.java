import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;

public class contactUSDAO {
	private Connection connect = null;
	private PreparedStatement preparedStatement = null;

	public void add_review(contactUS obj) throws SQLException {
		connect = DatabaseConnection.getInstance().getConnection();
		
		// Getting current date
		LocalDate today = LocalDate.now(ZoneId.of("America/Montreal"));
		String currentDate = today.toString();

		try {
			preparedStatement = connect
					.prepareStatement("insert into review_data(name, email, comment,submission_date) values (?,?,?,?)");

			preparedStatement.setString(1, obj.getName());
			preparedStatement.setString(2, obj.getEmail());
			preparedStatement.setString(3, obj.getComment());
			preparedStatement.setDate(4, java.sql.Date.valueOf(currentDate));

			preparedStatement.executeUpdate();
			System.out.println("Succesfully added review");
		} catch (Exception ex) {
			System.out.println(ex);
		}
		disconnect();

	}
	
	protected void disconnect() throws SQLException {
        if (connect != null && !connect.isClosed()) {
        	connect.close();
        }
    }

}
