package entity;

public class Transfer {
	private String id;
	private String id_user;
	private String name_user;
	private String oldProject;
	private String newProject;
	private String Reason;
	private boolean Censorship;
	private boolean user_watch;
	private boolean status;
	
	public Transfer() {
	}

	public Transfer(String id, String id_user, String name_user, String oldProject, String newProject, String reason,
			boolean censorship, boolean user_watch, boolean status) {
		this.id = id;
		this.id_user = id_user;
		this.name_user = name_user;
		this.oldProject = oldProject;
		this.newProject = newProject;
		Reason = reason;
		Censorship = censorship;
		this.user_watch = user_watch;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public String getName_user() {
		return name_user;
	}

	public void setName_user(String name_user) {
		this.name_user = name_user;
	}

	public String getOldProject() {
		return oldProject;
	}

	public void setOldProject(String oldProject) {
		this.oldProject = oldProject;
	}

	public String getNewProject() {
		return newProject;
	}

	public void setNewProject(String newProject) {
		this.newProject = newProject;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public boolean isCensorship() {
		return Censorship;
	}

	public void setCensorship(boolean censorship) {
		Censorship = censorship;
	}

	public boolean isUser_watch() {
		return user_watch;
	}

	public void setUser_watch(boolean user_watch) {
		this.user_watch = user_watch;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Transfer [id=" + id + ", id_user=" + id_user + ", name_user=" + name_user + ", oldProject=" + oldProject
				+ ", newProject=" + newProject + ", Reason=" + Reason + ", Censorship=" + Censorship + ", user_watch="
				+ user_watch + ", status=" + status + "]";
	}
	


	

}
