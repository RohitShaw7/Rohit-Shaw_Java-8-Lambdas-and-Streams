package com.epam.Java8_EPAM;

public List<String> search(List<String> list) {
    return list.stream()
  .filter(s -> s.startsWith("a"))
  .filter(s -> s.length() == 3)
  .collect(Collectors.toList());
}
