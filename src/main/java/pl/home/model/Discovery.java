package pl.home.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Discovery {
	
	
	@Id	
	@GeneratedValue
	
	private long id;
	private String name;
	private String description;
	private String url;
	
	
	public Discovery(){}
	
	public Discovery(Discovery discovery) {
		this.id = discovery.id;
		this.name = discovery.name;
		this.description = discovery.description;
		this.url = discovery.url;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}