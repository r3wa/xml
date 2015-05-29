package br.com.r3wa.integration.message;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * This class is one basic example with generate XSD staring of Java Objects using 
 * <a href="https://jaxb.java.net/">JAXB 2.0 <a/> and <a href="http://mojo.codehaus.org/jaxb2-maven-plugin/">JAXB2 Maven Plugin</a>   
 * <br>
 * For more details how about configuration JAXB2 Maven Plugin see It's home page.
 * 
 * @author r3wa
 *
 */
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
