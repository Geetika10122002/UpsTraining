package jdbc;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.Scanner;
public class StudentDatabase {
    private static Connection connection = null;
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        StudentDatabase studentDatabase = new StudentDatabase();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dbUrl = "jdbc:mysql://localhost:3306/jdbc";
            String username = "root";
            String password = "Gee@2002";
            connection = DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Enter choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    studentDatabase.insertRecord();
                    break;
                case 2:
                    studentDatabase.selectRecord();
                    break;
                case 3:
                    studentDatabase.selectAllRecords();
                    break;
                case 4:
                    studentDatabase.updateRecord();
                    break;
                case 5:
                    studentDatabase.deleteRecord();
                    break;
                case 6:
                    studentDatabase.transaction();
                    break;
                case 7:
                    studentDatabase.batchProcessing();
                    break;
                default:
                    break;
            }
        }
        catch(Exception e){
             System.out.println("Something went wrong");
        }
        finally {
            //closing the connection
            try {
                if(connection!=null&& !connection.isClosed()) {
                    connection.close();
                    System.out.println("connection closed");
                }
            }catch(Exception e) {
                System.out.println("Error closing connection");
            }
        }
    }
    public void insertRecord() throws SQLException {
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter percentage:");
        double percentage=sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter address:");
        String address=sc.nextLine();
//        String sql="insert into students(name,percentage,address) values('geetika',97.99,'chennai')";
        String sql="insert into students(name,percentage,address) values(?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        preparedStatement.setDouble(2,percentage);
        preparedStatement.setString(3,address);
        int rows = preparedStatement.executeUpdate();
        if(rows > 0){
            System.out.println("Record inserted Successfully");
        }
    }
    public void selectRecord() throws SQLException {
//        String sql="select * from students where roll_number=1";
        System.out.println("Enter roll number to find result");
        int number=sc.nextInt();
        String sql="select * from students where roll_number="+number;
        Statement statement=connection.createStatement();
        ResultSet result=statement.executeQuery(sql);
        if(result.next()){
            int rollNumber=result.getInt("roll_number");
            String name=result.getString("name");
            double percentage=result.getDouble("percentage");
            String address=result.getString("address");
            System.out.println("rollnumber is "+rollNumber);
            System.out.println("name is "+name);
            System.out.println("percentage is "+percentage);
            System.out.println("address is "+address);
        }
        else{
            System.out.println("No records found");
        }
    }
    public void selectAllRecords() throws SQLException {
        CallableStatement callableStatement=connection.prepareCall("{call get_All}");
        ResultSet result=callableStatement.executeQuery();
        while(result.next()){
            System.out.println("Roll Number is "+result.getInt("roll_number"));
            System.out.println("name is "+result.getString("name"));
            System.out.println("percentage is "+result.getDouble("percentage"));
            System.out.println("address is "+result.getString("address"));
            System.out.println();
        }
    }
    public void updateRecord() throws SQLException {
        int rollNumber = sc.nextInt();
        String sql = "SELECT * FROM students WHERE roll_number = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, rollNumber);
        ResultSet result = preparedStatement.executeQuery();

        if (result.next()) {
            int rollNumber1 = result.getInt("roll_number");
            String name = result.getString("name");
            double percentage = result.getDouble("percentage");
            String address = result.getString("address");

            System.out.println("Existing Record:");
            System.out.println("Roll Number: " + rollNumber1);
            System.out.println("Name: " + name);
            System.out.println("Percentage: " + percentage);
            System.out.println("Address: " + address);

            System.out.println("What to update:");
            System.out.println("1. Name");
            System.out.println("2. Percentage");
            System.out.println("3. Address");
            int choice = sc.nextInt();
            String updateSql = null;
            PreparedStatement updateStatement = null;
            switch (choice) {
                case 1:
                    System.out.println("Enter new Name:");
                    String newName = sc.next();
                    updateSql = "UPDATE students SET name = ? WHERE roll_number = ?";
                    updateStatement = connection.prepareStatement(updateSql);
                    updateStatement.setString(1, newName);
                    updateStatement.setInt(2, rollNumber);
                    break;
                case 2:
                    System.out.println("Enter new Percentage:");
                    double newPercentage = sc.nextDouble();
                    updateSql = "UPDATE students SET percentage = ? WHERE roll_number = ?";
                    updateStatement = connection.prepareStatement(updateSql);
                    updateStatement.setDouble(1, newPercentage);
                    updateStatement.setInt(2, rollNumber);
                    break;
                case 3:
                    System.out.println("Enter new Address:");
                    String newAddress = sc.next();
                    updateSql = "UPDATE students SET address = ? WHERE roll_number = ?";
                    updateStatement = connection.prepareStatement(updateSql);
                    updateStatement.setString(1, newAddress);
                    updateStatement.setInt(2, rollNumber);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    return;
            }
            int rows = updateStatement.executeUpdate();
            if (rows > 0) {
                System.out.println("Record updated successfully.");
                ResultSet updatedResult = preparedStatement.executeQuery();
                if (updatedResult.next()) {
                    System.out.println("Updated Record:");
                    System.out.println("Roll Number: " + updatedResult.getInt("roll_number"));
                    System.out.println("Name: " + updatedResult.getString("name"));
                    System.out.println("Percentage: " + updatedResult.getDouble("percentage"));
                    System.out.println("Address: " + updatedResult.getString("address"));
                }
            }
        }
    }

    public void deleteRecord() throws SQLException {
        System.out.println("Enter rollNumber to be deleted");
        int number=sc.nextInt();
        String sql="delete from students where roll_number="+number;
        Statement statement=connection.createStatement();
        int rows=statement.executeUpdate(sql);
        if(rows>0){
            System.out.println("record deleted sucessfully");
        }
    }
    public void transaction() throws SQLException {
        connection.setAutoCommit(false);
        PreparedStatement preparedStatement=null;
        String sql1="insert into students (name,percentage,address)values('prithick',80.00,'pune')";
        String sql2="insert into students (name,percentage,address)values('utt',86.89,'telagana')";
        preparedStatement=connection.prepareStatement(sql1);
        int row1=preparedStatement.executeUpdate();
        preparedStatement=connection.prepareStatement(sql2);
        int row2=preparedStatement.executeUpdate();
        if(row1>0 && row2>0){
            connection.commit();
        }
        else{
            connection.rollback();
        }
    }
    public void batchProcessing() throws SQLException {
        connection.setAutoCommit(false);
        String sql1="insert into students (name,percentage,address)values('raj',70.00,'pondy')";
        String sql2="insert into students (name,percentage,address)values('pinky',80.00,'karnataka')";
        String sql3="insert into students (name,percentage,address)values('romal',90.00,'srinagar')";
        String sql4="insert into students (name,percentage,address)values('rose',60.00,'jammu')";
        String sql5="update students set name='girish' where roll_number=9";
        Statement statement=connection.createStatement();
        statement.addBatch(sql1);
        statement.addBatch(sql2);
        statement.addBatch(sql3);
        statement.addBatch(sql4);
        statement.addBatch(sql5);
        int [] rows=statement.executeBatch();
        for(int i:rows){
            if(i>0){
                continue;
            }
            else{
                connection.rollback();
                System.out.println("wrong");
            }
        }
        connection.commit();
    }
}
