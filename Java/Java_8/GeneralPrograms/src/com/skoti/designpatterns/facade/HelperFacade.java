package com.skoti.designpatterns.facade;

public class HelperFacade {

    public static void generateReport(DBType dbType, ReportType reportType) {

        switch (dbType) {
            case MONGO:
                MongoDBHelper mongoDBHelper = new MongoDBHelper();
                switch (reportType) {
                    case HTML:
                        mongoDBHelper.generateMongoHTMLReport();
                        break;
                    case PDF:
                        mongoDBHelper.generateMongoPDFReport();
                        break;
                }
                break;
            case POSTGRES:
                PostgresHelper postgresHelper = new PostgresHelper();
                switch (reportType) {
                    case HTML:
                        postgresHelper.generatePostgresHTMLReport();
                        break;
                    case PDF:
                        postgresHelper.generatePostgresPDFReport();
                        break;
                }
                break;
        }

    }

    enum DBType {
        MONGO, POSTGRES;
    }

    enum ReportType {
        PDF, HTML;
    }

}


