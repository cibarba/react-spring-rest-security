package com.generation.reactspringrestsecurity.service;

import com.generation.reactspringrestsecurity.db.model.PasswordResetToken;
import com.generation.reactspringrestsecurity.db.model.User;
import com.generation.reactspringrestsecurity.db.model.VerificationToken;
import com.generation.reactspringrestsecurity.web.dto.UserDto;
import com.generation.reactspringrestsecurity.web.error.UserAlreadyExistException;

import java.util.List;
import java.util.Optional;

public interface IUserService{

    User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

    void createVerificationTokenForUser(User user, String token);

    VerificationToken getVerificationToken(String VerificationToken);

    VerificationToken generateNewVerificationToken(String token);

    void createPasswordResetTokenForUser(User user, String token);

    User findUserByEmail(String email);

    PasswordResetToken getPasswordResetToken(String token);

    User getUserByPasswordResetToken(String token);

    Optional<User> getUserByID(long id);

    void changeUserPassword(User user, String password);

    boolean checkIfValidOldPassword(User user, String password);

    String validateVerificationToken(String token);

    List<String> getUsersFromSessionRegistry();
}
