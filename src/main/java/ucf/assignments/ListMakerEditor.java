package ucf.assignments;

/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import javafx.event.ActionEvent;

public class ListMakerEditor {

    public void deleteListClicked(ActionEvent actionEvent) {
        // reads the file
        // displays current lists and prompts the user to delete a certain list
        // changes the file by deleting list
        // will loop until user is finished deleting lists
        // user will break loop when finished
        // close file
    }

    public void editExistingListClicked(ActionEvent actionEvent) {
        // reads the file
        // prompts the user to select a list to edit
        // reads file to that list title
        // allows the user to edit the name of the list
        // allows the user to mark an item as completed
        // allows the user to edit the name of an item
        // allows the user to edit the description of an item
        // allows the user to add an item
        // allows the user to delete an item
        // allows the user to add a description of the new item
        // allows the user to add a due date to a new item
        // allows the user to edit the due date of an item
        // after finished will loop and prompt the user if there is more editing to do
        // allows the user to break the loop
        // closes file
    }

    public void displaySelectedList(){
        // reads file and scans to selected list
        // displays all items in that list
        // closes file
    }

    public void sortListCompletedItems(){
        // reads file and scans to selected list
        // displays the items marked as completed to the user
        // closes file
    }
    public void sortListIncompletedItems(){
        // reads file and scans to selected list
        // displays the items marked as incomplete to the user
        // closes file
    }

    public void returnToListMaker(ActionEvent actionEvent) {
        // this button closes the current window and returns to the first window
    }
}
