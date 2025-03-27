package or.kr.webtoon.webtoonDTO;

public class webtoonDTO {
	
	String img;
	String title;
	String person;
	String content;
	String tag;
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "webtoonDTO [img=" + img + ", title=" + title + ", person=" + person + ", content=" + content + ", tag="
				+ tag + "]";
	}
	
	
}
