package com.designPatterns.B_Memento;

public class Article {


    private long id;
    private String title;
    private String content;
     
    //Constructor
    public Article(long id, String title) {
        super();
        this.id = id;
        this.title = title;
    }
     
    //Setters and getters
    public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
    
    //ability to create a memento that stores the state of this Article
    public ArticleMemento createMemento() 
    {
        ArticleMemento m = new ArticleMemento(id, title, content);
        return m;
    }
     
    //ability to restore the state
    public void restore(ArticleMemento m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.content = m.getContent();
    }
 
    @Override
    public String toString() {
        return "Article [id=" + id + ", title=" + title + ", content=" + content + "]";
    }
	
}
