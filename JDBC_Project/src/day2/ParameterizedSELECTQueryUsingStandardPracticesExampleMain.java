package day2;

import java.sql.Connection;
import java.util.Collection;

public class ParameterizedSELECTQueryUsingStandardPracticesExampleMain {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Restaurant rst = 	idao.retrieveOne(101);
		if(rst != null)
			System.out.println(rst);		
		else
			System.out.println("Restaurant with given ID does not exist.");
	}

}
