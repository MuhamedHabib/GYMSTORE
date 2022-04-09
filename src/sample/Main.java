package sample;

import Entity.Product;
import Service.ServiceProduct;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
        Product prod1=new Product(1,"test","test",1000,2);

        Product prod2=new Product(10,"test","test",1100,2);

        Product prod3=new Product(11,"test","test",1200,2);

        Product prod4=new Product(12,"test","test",1300,2);

        ServiceProduct spp=new ServiceProduct();



        try{
            System.out.println("THIS IS ADD FUNCTION");
            System.out.println("THIS IS ADD FUNCTION");

            spp.add(prod2);

            System.out.println("THIS IS DELETE FUNCTION");

            spp.delete(5L);

            System.out.println("THIS IS READ FUNCTION");
            System.out.println(spp.read());

            System.out.println("THIS IS UPDATE ACTION");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
