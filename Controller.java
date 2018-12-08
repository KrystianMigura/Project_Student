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
import java.util.Optional;
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
    public TableView<users> table_info;
    @FXML
    private TableColumn<users, String> col_id;
    @FXML
    private TableColumn<users, String> col_imie;
    @FXML
    private TableColumn<users, String> col_Nazwisko;
    @FXML
    private TableColumn<users, String> col_Tel;
    @FXML
    private TableColumn<users, String> col_Pesel;
    @FXML
    private TableColumn<users, String> col_Uprawnienia;
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
    @FXML
    public TextField typ;

    boolean a = false;


    @Override
    public void initialize(URL location, ResourceBundle sample) {
        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_imie.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        col_Nazwisko.setCellValueFactory(new PropertyValueFactory<>("surname"));
        col_Pesel.setCellValueFactory(new PropertyValueFactory<>("pes"));
        col_Tel.setCellValueFactory(new PropertyValueFactory<>("nr_tel"));
        col_Uprawnienia.setCellValueFactory(new PropertyValueFactory<>("typ"));


        table_info.setEditable(true);
        col_id.setCellFactory(TextFieldTableCell.forTableColumn());
        col_imie.setCellFactory(TextFieldTableCell.forTableColumn());
        col_Nazwisko.setCellFactory(TextFieldTableCell.forTableColumn());
        col_Pesel.setCellFactory(TextFieldTableCell.forTableColumn());
        col_Tel.setCellFactory(TextFieldTableCell.forTableColumn());

        table_info.setDisable(true);
        table_info.setItems(loadData());
        edycjaWiersza.setDisable(true);
        //typ.getItems().addAll("Administrator","Moderator","Programista", "Tester", "Użytkownik");

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
        met.choiceBox(typ);
        met.ButtonShow2(buttonback);

        if (test.flagtable(a) == true) {
            met.Tablenewposition(table_info);

        }
    }

    public void ButtonBack() {
        Methods met = new Methods();
        Add_Button.setDisable(false);
        if (edycjaWiersza.getText() == "Edycja ON" || edycjaWiersza.getText() == "Edycja OFF")
            edycjaWiersza.setDisable(false);

        met.Tableinback(table_info, surname_text, FirstName_text, nr_tel, pes_text, number_text, button1test, buttonback, typ);
        // typ.setLayoutY(900);
    }


    public void checkID() {
        Function a = new Function();
        a.checkID(number_text);
    }

    public void checkPes() {
        Function b = new Function();
        b.checkPes(pes_text);
    }

    public void checktel() {
        Function c = new Function();
        c.checkTel(nr_tel);
    }

    public void AddButton1() {

        Function testowa = new Function();
        testowa.testprzycuski(number_text, FirstName_text, surname_text, pes_text, nr_tel, typ, table_info, edycjaWiersza);

    }


    public ObservableList<users> loadData() {
        ObservableList<users> data_table = FXCollections.observableArrayList();

        return data_table;
    }

    public void EdycjaWiersza() {

        ObservableList<users> person;
        person = table_info.getSelectionModel().getSelectedItems();

        if (edycjaWiersza.getText() == "Edycja OFF") {
            edycjaWiersza.setText("Edycja ON");
            table_info.setDisable(false);
        } else {
            edycjaWiersza.setText("Edycja OFF");
            table_info.setDisable(true);
        }


        if (table_info.getSelectionModel().getSelectedItem() != null) {
            System.out.println("Imie: " + person.get(0).getFirstName() + " Nazwisko: " + person.get(0).getSurname());

        }
    }

    boolean cETN = false;
    String sprImie,sprId, sprSurname,sprPes,sprTel,sprPosition;
    String oldVal;

    // edycja komorki imie
    public void onEditImie() {
        checkEditImie();
        users user = table_info.getSelectionModel().getSelectedItem();
        oldVal = user.getFirstName();
        checkImieEdit(sprImie);
        if(cETN == true && sprImie.length() > 0){
            user.setFirstName(sprImie);
        }else{
            user.setFirstName(oldVal);
        }
        table_info.refresh();
    }

    public void onEditId() {
        checkEditId();
        users user = table_info.getSelectionModel().getSelectedItem();
        oldVal = user.getId();
        checkIdEdit(sprId);
        if (cETN == true && sprId.length() > 0) {
            user.setId(sprId);
        } else {
            user.setId(oldVal);
        }
        table_info.refresh();
    }

    public void OnEditSurname() {
        checkEditSurname();
        users user = table_info.getSelectionModel().getSelectedItem();
        oldVal = user.getSurname();
        checkSurnameEdit(sprSurname);
        if (cETN == true && sprSurname.length() > 0) {
            user.setSurname(sprSurname);
        } else {
            user.setSurname(oldVal);
        }
        table_info.refresh();
    }

    public void onEditPes() {
        checkEditPes();
        users user = table_info.getSelectionModel().getSelectedItem();
        oldVal = user.getPes();
        checkPesEdit(sprPes);
        if (cETN == true && sprPes.length() == 11 && sprPes.length() > 0) {
            user.setPes(sprPes);
        } else {
            user.setPes(oldVal);
        }
        table_info.refresh();
    }

    public void OnEditNrTel() {
        checkEditTel();
        users user = table_info.getSelectionModel().getSelectedItem();
        oldVal = user.getNr_tel();
        checkTelEdit(sprTel);
        if (cETN == true && sprTel.length() > 0) {
            user.setNr_tel(sprTel);
        } else {
            user.setNr_tel(oldVal);
        }
        table_info.refresh();
    }

    public void onEditPosition(){
        checkEditPosition();
        users user = table_info.getSelectionModel().getSelectedItem();
        oldVal = user.getTyp();
        checkPositionEdit(sprPosition);
        if (cETN == true && sprPosition.length() > 0) {
            user.setTyp(sprPosition);
        } else {
            user.setTyp(oldVal);
        }
        table_info.refresh();
    }



    //edycja nr telefonu działa
    public void checkEditPosition(){
        TextInputDialog checkme = new TextInputDialog();
        checkme.setTitle("Okno zmiany wartosci");
        checkme.setHeaderText("Wpisz poprawne Stanowisko.");
        checkme.setContentText("Wprowadz nowe Stanowisko:");

        Optional<String> result = checkme.showAndWait();
        if (result.isPresent()) {
            sprPosition = result.get();
        }
    }

    public void checkEditImie(){
        TextInputDialog checkme = new TextInputDialog();
        checkme.setTitle("Okno zmiany wartosci");
        checkme.setHeaderText("Wpisz poprawne Imię.");
        checkme.setContentText("Wprowadz nowe Imię:");

        Optional<String> result = checkme.showAndWait();
        if (result.isPresent()) {
            sprImie = result.get();
        }
    }

    public void checkEditTel() {
        TextInputDialog checkme = new TextInputDialog();
        checkme.setTitle("Okno zmiany wartosci");
        checkme.setHeaderText("Wpisz poprawny nr telefonu");
        checkme.setContentText("Wprowadz nowy nr telefonu:");

        Optional<String> result = checkme.showAndWait();
        if (result.isPresent()) {
            sprTel = result.get();
        }
    }

    public void checkTelEdit(String x) {
        char[] checkTel = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (checkTel[i] >= '0' && checkTel[i] <= '9') {
                cETN = true;
            } else {
                cETN = false;
                return;
            }
        }
    }

    public void checkEditId() {
        TextInputDialog checkme = new TextInputDialog();
        checkme.setTitle("Okno zmiany wartosci");
        checkme.setHeaderText("Wpisz poprawny nr Id");
        checkme.setContentText("Wprowadz nowy nr Id:");

        Optional<String> result = checkme.showAndWait();
        if (result.isPresent()) {
            sprId = result.get();
        }
    }

    public void checkEditPes() {
        TextInputDialog checkme = new TextInputDialog();
        checkme.setTitle("Okno zmiany wartosci");
        checkme.setHeaderText("Wpisz poprawny nr Pesel");
        checkme.setContentText("Wprowadz nowy nr Pesel:");

        Optional<String> result = checkme.showAndWait();
        if (result.isPresent()) {
            sprPes = result.get();
        }

    }

    public void checkImieEdit(String x){
        char[] checkImie = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (checkImie[i] >= '0' && checkImie[i] <= '9') {
                cETN = false;
                return;
            } else {
                cETN = true;
            }
        }
    }

    public void checkPesEdit(String x) {
        char[] checkPes = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (checkPes[i] >= '0' && checkPes[i] <= '9') {
                cETN = true;
            } else {
                cETN = false;
                return;
            }
        }
    }

    public void checkEditSurname() {
        TextInputDialog checkme = new TextInputDialog();
        checkme.setTitle("Okno zmiany wartosci");
        checkme.setHeaderText("Wpisz poprawne Nazwisko");
        checkme.setContentText("Wprowadz nowye Nazwisko: ");

        Optional<String> result = checkme.showAndWait();
        if (result.isPresent()) {
            sprSurname = result.get();
        }
    }

    public void checkSurnameEdit(String x) {
        char[] checkSurname = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (checkSurname[i] >= '0' && checkSurname[i] <= '9') {
                cETN = false;
                return;
            } else {
                cETN = true;

            }
        }
    }

    public void checkIdEdit(String x) {
        char[] checkid = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (checkid[i] >= '0' && checkid[i] <= '9') {
                cETN = true;
            } else {
                cETN = false;
                return;
            }
        }
    }

    public void checkPositionEdit(String x){
        char[] checkId = x.toCharArray();
        for (int i = 0; i < x.length(); i++) {
            if (checkId[i] >= '0' && checkId[i] <= '9') {
                cETN = false;
                return;
            } else {
                cETN = true;
            }
        }
    }
}

