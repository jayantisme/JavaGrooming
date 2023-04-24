package org.example.facade;

import java.sql.Connection;

public class FacadeHelper {
    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con = null;
        switch (dbType) {
            case MONGODB:
                con = MongoHelper.getConnection();
                MongoHelper mongoHelper = new MongoHelper();
                switch (reportType) {
                    case PDF:
                        mongoHelper.generatePdfReport(con, tableName);
                        break;
                    case WORD:
                        mongoHelper.generateWordReport(con, tableName);
                        break;
                }
                break;
            case POSTGRESQL:
                con = PostgreSqlHelper.getConnection();
                PostgreSqlHelper postgreSqlHelper = new PostgreSqlHelper();
                switch (reportType) {
                    case PDF:
                        postgreSqlHelper.generatePdfReport(con, tableName);
                        break;
                    case WORD:
                        postgreSqlHelper.generateWordReport(con, tableName);
                        break;
                }
                break;
        }
    }
}
