package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	//private static pra q não tenha uma cópia deste objeto pra cada post da aplicação
	private static SimpleDateFormat sdf = new SimpleDateFormat();
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<Comment>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
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

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	// não terá o o setComment, por ser uma coleção

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();//permite concatenar outras strings, com append
		
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		
		//foreach para percorrer os comentarios
		for (Comment c : comments) {
			sb.append(c.getText()+"\n");
		}

		return sb.toString();

	}
}
