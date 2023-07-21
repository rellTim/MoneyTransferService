package my.project.moneytransferservice.error;

public class ServerTransferException extends RuntimeException {
    public ServerTransferException(String msg) {
        super(msg);
    }
}
