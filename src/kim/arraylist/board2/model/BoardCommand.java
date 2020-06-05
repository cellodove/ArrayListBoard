package kim.arraylist.board2.model;

public class BoardCommand {

	// 캡슐화를 위해 프라이빗으로 변수를 생성한다.
	private String writer;
	private String email;
	private String title;
	private String content;
	private String password;

	public String getWriter() {
		return writer;
	}
	

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
