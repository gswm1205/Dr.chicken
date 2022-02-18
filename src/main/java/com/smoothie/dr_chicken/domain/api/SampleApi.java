package com.smoothie.dr_chicken.domain.api;


import io.swagger.annotations.ApiModelProperty;

public class SampleApi {

    @ApiModelProperty(example = "1")
    private Long id;

    @ApiModelProperty(example = "안녕하세요")
    private String title;

    @ApiModelProperty(example = "테스트입니다")
    private String contents;
}
