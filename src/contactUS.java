
public class contactUS {

	private String name; 
	private String email;
	private String comment;
	private static contactUS contactUsOBj = null;
	
	
	
	public static contactUS getInstance (String email, String comment, String name)
	{
		if (contactUsOBj == null)
		{
			contactUsOBj = new contactUS(email, comment, name);
		}
		return contactUsOBj;
	}
	public String getName() {
		return name;
	}
	public contactUS () {}
	
	public contactUS(String name, String email, String comment) {
		this.name = name;
		this.email = email;
		this.comment = comment;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
