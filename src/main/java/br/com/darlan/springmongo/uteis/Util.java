package br.com.darlan.springmongo.uteis;

import java.time.LocalDate;

public class Util {

	/**
	 * Recebe uma String no formato dd/MM/yyyy e retorna um LocalDate*/
	public static LocalDate toLocalDate(String date) {	
		String[] newDate = date.split("/");
		return LocalDate.of(Integer.parseInt(newDate[2]), 
							Integer.parseInt(newDate[1]), 
							Integer.parseInt(newDate[0]));
	}
}
