package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    public Button editButton;
    @FXML
    public Button button1test;
    @FXML
    public Button buttonback;
    @FXML
    public Button Add_Button;
    @FXML
    public TableView <users> table_info;
    @FXML
    private TableColumn <users, String> col_id;
    @FXML
    private TableColumn <users, String> col_Imie;
    @FXML
    private TableColumn <users, String> col_Nazwisko;
    @FXML
    private TableColumn <users, String> col_Tel;
    @FXML
    private TableColumn <users, String> col_Pesel;
    @FXML
    private TableColumn <users, String> col_Edit;

    @FXML
    public TextField number_text;
    @FXML
    public TextField name_text;
    @FXML
    public TextField surname_text;
    @FXML
    public TextField pes_text;
    @FXML
    public TextField nr_tel;

    boolean a = false;


    @Override
    public void initialize(URL location, ResourceBundle sample) {
        col_id.setCellValueFactory(new PropertyValueFactory <>("id"));
        col_Imie.setCellValueFactory(new PropertyValueFactory <>("name"));
        col_Nazwisko.setCellValueFactory(new PropertyValueFactory <>("surname"));
        col_Pesel.setCellValueFactory(new PropertyValueFactory <>("pesel"));
        col_Tel.setCellValueFactory(new PropertyValueFactory <>("nr_tel"));
        col_Edit.setCellValueFactory(new PropertyValueFactory<>("Edycja"));
        table_info.setItems(loadData());
    }


    /* Pierwsza transformacja obiektów wyswietlanych*/
    public void AddButton() throws IOException, InterruptedException {
        Methods met = new Methods();
        Function test = new Function();

        Add_Button.setDisable(true);
        met.TableOut(table_info);
        met.ButtonShow(button1test);
        met.number_text(number_text);
        met.name_text(name_text);
        met.surname_text(surname_text);
        met.pes_text(pes_text);
        met.nr_tel(nr_tel);
        met.ButtonShow2(buttonback);
        if (test.flagtable(a) == true) {
            met.Tablenewposition(table_info);

        }
    }

public void ButtonBack(){
    Methods met = new Methods();
    Add_Button.setDisable(false);
    met.Tableinback(table_info, surname_text,  name_text, nr_tel, pes_text, number_text, button1test, buttonback);
}

    public void checkID() {
        Function a = new Function();
        a.checkID(number_text);
    }
    public void checkPes(){
        Function b = new Function();
        b.checkPes(pes_text);
    }

    public void checktel(){
        Function c = new Function();
        c.checkTel(nr_tel);
    }

    public void AddButton1()  {
    Function testowa = new Function();
    testowa.testprzycuski(number_text,name_text,surname_text, pes_text,nr_tel, editButton, table_info);
    }


public ObservableList<users> loadData(){
      ObservableList<users> data_table =FXCollections.observableArrayList();

       return data_table;
  }



}
