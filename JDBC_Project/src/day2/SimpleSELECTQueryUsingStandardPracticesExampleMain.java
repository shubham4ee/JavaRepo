package day2;

import java.sql.Connection;
import java.util.Collection;

public class SimpleSELECTQueryUsingStandardPracticesExampleMain {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		Collection<Restaurant> allAvailableRestaurants = 	idao.retrieveAll();
		for(Restaurant rst : allAvailableRestaurants) {
			System.out.println(rst);
		}
	}

}
