package ucf.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListMakerEditorTest {

    @Test
    void editListRemoveList() {
        // reads the file
        // deletes selected list along with other items inside list
        // writes to file
        // reads the file to make sure deleted list does not exist
        // closes file
    }
    @Test
    void editListChangeListTitle() {
        // reads the file
        // deletes list title
        // adds new title to file
        // populates file with new list title
        // reads file to make sure the new name matches
        // close file
    }
    @Test
    void editListRemoveItem() {
        // opens the file
        // reads the list and items
        // deletes an item from the chosen list
        // make changes to file
        // reads the list and makes sure item was removed
        // close file
    }
    @Test
    void editListChangeItem() {
        // reads the file
        // deletes the selected item
        // populates file with new item
        // reads the file to make sure new item exists
        // close file
    }
    @Test
    void editListaddItem() {
        // reads the file
        // adds a new item to the list and populates file
        // reads file to makes sure new item was added
        // close the file
    }
    @Test
    void editListChangeDescription() {
        // opens the file
        // reads the file to the description to change
        // deletes old description for new description
        // populates file with new description
        // read file to see if new description matches
        // close file
    }
    @Test
    void editListChangeDueDate() {
        // opens the file
        // deletes the selected due date
        // populates file with new due date
        // reads file to make sure new due date exists
        // close file
    }
    @Test
    void listDisplaysAllItemsTest() {
        // opens the file
        // reads all items of a list
        // writes those items to a file
        // reads the file to see if the items match
        // closes both files
    }
    @Test
    void sortListCompletedItems() {
        // opens the file
        // reads to the list
        // scans the file for the objects marked as completed
        // displays items
        // checks to see if proper items are displayed
        // close file
    }
    @Test
    void sortListIncompletedItems() {
        // opens the file
        // deletes the selected due date
        // populates file with new due date
        // reads file to make sure new due date exists
        // close file
    }

    @Test
    void returnToListMaker() {
        // make sure this button closes current menu and returns to initial window
    }
}