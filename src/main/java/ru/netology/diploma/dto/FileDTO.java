package ru.netology.diploma.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FileDTO {
    private String filename;
    private long size;
}
