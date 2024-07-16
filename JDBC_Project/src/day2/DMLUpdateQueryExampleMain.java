package day2;

import java.sql.Connection;
import java.util.Collection;

public class DMLUpdateQueryExampleMain {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		//Retrieving the Restaurant in which update is required
		Restaurant rst = 	idao.retrieveOne(102);
		//Changing the state using setters
		rst.setCuisine("USA");
		//rst.setBranchCount(10);
		//Reflecting the new state into the database
		idao.update(rst);
	}

}
