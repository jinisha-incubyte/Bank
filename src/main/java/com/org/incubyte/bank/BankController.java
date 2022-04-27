package com.org.incubyte.bank;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import java.util.Optional;

@Controller("/bank")
public class BankController {
  @Inject BankService bankService;

  @Get(uri = "/", produces = "text/html")
  public String bank() {
    return "<b>Example Response</b>";
  }

  @Get(uri = "/{id}")
  public Optional<Branch> getBranchById(String id) {
    return bankService.getById(id);
  }

  @Post
  public Branch save(@Body Branch branch) {
    return bankService.save(branch);
  }
}
