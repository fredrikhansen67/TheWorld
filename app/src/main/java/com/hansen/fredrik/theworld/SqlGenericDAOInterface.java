package com.hansen.fredrik.theworld;

import java.sql.SQLException;
import java.util.List;

public interface SqlGenericDAOInterface {
	
	public List<?> getAll() throws SQLException;
	public List<?> searchItem(String item) throws Exception;

}
