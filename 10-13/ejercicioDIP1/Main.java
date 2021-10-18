package ejercicioDIP1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // creating a new instance. 
        DataBasehandler dataBasehandler = new DataBasehandler(new MySqlDatabase());
        dataBasehandler.connect();
        dataBasehandler.disconnect();


    }
}
