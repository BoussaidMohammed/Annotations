package org.mql.java.models;

import org.mql.java.annotations.ComboField;
import org.mql.java.annotations.FormType;
import org.mql.java.annotations.RadioField;
import org.mql.java.annotations.TextField;
import org.mql.java.enumerations.DocumentType;

@FormType(title = "Nouveau Document")
public class Document {
	
	@TextField(label = "identificateur")
	private int id;
	@TextField
	private String title;
	@RadioField(label = "Type de document",items = {"Book","Paper","Report"})
	private DocumentType type;
	@TextField
	private String price;
	@ComboField(label = "Extention", items = {"PDF","XML","HTML"})
	private String format;
	@TextField
	private String publisher;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public DocumentType getType() {
		return type;
	}
	public void setType(DocumentType type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Document() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public Document(int id, String title, DocumentType type, String price, String format, String publisher) {
		super();
		this.id = id;
		this.title = title;
		this.type = type;
		this.price = price;
		this.format = format;
		this.publisher = publisher;
	}
	
	
}
