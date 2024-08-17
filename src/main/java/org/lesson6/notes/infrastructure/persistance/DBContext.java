package org.lesson6.notes.infrastructure.persistance;

public abstract class DBContext {

    protected Database database;

    public DBContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges() {
        //TODO: Сохраниение изменений в БД
        return true;
    }

}

class ModelBuilder {
    public ModelBuilder applyConfiguration(ModelConfiguration configuration) {
        //TODO: добавление конфигурации мапинга оъекта некоторого типа к
        // структуре таблицы БД
        return this;
    }
}
