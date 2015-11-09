package com.isd.sappu.savari.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class DateTimeUtil {

	public Date getDate(String dateString){
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
			//String dateInString = "31/08/1982 10:20:56";
			Date date = sdf.parse(dateString);
			System.out.println(date);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
