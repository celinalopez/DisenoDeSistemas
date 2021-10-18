package ejercicioDIP1;


public class DataBasehandler {

    private Database database;

    public DataBasehandler(Database database){
        this.database = database;
    }

    public void connect(){
        this.database.connect();
    }
    public void disconnect(){
        this.database.disconnect();
    }

}
