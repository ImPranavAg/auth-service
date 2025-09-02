package org.example.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.example.entities.UserInfo;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo {

    private String firstName;
    private String lastName;
    private Long phoneNumber;
    private String email;
}
