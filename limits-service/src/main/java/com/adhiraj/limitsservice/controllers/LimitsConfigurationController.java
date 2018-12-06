package com.adhiraj.limitsservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adhiraj.limitsservice.LimitsConfiguration;
import com.adhiraj.limitsservice.model.Limits;

@RestController
public class LimitsConfigurationController {

  private LimitsConfiguration configuration;

  @Autowired
  public LimitsConfigurationController(LimitsConfiguration configuration) {
    super();
    this.configuration = configuration;
  }

  @GetMapping("/limits")
  public Limits retrieveLimitsFromConfiguration() {
    return new Limits(configuration.getMaximum(), configuration.getMinimum());
  }

}
