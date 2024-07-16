package day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class RestaurantDao implements DaoInterface<Restaurant, Integer> {

	@Override
	public Collection<Restaurant> retrieveAll() {
		//Creating an empty collection.
		Collection<Restaurant> allRestaurants = new ArrayList<Restaurant>();
		try(
				Connection conn = JdbcUtils.buildConnection();
				Statement stmt = conn.createStatement();				
				){
			String sqlQuery = "select * from restaurant_master";
			ResultSet recordSet = stmt.executeQuery(sqlQuery);
			while(recordSet.next()) {
				String name = recordSet.getString(2);
				int brCount = recordSet.getInt(4);
				String cuisine = recordSet.getString(3);
				int id = recordSet.getInt(1);
				
				//Populating a Restaurant object based upon the above information				
				Restaurant currentRestaurant = new Restaurant(id, name, cuisine, brCount);
				//Adding that object into the collection
				allRestaurants.add(currentRestaurant);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return allRestaurants;
	}

	@Override
	public Restaurant retrieveOne(Integer restaurantId) {
		Restaurant foundRestaurant = null;
		String sqlQuery = "select * from restaurant_master where rest_id = ?";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt =  conn.prepareStatement(sqlQuery)
				){
			pstmt.setInt(1, restaurantId);
			ResultSet recordSet = pstmt.executeQuery();
			if(recordSet.next()) {
				String name = recordSet.getString(2);
				int brCount = recordSet.getInt(4);
				String cuisine = recordSet.getString(3);
				int id = recordSet.getInt(1);
				
				foundRestaurant = new Restaurant(id, name, cuisine, brCount);
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		return foundRestaurant;
	}

	@Override
	public void create(Restaurant newRestaurant) {
		// TODO Auto-generated method stub
		String sqlQuery = "insert into restaurant_master values(?,?,?,?)";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt =  conn.prepareStatement(sqlQuery)
				){
			//Fetching the values from Restaurant object: newRestaurant
			int id = newRestaurant.getRestaurantId();
			String name = newRestaurant.getName();
			String cuisine = newRestaurant.getCuisine();
			int brCount = newRestaurant.getBranchCount();
			
			//Substituting values for unknown parameters
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, cuisine);
			pstmt.setInt(4, brCount);
			
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " record inserted");	
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void delete(Integer restaurantId) {
		String sqlQuery = "delete from restaurant_master where rest_id = ?";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt =  conn.prepareStatement(sqlQuery)
				){
			pstmt.setInt(1, restaurantId);
			int deleteCount = pstmt.executeUpdate();
			System.out.println(deleteCount + " record deleted");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public void update(Restaurant modifiedRestaurant) {
		String sqlQuery =
		"update restaurant_master set rest_name = ?, rest_cuisine = ?, rest_branch_count = ? where rest_id = ?";
		try(
				Connection conn = JdbcUtils.buildConnection();
				PreparedStatement pstmt =  conn.prepareStatement(sqlQuery)
				){
			int id = modifiedRestaurant.getRestaurantId();
			String name = modifiedRestaurant.getName();
			String cuisine = modifiedRestaurant.getCuisine();
			int brCount = modifiedRestaurant.getBranchCount();
			pstmt.setString(1, name);
			pstmt.setString(2, cuisine);
			pstmt.setInt(3, brCount);
			pstmt.setInt(4, id);
			int updateCount = pstmt.executeUpdate();
			System.out.println(updateCount + " record updated");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
}

	







