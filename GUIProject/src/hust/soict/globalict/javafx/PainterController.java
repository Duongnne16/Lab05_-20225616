package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;


public class PainterController {
	 @FXML
	    private Pane drawingAreaPane;

	    private boolean isEraseMode = false; 

	    @FXML
	    void clearButtonPressed(ActionEvent event) {
	       
	        drawingAreaPane.getChildren().clear();
	    }

	    @FXML
	    void drawingAreaMouseDragged(MouseEvent event) {
	        if (isEraseMode) {
	           
	            Circle eraserCircle = new Circle(event.getX(), event.getY(), 10);
	            eraserCircle.setFill(javafx.scene.paint.Color.WHITE);
	            drawingAreaPane.getChildren().add(eraserCircle);
	        } else {
	            // Tạo một vòng tròn màu đen để vẽ
	            Circle newCircle = new Circle(event.getX(), event.getY(),4);
	            newCircle.setFill(javafx.scene.paint.Color.BLACK);
	            drawingAreaPane.getChildren().add(newCircle);
	        }
	    }

	    @FXML
	    void penButtonPressed(ActionEvent event) {
	        // Kích hoạt chế độ vẽ
	        isEraseMode = false;
	    }

	    @FXML
	    void eraserButtonPressed(ActionEvent event) {
	        // Kích hoạt chế độ xóa
	        isEraseMode = true;
	    }


}