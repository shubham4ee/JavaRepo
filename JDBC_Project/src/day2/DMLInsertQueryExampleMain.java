package day2;

public class DMLInsertQueryExampleMain {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		//Creating some Restaurant object
		Restaurant rst = new Restaurant(200, "Kamats", "South Indian", 10);
		idao.create(rst);

	}

}
