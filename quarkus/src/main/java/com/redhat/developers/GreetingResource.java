package com.redhat.developers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String hello() {
    return "Meeow!! Julia from Tekton 😺🚀";
  }
}
