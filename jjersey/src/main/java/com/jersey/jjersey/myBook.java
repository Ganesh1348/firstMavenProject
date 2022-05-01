package com.jersey.jjersey;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class myBook 
{
private String book;
public String getBook() {
	return book;
}
public void setBook(String book) {
	this.book = book;
}
public int getBodkId() {
	return bodkId;
}
public void setBodkId(int bodkId) {
	this.bodkId = bodkId;
}
private int bodkId;
}
