package com.r.diary;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DataManagerTest {
    static DataManager dm;

    @BeforeClass
    public static void classSetup(){
        dm = DataManager.getInstance();
    }

    @Before
    public void setUp(){
        dm.getNotes().clear();
        dm.initializeExampleNotes();


    }

    @Test
    public void createNewNote() {
        final CourseInfo course = dm.getCourse("android_async");
        final String noteTitle = "Test not title";
        final String noteText = "body text of the note";

        int noteIndex = dm.createNewNote();
        NoteInfo newNote = dm.getNotes().get(noteIndex);
        newNote.setText(noteText);
        newNote.setTitle(noteTitle);
        newNote.setCourse(course);

        NoteInfo compareNote = dm.getNotes().get(noteIndex);
        assertEquals(compareNote.getText(), noteText);
        assertEquals(compareNote.getTitle(), noteTitle);
        assertEquals(compareNote.getCourse(), course);
    }
}