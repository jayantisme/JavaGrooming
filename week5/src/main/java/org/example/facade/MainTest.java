package org.example.facade;

import java.sql.Connection;

public class MainTest {
    public static void main(String[] args) {
        // Without Using Facade
        String tableName = "Student";

        Connection con = MongoHelper.getConnection();
        MongoHelper mongoHelper = new MongoHelper();
        mongoHelper.generatePdfReport(con, tableName);

        Connection con1 = PostgreSqlHelper.getConnection();
        PostgreSqlHelper postgreSqlHelper = new PostgreSqlHelper();
        postgreSqlHelper.generateWordReport(con, tableName);

        // Generating Reports Using Facade
        FacadeHelper.generateReport(DBTypes.MONGODB, ReportTypes.PDF, tableName);
        FacadeHelper.generateReport(DBTypes.POSTGRESQL, ReportTypes.WORD, tableName);

        // Facade design pattern is more like helper for client application
    }
}
