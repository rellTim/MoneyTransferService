package my.project.moneytransferservice.error;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@EqualsAndHashCode(callSuper = true)
@ResponseStatus(HttpStatus.BAD_REQUEST)
@Data
public class ServerTransferException extends RuntimeException {
    private Long id;

    public ServerTransferException(String msg, Long id) {
        super(msg);
        this.id = id;
    }
}
