package com.itransition.payment.auth.service;

import com.itransition.payment.auth.dto.LoginRequest;
import com.itransition.payment.auth.dto.LoginResponse;
import com.itransition.payment.auth.dto.RefreshTokenRequest;
import com.itransition.payment.auth.dto.RefreshTokenResponse;
import com.itransition.payment.auth.dto.LogoutRequest;

public interface AuthService {

    LoginResponse login(LoginRequest loginRequest);

    RefreshTokenResponse refreshToken(RefreshTokenRequest request);

    void logout(LogoutRequest logoutRequest);
}
