package my.project.moneytransferservice.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(InputDataException.class)
    public ResponseEntity<String> inputDataException(InputDataException msg) {
        log.error("InputDataException: {}", msg.getMessage());
        return new ResponseEntity<>(msg.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(ServerTransferException.class)
    public ResponseEntity<String> serverTransferException(ServerTransferException msg){
        log.error("ServerTransferException: {}", msg.getMessage());
        return new ResponseEntity<>(msg.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
