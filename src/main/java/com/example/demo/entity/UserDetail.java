package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "user_detail")
public class UserDetail {
    @Id
    private String id;
    private String fullName;
    private String lastName;
    @NotBlank(message = "Email must be provided.")
    @Column(unique = true)
    private String email;
    private String city;
    private String postalCode;
    private String country;
    private String imagePath;

    @NotNull(message = "isWebTourStatus is missing.")
    private Boolean isWebTourStatus;

    @NotBlank(message = "Password must be provided.")
    private String password;

    @Column(name = "available_credits", nullable = false)
    private Long availableCredits;

    @NotNull(message = "isEmailVerification is missing.")
    private Boolean isEmailVerification;

    @NotNull(message = "isGoogleSignIn is missing.")
    private Boolean isGoogleSignIn;

    @Column(name = "is_admin", nullable = false, columnDefinition = "boolean default false")
    private Boolean isAdmin;
}
