package org.dbunit.database;

import org.hsqldb.Server;

public class HsqlServer {
	 private void startHsqlServer(String dbPath, String dbName, int port) {   
	        Server server = new Server();   
	        // 0表示第0个数据库，Server模式可以启动10个数据库   
	        server.setDatabasePath(0, dbPath + dbName);   
	        server.setDatabaseName(0, dbName);   
	        server.setPort(port);   
	        server.setSilent(true);   
	        server.start();   
	        System.out.println("HSQLDB Server started!");   
	    }   
	    public static void main(String[] args) {   
	        // 源代码路径   
	        System.out.println(System.getProperty("user.dir"));   
	        // 类路径   
	    System.out.println(Thread.currentThread().getContextClassLoader()   
	                .getResource(".").getPath());   
	        String base = System.getProperty("user.dir");   
	        String dbPath = base   
	                + "\\data\\";   
	        String dbName = "sampledb2";   
	        int port = 2011;   
	        new HsqlServer().startHsqlServer(dbPath, dbName, port);   
	    }   

}
