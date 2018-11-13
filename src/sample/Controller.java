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
    public TextField pesel_text;
    @FXML
    public TextField nr_tel;

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
        Add_Button.setDisable(true);

        met.asdf();

        met.TableOut(table_info, a);
        met.ButtonShow(button1test);
        met.number_text(number_text);
        met.name_text(name_text);
        met.surname_text(surname_text);
        met.pesel_text(pesel_text);
        met.nr_tel(nr_tel);
        met.ButtonShow2(buttonback);
        if (a == true) {
            met.Tablenewposition(table_info, a);

        }
    }


    boolean a = false;
//
//    public void Tableout() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(1500));
//        fadeTransition.setNode(table_info);
//        fadeTransition.setFromValue(1);
//        fadeTransition.setToValue(0);
//        fadeTransition.play();
//        a = true;
//
//    }
//
//    public void pesel_text() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(pesel_text);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        pesel_text.setVisible(true);
//        pesel_text.setLayoutX(504);
//        pesel_text.setLayoutY(47);
//        fadeTransition.play();
//
//    }
//
//    public void nr_tel() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(nr_tel);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        nr_tel.setVisible(true);
//        nr_tel.setLayoutX(504);
//        nr_tel.setLayoutY(87);
//        fadeTransition.play();
//
//    }
//
//    public void ButtonShow() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(button1test);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        button1test.setVisible(true);
//        button1test.setLayoutX(204);
//        fadeTransition.play();
//
//    }
//
//    public void ButtonShow2() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(buttonback);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        buttonback.setVisible(true);
//        buttonback.setLayoutX(204);
//        buttonback.setLayoutY(108);
//        fadeTransition.play();
//
//    }
//
//    private void number_text() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(number_text);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        number_text.setVisible(true);
//        number_text.setLayoutX(350);
//        number_text.setLayoutY(47);
//        fadeTransition.play();
//    }
//
//    private void name_text() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(name_text);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        name_text.setVisible(true);
//        name_text.setLayoutX(350);
//        name_text.setLayoutY(87);
//        fadeTransition.play();
//    }
//
//    private void surname_text() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3000));
//        fadeTransition.setNode(surname_text);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        surname_text.setLayoutX(350);
//        surname_text.setLayoutY(127);
//        surname_text.setVisible(true);
//        fadeTransition.play();
//    }
//
//    private void Tablenewposition() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(3500));
//        fadeTransition.setNode(table_info);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        table_info.setMaxHeight(350);
//        table_info.setLayoutY(20);
//        table_info.setLayoutX(20);
//        table_info.setDisable(true);
//
//        fadeTransition.play();
//        a = false;
//    }
///** back to orginal site*/
//
//    private void Tableinback() {
//        FadeTransition fadeTransition = new FadeTransition();
//        fadeTransition.setDuration(Duration.millis(2500));
//        fadeTransition.setNode(table_info);
//        fadeTransition.setFromValue(0);
//        fadeTransition.setToValue(1);
//        table_info.setMaxWidth(631);
//
//        table_info.setMaxHeight(672);
//        table_info.setDisable(false);
//        surname_text.setVisible(false);
//        name_text.setVisible(false);
//        nr_tel.setVisible(false);
//        pesel_text.setVisible(false);
//        number_text.setVisible(false);
//        buttonback.setVisible(false);
//        button1test.setVisible(false);
//        fadeTransition.play();
//
//    }

public void ButtonBack(){

        Add_Button.setDisable(false);
        //Tableinback();
}
    boolean FlagID = false;
    boolean FlagPesel = false;
    boolean Flagtel = false;
    public void AddButton1()  {

// << tu ma byc nowe okno dodawania użytkownika
       //dodawanie z palca
//Methods allMet = new Methods();


if( (number_text.getText().trim().isEmpty() || number_text.getText() == null)||
    (name_text.getText().trim().isEmpty() || name_text.getText() == null)||
    (surname_text.getText().trim().isEmpty() || surname_text.getText() == null)||
    (pesel_text.getText().trim().isEmpty() || pesel_text.getText() == null)||
    (nr_tel.getText().trim().isEmpty() || nr_tel.getText() == null)){
         Alert information = new Alert(Alert.AlertType.ERROR);
        information.setContentText("nie zostala wprowadzona jedna z wartości " );
        information.setHeaderText("!!!!!!!!!!!" );
        information.showAndWait();
}else{
    users as = new users();
    FlagID = false;
    FlagPesel = false;
    checkID();
    checkPesel();
    checkneTel();
if( FlagID != false && FlagPesel !=false && Flagtel != false) {
    as.setId(number_text.getText());
    as.setName(name_text.getText());
    as.setSurname(surname_text.getText());
    as.setPesel(pesel_text.getText());
    as.setNr_tel(nr_tel.getText());
    as.setEdit(editButton); // ------------>zrobić dodawanie buttona bo nie działa

    number_text.clear();
    name_text.clear();
    pesel_text.clear();
    nr_tel.clear();
    surname_text.clear();
    table_info.getItems().add(as);

}else{

        Alert IdAllert = new Alert(Alert.AlertType.ERROR);
        IdAllert.setContentText("Poprawność wpisanie okien " +" \n ID :" + FlagID + "\n Pesel: " +FlagPesel + "\n Telefon: " +Flagtel);
        IdAllert.show();
}
}

    }


 // walidacja sprawdzajaca poprawnosc wpisanych znaków
    public void checkID(){
        char[] actualArrayChar = number_text.getText().toCharArray();
        int x = number_text.getText().length();
        boolean[] test = new boolean[x];
            for(int i = 0; i< x; i ++)
            {
                if(actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9'){
                    test[i] = true ;
                    FlagID = true;
                }else{
                    test[i] = false;
                }
            }
            for(boolean j : test)
            {
                if( j == false){
                    FlagID = false;
                }
             }
        }

    public void checkPesel(){
        char[] actualArrayChar = pesel_text.getText().toCharArray();
        int x = pesel_text.getText().length();
        boolean[] test = new boolean[x];
        for(int i = 0; i< x; i ++)
        {
            if(actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9'){
                test[i] = true ;
                FlagPesel = true;
            }else{
                test[i] = false;
            }
        }
        for(boolean j : test)
        {
            if( j == false){
                FlagPesel = false;
            }
        }
    }

    public void checkneTel() {
        char[] actualArrayChar = nr_tel.getText().toCharArray();
        int x = nr_tel.getText().length();
        boolean[] test = new boolean[x];
        System.out.println(x);
        switch (x) {
            case 9:
                for (int i = 0; i < x; i++) {
                    if (actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9') {
                        test[i] = true;
                        Flagtel = true;
                    } else {
                        test[i] = false;
                    }
                }
                for (boolean j : test) {
                    if (j == false) {
                        Flagtel = false;
                    }
                }
                break;
            default:
                Flagtel = false;
                break;
        }
    }


public ObservableList<users> loadData(){
      ObservableList<users> data_table =FXCollections.observableArrayList();

       return data_table;
  }



}
/** test*/
/** test 2*/