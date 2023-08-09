package my.project.moneytransferservice.service;

import lombok.RequiredArgsConstructor;
import my.project.moneytransferservice.error.InputDataException;
import my.project.moneytransferservice.error.ServerTransferException;
import my.project.moneytransferservice.model.dto.CardDto;
import my.project.moneytransferservice.model.entity.CardEntity;
import my.project.moneytransferservice.model.mapper.CardMapper;
import my.project.moneytransferservice.repository.TransferRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class TransferService {
    private final TransferRepository transferRepository;
    private CardMapper cardMapper;

    public CardEntity saveTransfer(CardDto cardDto) {
        Long id = (cardMapper.map(cardDto).getId());
        String operationId = UUID.randomUUID().toString();
        try {
            CardEntity cardEntity = cardMapper.map(cardDto.toBuilder()
                    .operationId(operationId)
                    .cardFromNumber(cardDto.getCardFromNumber())
                    .cardToNumber(cardDto.getCardToNumber())
                    .cardCvv(cardDto.getCardCvv())
                    .cardFromValidTill(cardDto.getCardFromValidTill())
                    .value(cardDto.getAmount().getValue())
                    .commissionTranslate(cardDto.getCommissionTranslate())
                    .currency(cardDto.getAmount().getCurrency())
                    .timeTranslate(cardDto.getTimeTranslate())
                    .isTranslation(cardDto.isTranslation())
                    .build());
            transferRepository.save(cardEntity);
            return cardEntity;
        } catch (InputDataException exception) {
            throw new InputDataException("error", id);
        } catch (ServerTransferException exception) {
            throw new ServerTransferException("error", id);
        }
    }

    public void removeTransfer(CardDto cardDto) {
        transferRepository.delete(cardMapper.map(cardDto));
    }
}
