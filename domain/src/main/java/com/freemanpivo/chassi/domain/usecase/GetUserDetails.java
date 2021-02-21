package com.freemanpivo.chassi.domain.usecase;

import com.freemanpivo.chassi.domain.model.User;
import com.freemanpivo.chassi.domain.port.GetModelPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class GetUserDetails implements GetModelPort<User> {
    @Override
    public User getDetails(String id) {
        return new User();
    }

    @Override
    public List<User> getAll() {
        return List.of(new User(1L, "Name", "2"));
    }
}
