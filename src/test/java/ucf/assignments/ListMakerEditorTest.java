package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListMakerEditorTest {

    @Test
    void deleteListClicked() {
        // reads the file
        // takes in the user input
        // deletes the selected lists in the file
        // reads the file making sure the deleted list does not exist
        // closes file
    }

    @Test
    void editExistingListClicked() {
        // reads the file
        // deletes string selected by the user
        // replaces the string with new string
        // writes to file
        // reads the file and makes sure new file matches input
        // closes file
    }

    @Test
    void returnToListMaker() {
        // make sure this button closes current menu and returns to initial window
    }
}