package com.wlstjd.searchblog.service.search.openapi.kakao.dto;

import java.util.List;

public record OpenApiResponse(Meta meta, List<Document> documents) {
}
