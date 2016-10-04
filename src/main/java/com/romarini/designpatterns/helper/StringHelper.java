package com.romarini.designpatterns.helper;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
/***
 * 
 *  Classe responsável por conversões específicas para String 
 * 
 *  Exemplo do Design Pattern Helper
 * 
 * @author rodrigomarini
 *
 */
public class StringHelper {
	/***
	 * Recebe um valor em milessegundos e efetua a conversão necessária. 
	 * @param millisecond data a ser convertida
	 * @return XMLGregorianCalendar da data recebida
	 */
	public static final XMLGregorianCalendar getXMLGregorianCalendar(Long millisecond){
		try {
			GregorianCalendar date = new GregorianCalendar(); 
			date.setTimeInMillis(millisecond);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(date);
		} catch (DatatypeConfigurationException e) {
			throw new RuntimeException(e);
		}
	}

	/***
	 * Converte um objeto XMLGregorianCalendar em um Date
	 * @param date objeto a ser convertido
	 * @return Date com mesmo valor do objeto recebido.
	 */
	public static final Date getDate(XMLGregorianCalendar date){
		try {
			Date d = null;
			if(date != null){
				d = new Date(date.getMillisecond());
			}
			return d;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
