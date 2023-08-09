package my.project.moneytransferservice.model.mapper;

import my.project.moneytransferservice.model.dto.Amount;
import my.project.moneytransferservice.model.dto.CardDto;
import my.project.moneytransferservice.model.entity.CardEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CardMapper {
    CardDto map(CardEntity cardEntity);

    @InheritInverseConfiguration
    @Mapping(target = "Amount", ignore = true)
    CardEntity map(CardDto cardDto);
}
