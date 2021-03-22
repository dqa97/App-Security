package com.codegym.security.repo;

import com.codegym.security.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser getAppUsersByName(String name);
}
