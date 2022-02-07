package collection;

//將NoteInt,NoteString整合成一個泛型
public class Note<T> {
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Note(T content) {
		this.content = content;
	}

	
}
