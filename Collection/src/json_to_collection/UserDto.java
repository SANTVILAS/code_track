package json_to_collection;

public class UserDto {

	
	private int userId;
	private String title;
	private boolean completed;
	
	public UserDto(int userId, String titlt, boolean completed) {
		super();
		this.userId = userId;
		this.title = titlt;
		this.completed = completed;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitlt() {
		return title;
	}

	public void setTitlt(String titlt) {
		this.title = titlt;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	@Override
	public String toString() {
		return "{userId=" + userId + ", title=" + title + ", completed=" + completed + "}";
	}
	
	
	
	
	
}
