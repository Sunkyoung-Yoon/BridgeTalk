package com.ssafy.bridgetalkback.auth.dto.request;

import jakarta.validation.constraints.NotBlank;

public record ProfileLoginRequestDto(
        @NotBlank(message = "프로필Id는 필수입니다.")
        String profileId,
        @NotBlank(message = "비밀번호는 필수입니다.")
        String password
) {
}
