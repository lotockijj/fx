package main.java.layouts;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import layouts.Product;

/**
 * Created by Роман Лотоцький on 20.12.2016.
 */
public class MainForTable extends Application {

    Stage window;
    TableView<Product> table;
    TextField nameInput, priceInput, quantityInput;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("My table...");

        TableColumn<Product, String> nameColumn = new TableColumn("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, String> priceColumn = new TableColumn("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, String> quantityColumn = new TableColumn("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn, priceColumn, quantityColumn);

        nameInput = new TextField();
        nameInput.setPromptText("name");
        nameInput.setMinWidth(100);

        priceInput = new TextField();
        priceInput.setPromptText("price");
        //priceInput.setMinWidth(100);

        quantityInput = new TextField();
        quantityInput.setPromptText("quantity");
        //quantityInput.setMinWidth(100);

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> addButtonClicked());
        Button deleteButton = new Button("Delete");
        deleteButton.setOnAction(e -> deleteButtonClicked());

        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10, 10, 10, 10));
        hBox.setSpacing(10);
        hBox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, deleteButton);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table, hBox);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.show();
    }

    private void deleteButtonClicked() {
        ObservableList<Product> productSelected, allProduct;
        allProduct = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();
        productSelected.forEach(allProduct::remove);
    }

    private void addButtonClicked() {
        Product products = new Product();
        products.setName(nameInput.getText());
        products.setPrice(Double.parseDouble(priceInput.getText()));
        products.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(products);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }

    //Get all of the products
    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("laptop", 859.00, 20));
        products.add(new Product("Bouncy Ball", 2.49, 190));
        products.add(new Product("DVD", 99.00, 74));
        products.add(new Product("Corn", 0.05, 856));
        return products;
    }
}