package my.project.moneytransferservice.error;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class InputDataException extends RuntimeException {
    public InputDataException(String msg) {
        super(msg);
    }
}
