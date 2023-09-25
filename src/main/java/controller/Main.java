package controller;

import utils.ConfigProvider;
import utils.DBUtils;
import utils.IWriter;

public class Main
{
    private static final String SELECT_ALL_FROM_FACULTY = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_FACULTY");
    private static final String SELECT_ALL_FROM_SPESIALITY = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_SPESIALITY");
    private static final String SELECT_ALL_FROM_EDUCATION_FORM = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_EDUCATION_FORM");
    private static final String SELECT_ALL_FROM_STUDENTS_GROUP = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_STUDENTS_GROUP");
    private static final String SELECT_ALL_FROM_DAY_OF_WEEK = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_DAY_OF_WEEK");
    private static final String SELECT_ALL_FROM_CLASS = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_CLASS");
    private static final String SELECT_ALL_FROM_CLASS_TYPE = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_CLASS_TYPE");
    private static final String SELECT_ALL_FROM_COURSE = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_COURSE");
    private static final String SELECT_ALL_FROM_PROFESSOR = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_PROFESSOR");
    private static final String SELECT_ALL_FROM_CLASSROOM_TYPE = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_CLASSROOM_TYPE");
    private static final String SELECT_ALL_FROM_CLASSROOM = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_CLASSROOM");
    private static final String SELECT_ALL_FROM_DATUM = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_DATUM");
    private static final String SELECT_ALL_FROM_SCHEDULE_ENTRY = ConfigProvider.readConfig("requests-data.json")
            .getString("SELECT_ALL_FROM_SCHEDULE_ENTRY");


    public static void main( String[] args )
    {
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_FACULTY)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_SPESIALITY)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_EDUCATION_FORM)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_STUDENTS_GROUP)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_DAY_OF_WEEK)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_CLASS)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_CLASS_TYPE)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_COURSE)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_PROFESSOR)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_CLASSROOM_TYPE)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_CLASSROOM)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_DATUM)));
        IWriter.printResult(DBUtils.getResultArrayByQuery(DBUtils.getPreparedStatement(SELECT_ALL_FROM_SCHEDULE_ENTRY)));
    }
}
