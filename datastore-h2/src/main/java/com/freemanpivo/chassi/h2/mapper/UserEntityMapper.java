package com.freemanpivo.chassi.h2.mapper;

import com.freemanpivo.chassi.domain.model.User;
import com.freemanpivo.chassi.h2.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserEntityMapper {
    @Mapping(target = "ageInYears", expression = "java(ChronoUnit.YEARS.between(entity.birthDate, LocalDate.now())")
    User toModel(UserEntity entity);
}
