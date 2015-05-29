package br.com.r3wa.integration.message;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * This is the Header of {@link Message}
 * 
 * @author r3wa
 *
 */
@XmlAccessorType(FIELD)
public class Header {

	/**
	 * this is the number of request example
	 */
	@XmlElement(required=true)
	private long number;
	
	
	/**
	 * this is the status of request example
	 */
	@XmlElement(required=true)
	private String status;

	
}
