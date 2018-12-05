package sample;

import javafx.scene.control.*;

public class Function extends Controller {


        Function()
        {
        }

        public boolean flagtable(Boolean a){

                return   a = true;
        }

     private   Boolean FlagID = true;
     private   Boolean Flag_Pes = true;
     private   Boolean Flagtel = true;
     private   Boolean Flagname = true;
     private   Boolean Flagsurname = true;

        public void testprzycuski(TextField number_text, TextField FirstName_text, TextField surname_text, TextField pes_text, TextField nr_tel, TextField typ, TableView <users> table_info, Button edycjaWiersza){

                if( (number_text.getText().trim().isEmpty() || number_text.getText() == null)||
                        (FirstName_text.getText().trim().isEmpty() || FirstName_text.getText() == null)||
                        (surname_text.getText().trim().isEmpty() || surname_text.getText() == null)||
                        (pes_text.getText().trim().isEmpty() || pes_text.getText() == null)||
                        (nr_tel.getText().trim().isEmpty() || nr_tel.getText() == null)){
                        Alert information = new Alert(Alert.AlertType.INFORMATION);
                        information.setContentText("Wprowadź poprawne wartości i naciśnij Dodaj nowy wpis." );
                        information.setHeaderText("Nie wprowadziłeś żadnych wartości." );
                        information.setTitle("Błąd wprowadzania wartości.");
                        information.showAndWait();
                }else{
                        users as = new users();
                        checkPes(pes_text);
                        checkID(number_text);
                        checkTel(nr_tel);
                        checkName(FirstName_text);
                        checkSurname(surname_text);

                        if( FlagID != false && Flag_Pes != false && Flagtel != false && Flagname != false && Flagsurname != false) {
                                as.setId(number_text.getText());
                                as.setFirstName(FirstName_text.getText());
                                as.setSurname(surname_text.getText());
                                as.setPes(pes_text.getText());
                                as.setNr_tel(nr_tel.getText());
                                as.setTyp(typ.getText());
                               // as.setEdit(new Button("54654") ); // ------------>zrobić dodawanie buttona bo nie działa

                                number_text.clear();
                                FirstName_text.clear();
                                pes_text.clear();
                                nr_tel.clear();
                                surname_text.clear();
                                typ.clear();


                                table_info.getItems().add(as);
                              //  edycjaWiersza.setDisable(false);
                                edycjaWiersza.setText("Edycja OFF");

                        }else{

                                Alert IdAllert = new Alert(Alert.AlertType.ERROR);
                                IdAllert.setContentText("Poprawność wpisanie okien " +" \n ID :" + FlagID + "\n Pesel: " +Flag_Pes + "\n Telefon: " +Flagtel);
                                IdAllert.show();
                        }
                }


        }


  public void checkID(TextField number_text) {
                char[] actualArrayChar = number_text.getText().toCharArray();
                int x = number_text.getText().length();
                boolean[] test = new boolean[x];
                for(int i = 0; i< x; i ++)
                {
                        if(actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9'){
                                test[i] = true ;
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

  public void checkPes(TextField pes_text){
                char[] actualArrayChar = pes_text.getText().toCharArray();
                int q = pes_text.getText().length();
                boolean[] test1 = new boolean[q];
                switch(q) {
                        case 11:
                        for (int i = 0; i < q; i++) {
                                if (actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9') {
                                        test1[i] = true;
                                        //   FlagID = true;
                                } else {
                                        test1[i] = false;
                                }
                        }
                        for (boolean j : test1) {
                                if (j == false) {
                                        Flag_Pes = false;
                                }
                        }
                        break;
                        default:
                                Flag_Pes = false;
                                break;
                }
      }

  public void checkTel(TextField nr_tel) {
                char[] actualArrayChar = nr_tel.getText().toCharArray();
                int x = nr_tel.getText().length();
                boolean[] test = new boolean[x];
                switch (x) {
                        case 9:
                                for (int i = 0; i < x; i++) {
                                        if (actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9') {
                                                test[i] = true;
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

  public void checkName(TextField FirstName_text) {
        char[] actualArrayChar = FirstName_text.getText().toCharArray();
        int x = FirstName_text.getText().length();
        boolean[] test = new boolean[x];

                for (int i = 0; i < x; i++) {
                    if (actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9') {
                        test[i] = false;
                    } else {
                        test[i] = true;
                    }
                }
                for (boolean j : test) {
                    if (j == false) {
                        Flagname = false;
                        return;
                    }






}}

  public void checkSurname(TextField surname_text) {
        char[] actualArrayChar = surname_text.getText().toCharArray();
        int x = surname_text.getText().length();
        boolean[] test = new boolean[x];

        for (int i = 0; i < x; i++) {
            if (actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9') {
                test[i] = false;
            } else {
                test[i] = true;
            }
        }
        for (boolean j : test) {
            if (j == false) {
                Flagsurname = false;
                return;
            }






        }}
}
