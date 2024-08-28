package com.allclear.tastytrack.domain.restraunt.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result { // JSON 응답 데이터를 파싱할 클래스 3

    @JsonProperty("CODE")
    private String code;

    @JsonProperty("MESSAGE")
    private String message;

}