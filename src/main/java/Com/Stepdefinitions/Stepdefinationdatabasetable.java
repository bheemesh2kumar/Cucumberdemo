package Com.Stepdefinitions;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.ElementNotVisibleException;

import Com.Automation.SQL.SQLqueries;
import Com.BaseLibrary.BaseClass;
import Com.Cocumber.Pagelayer.HubspotLoginpage;
import Com.Cocumber.Pagelayer.MoneyRedifwebtablePage;
import Com.Utilities.DBconnections;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinationdatabasetable

{

	Connection con = null;

	@Given("^user is able to connect mysll database$")
	public void user_is_able_to_connect_mysll_database() throws ClassNotFoundException, SQLException {

		Connection con = null;
		String query = "select * from employee";
		// DBconnections DBconnectionsref=new DBconnections();
		// List<Map<String, Object>> list=DBconnections.getrecordsasmap(query);

		try {
			con = DBconnections.getconnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);

			ArrayList<HashMap<String, Object>> totalrows = new ArrayList<HashMap<String, Object>>();

			int rownum = 1;

			while (rs.next()) {

				HashMap<String, Object> row = new HashMap<String, Object>();

				int tablecol = rs.getMetaData().getColumnCount();

				System.out.println("******tablerownumber" + " " + rownum + "total colvalues are " + tablecol);

				for (int i = 1; i <= tablecol; i++) {
					row.put(rs.getMetaData().getColumnLabel(i), rs.getObject(i));
				}

				totalrows.add(row);

				System.out.println(rs.getObject("empid") + " " + rs.getObject("empname") + " " + rs.getObject("empsal")
						+ " " + rs.getObject("empdept"));

				System.out.println();

				rownum++;

			}

			System.out.println("Total table count ************" + totalrows.size());

			if (totalrows.size() > 0) {
				System.out.println("Db connected successfully");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			ex.getMessage();
			System.out.println("caught exception");

		}

		finally {
			if (con != null) {
				con.close();
				System.out.println("connection closed");
			}
		}

		/*
		 * System.out.println("*************" + list.size());
		 * System.out.println("Mysql connected successfully");
		 * 
		 */

	}

	@Given("^user is already connected mysql database$")
	public void user_is_already_connected_mysql_database() throws SQLException {

		try {
			con = DBconnections.getconnection();
			System.out.println("MYSQL connected successsfully");

		} catch (Exception ex) {
			ex.printStackTrace();
			ex.getMessage();

		}

	}

	@Then("^employee column values of empid,empname,empsal,empdept should be displayed as below$")
	public void employee_column_values_of_empid_empname_empsal_empdept_should_be_displayed_as_below(DataTable arg1)
			throws SQLException {

		Statement stmt = con.createStatement();

		try {
			ResultSet rs = stmt.executeQuery(SQLqueries.empsyamquery);

			while (rs.next()) {
				int colcount = rs.getMetaData().getColumnCount();

				for (int i = 1; i <=colcount; i++) {
					System.out.println(rs.getObject(i));
					
					
				}

			}
		} catch (Exception ex) {
			ex.printStackTrace();
			ex.getMessage();

		}

		finally {
			if (con != null) {
				con.close();
				System.out.println("connection closed");
			}
		}

	}

}
