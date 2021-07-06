package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 List Maker Application
 *  Copyright 2021 Ivedent Lloyd III
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ListMakerController {

    @FXML
    public void createNewListClicked(ActionEvent actionEvent) {
        // opens a new window displaying the options for creating a new list
        // all options will be displayed by buttons in the gui
        // new window prompts user for new list title
        // after the title the user will be prompt for an item in the new list
        // after the item is named the user will have the option to write a description of the item
        // after the item has been described the user will issue a due date in the form YYYY-MM-DD
        // the user will be prompted to continue adding items to the list or to stop
        // the above process will be looped until loop is broken
    }

    @FXML
    public void editListClicked(ActionEvent actionEvent) {
        // opens a new window allowing the user to edit the existing lists
        // all options will be displayed by buttons in the gui
        // the user will have the option to remove a list
        // the user will have the option to edit a list
    }

    @FXML
    public void autoGenerateListClicked(ActionEvent actionEvent) {
        // demo button
        // clicking this button will populate the with data from a text file for the TA
        // the file will be read and fill the file with appropriate lists and items
    }
}
