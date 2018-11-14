package sample;

import javafx.scene.control.Button;

public class users extends Controller{
    String id;
    String name;
    String surname;
    String pes;
    String nr_tel;
    Button editButton;

    public Button getEdit() {
        return editButton;
    }

    public void setEdit(Button edit) {
        this.editButton = edit;

    }




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pes;
    }

    public void setPesel(String pes) {
        this.pes = pes;
    }

    public String getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }

    public users(String id, String name, String surname, String pes, String nr_tel, Button editButton) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.pes = pes;
        this.nr_tel = nr_tel;
        this.editButton = new Button("Edycja");
    }
public users(){};


}
