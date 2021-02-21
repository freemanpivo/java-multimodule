package com.freemanpivo.chassi.h2.operations;

import com.freemanpivo.chassi.domain.model.User;
import com.freemanpivo.chassi.domain.port.RetrieveUserStored;
import com.freemanpivo.chassi.h2.entity.UserEntity;
import com.freemanpivo.chassi.h2.mapper.UserEntityMapper;
import com.freemanpivo.chassi.h2.repository.UserEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserInH2Operations implements RetrieveUserStored {

    private UserEntityRepository repository;
    private UserEntityMapper mapper;

    @Override
    public Optional<User> getById(Long id) {
       final var isUser = repository.findById(id);
       return isUser.map(mapper::toModel);
    }

    @Override
    public List<User> getAll() {
        List<UserEntity> users = repository.findAll();
        return users.stream().map(mapper::toModel).collect(Collectors.toList());
    }
}
