package sample;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.awt.event.ActionEvent;
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
    public Button edycjaWiersza;
    @FXML
    public TableView <users> table_info;
    @FXML
    private TableColumn <users, String> col_id;
    @FXML
    private TableColumn <users, String> col_imie;
    @FXML
    private TableColumn <users, String> col_Nazwisko;
    @FXML
    private TableColumn <users, String> col_Tel;
    @FXML
    private TableColumn <users, String> col_Pesel;
    @FXML
    private TableColumn <users, Button> col_Edit;
    @FXML
    public TextField number_text;
    @FXML
    public TextField FirstName_text;
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
        col_imie.setCellValueFactory(new PropertyValueFactory <>("FirstName"));
        col_Nazwisko.setCellValueFactory(new PropertyValueFactory <>("surname"));
        col_Pesel.setCellValueFactory(new PropertyValueFactory <>("pes"));
        col_Tel.setCellValueFactory(new PropertyValueFactory <>("nr_tel"));
        col_Edit.setCellValueFactory(new PropertyValueFactory<>("editButton"));

        table_info.setEditable(true);
        col_id.setCellFactory(TextFieldTableCell.forTableColumn());
        col_imie.setCellFactory(TextFieldTableCell.forTableColumn());
        col_Nazwisko.setCellFactory(TextFieldTableCell.forTableColumn());
        col_Pesel.setCellFactory(TextFieldTableCell.forTableColumn());
        col_Tel.setCellFactory(TextFieldTableCell.forTableColumn());

        table_info.setDisable(true);
        table_info.setItems(loadData());
        edycjaWiersza.setDisable(true);


                }

   /* public void enableButton(){
        if (table_info.getSelectionModel().getSelectedItem() != null)
        edycjaWiersza.setDisable(false);
 }*/

    /* Pierwsza transformacja obiektów wyswietlanych*/
    public void AddButton() throws IOException, InterruptedException {
        Methods met = new Methods();
        Function test = new Function();
        edycjaWiersza.setDisable(true);

        Add_Button.setDisable(true);
        met.TableOut(table_info);
        met.ButtonShow(button1test);
        met.number_text(number_text);
        met.name_text(FirstName_text);
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
    if(edycjaWiersza.getText() == "Edycja ON" || edycjaWiersza.getText() == "Edycja OFF")
    edycjaWiersza.setDisable(false);

    met.Tableinback(table_info, surname_text,  FirstName_text, nr_tel, pes_text, number_text, button1test, buttonback);

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
    testowa.testprzycuski(number_text,FirstName_text,surname_text, pes_text,nr_tel, editButton, table_info, edycjaWiersza);

    }


public ObservableList<users> loadData(){
      ObservableList<users> data_table =FXCollections.observableArrayList();

       return data_table;
  }

    public void EdycjaWiersza(){

        ObservableList <users> person;
        person = table_info.getSelectionModel().getSelectedItems();

        if(edycjaWiersza.getText()=="Edycja OFF"){
            edycjaWiersza.setText("Edycja ON");
            table_info.setDisable(false);
            }
            else
            {
                edycjaWiersza.setText("Edycja OFF");
                table_info.setDisable(true);
            }




        if(table_info.getSelectionModel().getSelectedItem() != null) {
            System.out.println("Imie: " + person.get(0).getFirstName() + " Nazwisko: " + person.get(0).getSurname());
            String x = "asdf";
        }
    }

// edycja komorki imie
    public void onEditImie(TableColumn.CellEditEvent<users, String> usersStringCellEditEvent) {
        users user = table_info.getSelectionModel().getSelectedItem();
        user.setFirstName(usersStringCellEditEvent.getNewValue());
    }

    public void onEditId(TableColumn.CellEditEvent<users, String> usersStringCellEditEvent) {
        users user = table_info.getSelectionModel().getSelectedItem();
        user.setId(usersStringCellEditEvent.getNewValue());
    }

    public void OnEditSurname(TableColumn.CellEditEvent<users, String> usersStringCellEditEvent) {
        users user = table_info.getSelectionModel().getSelectedItem();
        user.setSurname(usersStringCellEditEvent.getNewValue());
    }


    public void onEditPes(TableColumn.CellEditEvent<users, String> usersStringCellEditEvent) {
        users user = table_info.getSelectionModel().getSelectedItem();
        user.setPes(usersStringCellEditEvent.getNewValue());
    }

    public void OnEditNrTel(TableColumn.CellEditEvent<users, String> usersStringCellEditEvent) {
        users user = table_info.getSelectionModel().getSelectedItem();
        user.setNr_tel(usersStringCellEditEvent.getNewValue());
    }
}
