package Login.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.apache.struts.actions.MappingDispatchAction;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import LoginClass.model.Login;

public class LoginAction extends MappingDispatchAction{
	
	public ActionForward Login(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Login login = (Login) form;
		String username = login.getUserName();
		String password = login.getPassWord();

		if (isValidUser(username, password)) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("error");
		}
	}
	public ActionForward dangki(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception{
		Login dangki = (Login) form;
		String username = dangki.getUserName();
		String password = dangki.getPassWord();

		if (isValidUser(username, password)) {
			return mapping.findForward("success");
		} else {
			return mapping.findForward("error");
		}
	}


	private boolean isValidUser(String username, String password) {
		// Thông tin kết nối
		SQLServerDataSource dServerDataSource = new SQLServerDataSource();

		dServerDataSource.setUser("anhtu");
		dServerDataSource.setPassword("123");
		dServerDataSource.setServerName("DESKTOP-8IKP06U\\SQLEXPRESS");
		dServerDataSource.setPortNumber(1433);
		dServerDataSource.setDatabaseName("Login");
		dServerDataSource.setTrustServerCertificate(true);
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		boolean isValid = false;

		try {

			// Kết nối đến cơ sở dữ liệu
			connection = dServerDataSource.getConnection();
			
			String sqlQuery = "SELECT * FROM Login WHERE username = ? AND password = ?";
			preparedStatement = connection.prepareStatement(sqlQuery);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);

			// Thực thi truy vấn SQL
			resultSet = preparedStatement.executeQuery();

			// Kiểm tra xem có bản ghi phù hợp với tên người dùng và mật khẩu được cung cấp không
			isValid = resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return isValid;
	}
}
