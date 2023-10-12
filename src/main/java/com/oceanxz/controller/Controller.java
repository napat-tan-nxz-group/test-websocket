package com.oceanxz.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class Controller {

  @GetMapping("/api/logs")
  public String getLogs() {
    log.trace("This is trace");
    log.debug("This is debug");
    log.info("This is info");
    log.error("This is error");
    log.warn("This is warn");
    return "Success";
  }
}
