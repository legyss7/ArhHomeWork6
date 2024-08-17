package org.lesson6;

import org.lesson6.database.NotesDatabase;
import org.lesson6.notes.core.application.ConcreteNoteEditor;
import org.lesson6.notes.infrastructure.persistance.NotedDBContext;
import org.lesson6.notes.presentation.queries.controllers.NotesController;
import org.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {
    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(
                        new NotedDBContext(new NotesDatabase()),
                        new NotesConsolePresenter()));
        controller.routeGetAll();
    }
}
