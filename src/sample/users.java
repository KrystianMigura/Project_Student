package sample;

import javafx.scene.control.Button;

public class users extends Controller{
    String id;
    String FirstName;
    String surname;
    String pes;
    String nr_tel;
    Button editButton;

    //public users(){};

    public users(String id, String FirstName, String surname, String pes, String nr_tel, Button editButton) {
        this.id = id;
        this.FirstName = FirstName;
        this.surname = surname;
        this.pes = pes;
        this.nr_tel = nr_tel;
        this.editButton = editButton;
    }
    public users(){}



    public String getId() {
        return id;
    }

    public void setId(String id) {this.id = id;}

    public String getFirstName() { return FirstName;}

    public void setFirstName(String FirstName) { this.FirstName = FirstName;}

    public String getPes() {return pes;}

    public void setPes(String pes) {this.pes = pes;}

    public Button getEdit() {return editButton;}

    public void setEdit(Button edit) {this.editButton = edit;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getNr_tel() {return nr_tel;}

    public void setNr_tel(String nr_tel) {this.nr_tel = nr_tel;}

}
