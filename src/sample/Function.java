package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Function extends Controller {


        Function()
        {


        }



        public boolean flagtable(Boolean a){

                return   a = true;
        }


        Boolean FlagID = true;
        Boolean Flag_Pes = true;
        Boolean Flagtel = true;
        public void testprzycuski(TextField number_text, TextField pes_text, TextField name_text, TextField surname_text, TextField nr_tel,  Button editButton, TableView table_info){


                if( (number_text.getText().trim().isEmpty() || number_text.getText() == null)||
                        (name_text.getText().trim().isEmpty() || name_text.getText() == null)||
                        (surname_text.getText().trim().isEmpty() || surname_text.getText() == null)||
                        (pes_text.getText().trim().isEmpty() || pes_text.getText() == null)||
                        (nr_tel.getText().trim().isEmpty() || nr_tel.getText() == null)){
                        Alert information = new Alert(Alert.AlertType.ERROR);
                        information.setContentText("nie zostala wprowadzona jedna z wartości " );
                        information.setHeaderText("!!!!!!!!!!!" );
                        information.showAndWait();
                }else{
                        users as = new users();
                        checkPes(pes_text);
                        checkID(number_text);

                        checkTel(nr_tel);

                        if( FlagID != false && Flag_Pes != false && Flagtel != false) {
                                as.setId(number_text.getText());
                                as.setName(name_text.getText());
                                as.setSurname(surname_text.getText());
                                as.setPesel(pes_text.getText());
                                as.setNr_tel(nr_tel.getText());
                                as.setEdit(editButton); // ------------>zrobić dodawanie buttona bo nie działa

                                number_text.clear();
                                name_text.clear();
                                pes_text.clear();
                                nr_tel.clear();
                                surname_text.clear();
                                table_info.getItems().add(as);

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
                             //   FlagID = true;
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
                for(int i = 0; i< q; i ++)
                {
                        if(actualArrayChar[i] >= '0' && actualArrayChar[i] <= '9'){
                                test1[i] = true ;
                                //   FlagID = true;
                        }else{
                                test1[i] = false;
                        }
                }
                for(boolean j : test1)
                {
                        if( j == false){
                                Flag_Pes = false;
                        }
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


}
