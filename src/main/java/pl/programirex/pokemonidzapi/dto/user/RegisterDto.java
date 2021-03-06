package pl.programirex.pokemonidzapi.dto.user;

import lombok.Data;
import pl.programirex.pokemonidzapi.validators.email.ValidEmail;
import pl.programirex.pokemonidzapi.validators.password.PasswordMatches;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@PasswordMatches
public class RegisterDto {

    @NotNull
    @NotEmpty
    private String login;

    @NotNull
    @NotEmpty
    private String firstName;

    @NotNull
    @NotEmpty
    private String lastName;

    @NotNull
    @NotEmpty
    private String password;
    private String matchingPassword;

    @NotNull
    @NotEmpty
    @ValidEmail
    private String email;
}

