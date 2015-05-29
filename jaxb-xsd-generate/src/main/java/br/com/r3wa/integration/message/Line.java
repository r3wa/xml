package br.com.r3wa.integration.message;

import static javax.xml.bind.annotation.XmlAccessType.FIELD;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * This is the line o {@link Message}
 * 
 * 
 * @author r3wa
 *
 */
@XmlAccessorType(FIELD)
public class Line {

	/**
	 * this is the code of line example
	 */
	@XmlElement(required=true)
	private String code;
	
	
	/**
	 * this is the value of line example
	 */
	@XmlElement(required=true)
	private double value;
	
	
}
