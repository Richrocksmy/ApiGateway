package com.twentythreesquared.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class GatewayController {

  @RequestMapping("/")
  public String root() {
    return "root";
  }

  @RequestMapping("/health")
  public String health() {
    return "UP";
  }

  @RequestMapping("/login")
  public String login() {
    return "login";
  }

  @RequestMapping("/protected")
  public String protectedEndpoint() {
    return "protected";
  }
}
