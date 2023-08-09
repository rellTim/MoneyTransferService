package my.project.moneytransferservice.error;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@EqualsAndHashCode(callSuper = true)
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
@Data
public class InputDataException extends RuntimeException {
    private Long id;

    public InputDataException(String msg, Long id) {
        super(msg);
        this.id = id;
    }
}
