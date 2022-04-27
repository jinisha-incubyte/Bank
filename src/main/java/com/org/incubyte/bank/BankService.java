package com.org.incubyte.bank;

import com.org.incubyte.response.ResponseWrapper;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.Optional;

@Singleton
public class BankService {
  @Inject
  BranchRepository branchRepository;

  public String welcome() {
    return "Hello welcome to bank";
  }
  public Branch save(Branch branch) {
    return branchRepository.save(branch);
  }

  public Optional<Branch> getById(String id) {
    return branchRepository.findById(Long.valueOf(id));
  }

/*  public ResponseWrapper getById(Long id) {
    Optional<Branch> branchMaybe = branchRepository.findById(id);
    if (branchMaybe.isPresent()) {
      return null;
    }
    }*/

}
