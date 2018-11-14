package sample;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.util.Duration;
public class Methods extends Controller implements Initializable {


    @FXML
    public Button editButton;



    public void TableOut(TableView table_info){

        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(1500));
        fadeTransition.setNode(table_info);
        fadeTransition.setFromValue(1);
        fadeTransition.setToValue(0);
        fadeTransition.play();


        }


    public void ButtonShow(Button button1test){
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(button1test);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
            button1test.setVisible(true);
            button1test.setLayoutX(204);
        fadeTransition.play();
    }

    public void number_text(TextField number_text){
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(number_text);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
            number_text.setVisible(true);
            number_text.setLayoutX(350);
            number_text.setLayoutY(47);
        fadeTransition.play();
    }

    public void name_text(TextField name_text){
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(name_text);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
           name_text.setVisible(true);
            name_text.setLayoutX(350);
            name_text.setLayoutY(87);
        fadeTransition.play();
    }

    public void surname_text(TextField surname_text){
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(surname_text);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
            surname_text.setLayoutX(350);
            surname_text.setLayoutY(127);
            surname_text.setVisible(true);
        fadeTransition.play();
    }

    public void pes_text(TextField pes_text){
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(pes_text);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
            pes_text.setVisible(true);
            pes_text.setLayoutX(504);
            pes_text.setLayoutY(47);
        fadeTransition.play();
    }

    public void nr_tel(TextField nr_tel){
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(nr_tel);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
            nr_tel.setVisible(true);
            nr_tel.setLayoutX(504);
            nr_tel.setLayoutY(87);
        fadeTransition.play();

    }

    public void ButtonShow2(Button buttonback){
        FadeTransition fadeTransition = new FadeTransition();
        fadeTransition.setDuration(Duration.millis(3000));
        fadeTransition.setNode(buttonback);
        fadeTransition.setFromValue(0);
        fadeTransition.setToValue(1);
            buttonback.setVisible(true);
            buttonback.setLayoutX(204);
            buttonback.setLayoutY(108);
        fadeTransition.play();
    }




       public void Tablenewposition(TableView table_info){

           FadeTransition fadeTransition = new FadeTransition();
           fadeTransition.setDuration(Duration.millis(3500));
           fadeTransition.setNode(table_info);
           fadeTransition.setFromValue(0);
           fadeTransition.setToValue(1);
           table_info.setMaxHeight(350);
           table_info.setLayoutY(20);
           table_info.setLayoutX(20);
           table_info.setDisable(true);
           fadeTransition.play();
       }

        public void Tableinback(TableView table_info, TextField surname_text, TextField name_text, TextField nr_tel, TextField pes_text, TextField number_text, Button button1test, Button buttonback) {
            FadeTransition fadeTransition = new FadeTransition();
            fadeTransition.setDuration(Duration.millis(2500));
            fadeTransition.setNode(table_info);
            fadeTransition.setFromValue(0);
            fadeTransition.setToValue(1);
                table_info.setMaxWidth(631);

                table_info.setMaxHeight(672);
                table_info.setDisable(false);
                surname_text.setVisible(false);
                name_text.setVisible(false);
                nr_tel.setVisible(false);
                pes_text.setVisible(false);
                number_text.setVisible(false);
                buttonback.setVisible(false);
                button1test.setVisible(false);
            fadeTransition.play();
        }


}






