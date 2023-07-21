package my.project.moneytransferservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.project.moneytransferservice.model.dto.CardDto;
import my.project.moneytransferservice.model.entity.CardEntity;
import my.project.moneytransferservice.service.TransferService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class TransferController {
    private final TransferService transferService;

    @PostMapping("/transfer")
    @CrossOrigin(origins = "*")
    public ResponseEntity<CardDto> transferMoney(@RequestBody CardDto cardDto) {
        return new ResponseEntity<>();
    }

    @PostMapping("/confirmOperation")
    @CrossOrigin(origins = "*")
    public CardEntity confirmOperationMoney(CardEntity cardEntity) {
        return null;
    }
}
