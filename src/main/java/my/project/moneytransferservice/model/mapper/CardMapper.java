package my.project.moneytransferservice.model.mapper;

import my.project.moneytransferservice.model.dto.CardDto;
import my.project.moneytransferservice.model.entity.CardEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {
    CardDto map(CardEntity cardEntity);

    @InheritInverseConfiguration
    CardEntity map(CardDto cardDto);
}
