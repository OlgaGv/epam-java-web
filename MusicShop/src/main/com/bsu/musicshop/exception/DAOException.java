package main.com.bsu.musicshop.exception;

public class DAOException  extends Exception{

    public DAOException() {
        super();
    }

    public DAOException(String s) {
        super(s);
    }

    public DAOException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public DAOException(Throwable throwable) {
        super(throwable);
    }
}
