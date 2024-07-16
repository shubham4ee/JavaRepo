package day2;

public class DMLDeleteQueryExampleMain {

	public static void main(String[] args) {
		DaoInterface<Restaurant, Integer> idao = new RestaurantDao();
		idao.delete(103);

	}

}
