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
	
	
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCompiler() { return compiler; }
    public void setCompiler(String compiler) { this.compiler = compiler; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getEdition() { return edition; }
    public void setEdition(String edition) { this.edition = edition; }

    public String getPublicationDetails() { return publicationDetails; }
    public void setPublicationDetails(String publicationDetails) {
        this.publicationDetails = publicationDetails;
    }
}
