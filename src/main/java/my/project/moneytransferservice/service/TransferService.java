package my.project.moneytransferservice.service;

import lombok.RequiredArgsConstructor;
import my.project.moneytransferservice.model.dto.CardDto;
import my.project.moneytransferservice.model.entity.CardEntity;
import my.project.moneytransferservice.model.mapper.CardMapper;
import my.project.moneytransferservice.repository.TransferRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TransferService {
    private final TransferRepository transferRepository;
    private CardMapper cardMapper;

    public CardEntity addTransfer(CardDto cardDto) {
        return transferRepository.save(cardMapper.map(cardDto));
    }
}
