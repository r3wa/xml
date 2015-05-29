package br.com.r3wa.integration.message;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "http://r3wa.com.br")
@XmlAccessorType(FIELD)
@XmlRootElement
public class Message {

	/**
	 * This element represent the type of message
	 */
	@XmlElement(required=true)
	private String type;

	/**
	 * This element represent the header of message
	 */
	@XmlElement(required=true)
	private Header header;


	/**
	 * This element represent the lines of message
	 */
	@XmlElement(required=true)
	private List<Line> lines ;


}
