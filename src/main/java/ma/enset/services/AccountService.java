package ma.enset.services;



import java.util.*;

import ma.enset.entity.AppRole;
import ma.enset.entity.AppUser;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}