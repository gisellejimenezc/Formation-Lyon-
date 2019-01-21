package com.database.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Context {

		private static Context ctx = null;
		private Connection connection = null;
		
		static {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		
		private Context() {
			try {
				connection = DriverManager.getConnection("jdbc:postgresql://localhost/hr", "postgres", "sorpres2");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public static Context getInstance() {
			if(ctx == null) {
				ctx = new Context();
			}
			return ctx;
		}

		public Context getCtx() {
			return ctx;
		}


		public void setCtx(Context ctx) {
			this.ctx = ctx;
		}


		public Connection getConnection() {
			return connection;
		}


		public void setConnection(Connection connection) {
			this.connection = connection;
		}
	
}
