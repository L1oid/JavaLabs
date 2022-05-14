package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class car {
    public SimpleIntegerProperty id;
    public SimpleStringProperty name;
    public SimpleIntegerProperty price;

    public car(int id, String name, int price){
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.price = new SimpleIntegerProperty(price);
    }

    public int getId(){
        return this.id.get();
    }

    public String getName(){
        return this.name.get();
    }

    public int getPrice(){
        return this.price.get();
    }

    public void setId(int id){
        this.id.set(id);
    }

    public void setName(String name){
        this.name.set(name);
    }

    public void setPrice(int price){
        this.price.set(price);
    }

    public static ObservableList<car> getAllCars() throws SQLException{
        ObservableList<car> cars = FXCollections.observableArrayList();
        ResultSet rs;
        String query = "select * from car";
        rs = database.exeQuery(query);
        while(rs.next()){
            car car = new car(rs.getInt("id"), rs.getString("name"), rs.getInt("price"));
            cars.add(car);
        }
        return cars;
    }

    public static ObservableList<car> getFilteredCars(String queryFilter) throws SQLException{
        ObservableList<car> cars = FXCollections.observableArrayList();
        ResultSet rs;
        String query = "select * from car where " + queryFilter + ";";
        rs = database.exeQuery(query);
        while(rs.next()){
            car car = new car(rs.getInt("id"), rs.getString("name"), rs.getInt("price"));
            cars.add(car);
        }
        return cars;
    } 

    public static void addCar(String id, String name, String price){
        String query = "insert into car(id, name, price)\nvalues ("+ id + ", \'" + name + "\', " + price + ");";
        database.exeUpdate(query);
    }

    public static void updateCar(String id, String name, String price){
        String query = "update car\nset name=\'" + name + "\', price=" + price + " \nwhere id=" + id + ";";
        database.exeUpdate(query);
    }

    public static void deleteCar(String id){
        String query = "delete from car\nwhere id=" + id + ";";
        database.exeUpdate(query);
    }
}
