package com.example2;

import java.io.IOException;
import java.util.Arrays;

import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private GridPane matrixPaneDOWN;

    private TextField[][] TmatrixDOWN;
    private float[][] matrixDOWN;

    private int rows, columns;

    @FXML
    private GridPane matrixPaneUP;

    private TextField[][] TmatrixUP;
    private float[][] matrixUP;

    @FXML
    private GridPane ResultPane;
    private TextField[][] TResult;



    private TextField[][] setShape( GridPane panel,int width, int height, int rows, int columns) {
        TextField[][] matrix = new TextField[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                TextField tf = new TextField();
                matrix[i][j] = tf;
                tf.setPrefWidth(width);
                tf.setPrefHeight(height);
                panel.add(tf, j, i);
            }
        }
        return matrix;
    }

    private float[][] getMatrix(TextField[][] matrix){
        float[][] matrixFloat = new float[matrix.length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                matrixFloat[i][j] = Float.parseFloat(matrix[i][j].getText());
            }
        }
        return matrixFloat;
    }

    @FXML
    private void createMatrixes() throws IOException {
        rows = 3;
        columns = 3;
        TmatrixDOWN = setShape(matrixPaneDOWN,50,50, rows ,columns);
        TmatrixUP = setShape(matrixPaneUP,50, 50, rows ,columns);
        System.out.println(TmatrixDOWN[0]);
    }    

    @FXML
    private void calcMatricis() throws IOException {
        matrixDOWN = getMatrix(TmatrixDOWN);
        matrixUP = getMatrix(TmatrixUP);

        Matrix mUp = new Matrix(new int[] {rows, columns}, matrixUP);
        Matrix mDown = new Matrix(new int[] {rows, columns}, matrixDOWN);
        Matrix mResult = Matrix.sum(mUp, mDown);
        TResult = setShape(ResultPane,50, 50, rows ,columns);
        for (int i = 0; i < mResult.get_shape()[0]; i++) {
            for (int j = 0; j < mResult.get_shape()[1]; j++) {
                TResult[i][j].setText(String.valueOf(mResult.get_item(i, j)));
            }
        }


    }   
}
