package com.freemanpivo.chassi.domain.port;

import java.util.List;

public interface GetModelPort<T> {
  T getDetails(String id);
  List<T> getAll();
}
