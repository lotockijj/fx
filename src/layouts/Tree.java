package layouts;/**
 * Created by Роман Лотоцький on 19.12.2016.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tree extends Application {

    Stage window;
    TreeView<String> tree;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("TreeView");

        TreeItem<String> root, bucky, megan;

        root = new TreeItem<>("Root");
        root.setExpanded(true);

        bucky = makeBranch("Bucky", root);
        makeBranch("Oak", bucky);
        makeBranch("Pine", bucky);
        makeBranch("Apple", bucky);

        megan = makeBranch("Megan", root);
        makeBranch("soap", megan);
        makeBranch("towel", megan);
        makeBranch("brush", megan);

        tree = new TreeView<>(root);
        tree.setShowRoot(false);

        VBox vBox = new VBox();
        vBox.getChildren().add(tree);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.setSpacing(10);
        Scene scene = new Scene(vBox, 300, 250);
        window.setScene(scene);
        window.show();

    }

    public TreeItem<String> makeBranch(String title, TreeItem<String > parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(false);
        parent.getChildren().add(item);
        return item;
    }
}
