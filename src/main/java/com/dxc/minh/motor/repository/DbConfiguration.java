package com.dxc.minh.motor.repository;

public class DbConfiguration {
	
	public static final String HOST_NAME = "DESKTOP-IKO3LOH\\SQLEXPRESS";
    public static final String DB_NAME = "Webservice";
    public static final String DB_PORT = "1433";
    public static final String USER_NAME = "sa";
    public static final String PASSWORD = "123456";
    public static final String DB_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static final int DB_MIN_CONNECTIONS = 2;
    public static final int DB_MAX_CONNECTIONS = 4;
    // jdbc:sqlserver://hostname:port/dbname
    public static final String CONNECTION_URL = "jdbc:sqlserver://" + HOST_NAME + ":" + DB_PORT + ";databaseName=" + DB_NAME;
     
    private DbConfiguration() {
        super();
    }
}
