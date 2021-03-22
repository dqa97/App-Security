package com.codegym.security.service;

import com.codegym.security.model.AppUser;

public interface IAppUserService {

    AppUser getUserByName(String name);
}
