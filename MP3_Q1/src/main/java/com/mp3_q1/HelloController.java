package com.mp3_q1;

import com.mp3_q1.Length.LengthConverter;
import com.mp3_q1.Mass.MassConverter;
import com.mp3_q1.Temperature.TemperatureConverter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.util.StringConverter;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox<BaseUnitConverter> leftUnitMenu;
    @FXML
    private ComboBox<BaseUnitConverter> rightUnitMenu;
    @FXML
    private ComboBox<UnitTypeConverter> unitTypeMenu;
    @FXML
    private TextField leftTextField;
    @FXML
    private TextField rightTextField;

    private static LengthConverter lengthConverter =
            new LengthConverter();

    private static TemperatureConverter temperatureConverter =
            new TemperatureConverter();

    private static MassConverter massConverter = new MassConverter();

    private List<UnitTypeConverter> allUnitTypeConverter =
            Arrays.asList(lengthConverter, temperatureConverter, massConverter);


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        unitTypeMenu.getItems().addAll(allUnitTypeConverter);
//        leftUnitMenu.getItems().addAll("Meter", "Footer");
//        rightUnitMenu.getItems().addAll("Meter", "Footer");
        unitTypeMenu.getSelectionModel().selectFirst();
        unitTypeMenu.setConverter(new StringConverter<UnitTypeConverter>() {
            @Override
            public String toString(UnitTypeConverter unitTypeConverter) {

                return unitTypeConverter.getUnitType();
            }

            @Override
            public UnitTypeConverter fromString(String string) {
                return null;
            }
        });

        List<BaseUnitConverter> baseUnitConverters =
                unitTypeMenu.getValue().getBaseUnitConverterList();

        leftUnitMenu.getItems().addAll(baseUnitConverters);
        rightUnitMenu.getItems().addAll(baseUnitConverters);

        leftUnitMenu.getSelectionModel().select(0);
        rightUnitMenu.getSelectionModel().select(1);

        StringConverter<BaseUnitConverter> baseUnitStringConverter
                = new StringConverter<BaseUnitConverter>() {

            @Override
            public String toString(BaseUnitConverter baseUnitConverter) {

                return baseUnitConverter == null ? null :
                        baseUnitConverter.getName();
            }

            @Override
            public BaseUnitConverter fromString(String string) {

                return null;
            }

        };

        leftUnitMenu.setConverter(baseUnitStringConverter);
        rightUnitMenu.setConverter(baseUnitStringConverter);

    }

    public void onUnitTypeChange(ActionEvent e){

        ObservableList<BaseUnitConverter> newBaseUnitConverter
                = FXCollections.observableArrayList
                (unitTypeMenu.getValue().getBaseUnitConverterList());

        leftTextField.setText("");
        rightTextField.setText("");

        leftUnitMenu.setItems(newBaseUnitConverter);
        rightUnitMenu.setItems(newBaseUnitConverter);

        leftUnitMenu.getSelectionModel().select(0);
        rightUnitMenu.getSelectionModel().select(1);


    }

    public void onLeftUnitChange(ActionEvent e){

        System.out.println("on left unit");
        converterRightToLeft();
    }

    public void onRightUnitChange(ActionEvent e){

        System.out.println("on right unit");
        converterLeftToRight();
    }

    public void onLeftTextField(KeyEvent e){

        System.out.println("hello");
        converterLeftToRight();

    }
    public void onRightTextField(KeyEvent e){

        System.out.println("right text field ");
        converterRightToLeft();
    }


    private void converterLeftToRight(){

        if(leftTextField.getText().isBlank()){

            rightTextField.setText("");
        }
        else{

            UnitTypeConverter unitTypeConverter = unitTypeMenu.getValue();

            BigDecimal leftUnit =
                    new BigDecimal(Double.parseDouble(leftTextField.getText()));

            BigDecimal rightUnit= unitTypeConverter.converter(leftUnit,
                    leftUnitMenu.getValue(), rightUnitMenu.getValue());

            rightTextField.setText(rightUnit.stripTrailingZeros().toPlainString());

        }
    }

    public void converterRightToLeft(){

        if(rightTextField.getText().isBlank()){

            leftTextField.setText("");

        }
        else{

            UnitTypeConverter unitTypeConverter = unitTypeMenu.getValue();

            BigDecimal rightUnit =
                    new BigDecimal(Double.parseDouble(rightTextField.getText()));

            BigDecimal leftUnit = unitTypeConverter.converter(rightUnit,
                    rightUnitMenu.getValue(), leftUnitMenu.getValue());

            leftTextField.setText(leftUnit.stripTrailingZeros().toPlainString());
        }
    }




}