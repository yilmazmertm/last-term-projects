package jsondata;

import models.UserModel;
import utils.AddUser;

import javax.sql.rowset.CachedRowSet;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

@Path("/getExample")
public class Driver {

    DbOperations dbOp;
    Statement statement;
    public CachedRowSet resWanted;
    AddUser myUtil;
    String result;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getTheList")
    public List<UserModel> start() throws Exception {
        ResultSet myRs;
        dbOp = new DbOperations();
        myUtil = new AddUser();

        statement = dbOp.openConnection();
        resWanted = dbOp.createStatement();
        myRs = queryWork();
        myUtil.addUser(myRs);
        return myUtil.getUserList();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/age/{age}")
    public List<UserModel> start(@PathParam("age") int customerAge) throws Exception {
        ResultSet myRs;
        dbOp = new DbOperations();
        myUtil = new AddUser();

        statement = dbOp.openConnection();
        resWanted = dbOp.createStatement();
        myRs = queryWorkByAge(customerAge);
        myUtil.addUser(myRs);
        return myUtil.getUserList();
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getNameAndAge")
    public List<UserModel> start(@QueryParam("name") String customerName, @QueryParam("age") int customerAge) throws Exception {
        ResultSet myRs;
        dbOp = new DbOperations();
        myUtil = new AddUser();

        statement = dbOp.openConnection();
        resWanted = dbOp.createStatement();
        myRs = queryWorkByAgeAndName(customerName, customerAge);
        myUtil.addUser(myRs);
        return myUtil.getUserList();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/surname/{sur}")
    public List<UserModel> surname(@PathParam("sur") String surname) throws Exception {
        ResultSet myRs;
        dbOp = new DbOperations();
        myUtil = new AddUser();

        statement = dbOp.openConnection();
        resWanted = dbOp.createStatement();
        myRs = queryWorkBySurname(surname);
        myUtil.addUser(myRs);
        return myUtil.getUserList();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/name/{name}")
    public List<UserModel> getName(@PathParam("name") String customerName) throws Exception {
        ResultSet myRs;
        dbOp = new DbOperations();
        myUtil = new AddUser();

        statement = dbOp.openConnection();
        resWanted = dbOp.createStatement();
        myRs = queryWorkByName(customerName);
        myUtil.addUser(myRs);
        return myUtil.getUserList();

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/id/{id}")
    public List<UserModel> doThis(@PathParam("id") int customerID) throws Exception {
        ResultSet myRs;
        dbOp = new DbOperations();
        myUtil = new AddUser();

        statement = dbOp.openConnection();
        resWanted = dbOp.createStatement();
        myRs = queryWorkByID(customerID);
        myUtil.addUser(myRs);
        return myUtil.getUserList();

    }

    private ResultSet queryWork() throws SQLException {
        String query;
        query = "select * from users";
        PreparedStatement preparedStatement = dbOp.getConnection().prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    public ResultSet queryWorkByAge(int age) throws SQLException {
        String query;
        query = "select * from users where age like '" + age + "%'";
        PreparedStatement pst = dbOp.getConnection().prepareStatement(query);
        return pst.executeQuery();

    }

    public ResultSet queryWorkByID(int id) throws SQLException {
        String query;
        query = "select * from users where id like '" + id + "%'";
        PreparedStatement pst = dbOp.getConnection().prepareStatement(query);
        return pst.executeQuery();

    }

    public ResultSet queryWorkByName(String name) throws SQLException {
        String query;
        query = "select * from users where name like '" + name + "%'";
        PreparedStatement pst = dbOp.getConnection().prepareStatement(query);
        return pst.executeQuery();

    }

    public ResultSet queryWorkByAgeAndName(String name, int age) throws SQLException {
        String query;
        query = "select * from users where name like '" + name + "%' and age like '" + age + "%'";
        PreparedStatement pst = dbOp.getConnection().prepareStatement(query);
        return pst.executeQuery();

    }

    public ResultSet queryWorkBySurname(String surname) throws SQLException {
        String query;
        query = "select * from users where surname like '" + surname + "%'";
        PreparedStatement pst = dbOp.getConnection().prepareStatement(query);
        return pst.executeQuery();

    }

}
