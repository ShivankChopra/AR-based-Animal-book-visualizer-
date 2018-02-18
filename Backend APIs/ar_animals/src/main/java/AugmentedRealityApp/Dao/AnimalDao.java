package AugmentedRealityApp.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import AugmentedRealityApp.Domain.Animal;

@Repository
public class AnimalDao{
	private String getAnimal = "select * from animals where name = ? ;";
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Animal getAnimalByName(String name) {
		
		return jdbcTemplate.queryForObject(getAnimal, new Object[] {name}, new RowMapper<Animal>(){
			
			public Animal mapRow(ResultSet rs, int rowNum) throws SQLException {
				Animal animal = new Animal();
				
				animal.setId(rs.getInt("id"));
				animal.setName(rs.getString("name"));
				animal.setCategory(rs.getString("category"));
				animal.setDescription(rs.getString("description"));
				animal.setFoodHabit(rs.getString("foodHabit"));
				animal.setHabitat(rs.getString("habitat"));
				
				return animal;
			}
		});
	}
}