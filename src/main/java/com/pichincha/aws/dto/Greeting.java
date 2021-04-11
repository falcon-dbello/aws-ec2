package com.pichincha.aws.dto;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Greeting {

  private static final String template = "Hello, I'm %s!";
  private final long id;
  private final String content;

  public Greeting(long id) {
    this.id = id;
    this.content = String.format(template, getComputerName());
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  private String getComputerName() {
    try {
      InetAddress addr;
      addr = InetAddress.getLocalHost();
      return addr.getHostName();
    } catch (UnknownHostException ex) {
      return "Hostname can not be resolved";
    }

  }
}
