package entity;

public class Position {
	protected String id;
	protected String name;
	protected boolean status;
	
	public Position() {}
	public Position(String id, String name, boolean status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	
	
}
