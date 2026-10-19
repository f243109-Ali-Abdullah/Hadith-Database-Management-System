package dal;

public class HadithCollection {

	private int id;
	private String name;
	private String compiler;
	private String description;
	private String edition;
	private String publicationDetails;
	
	public HadithCollection(int id, String name, String compiler, String description, String edition, String publicationDetails)
	{
		this.id = id;
		this.name = name;
		this.compiler = compiler;
		this.description = description;
		this.edition = edition;
		this.publicationDetails = publicationDetails;
	}
}
