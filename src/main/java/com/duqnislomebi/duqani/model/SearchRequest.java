package com.duqnislomebi.duqani.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SearchRequest {

    private Integer page;

    private Integer limit;

    private Integer start;
}
