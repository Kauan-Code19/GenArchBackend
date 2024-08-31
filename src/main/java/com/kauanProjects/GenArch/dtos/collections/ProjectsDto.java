package com.kauanProjects.GenArch.dtos.collections;

import lombok.Getter;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@Getter
public class ProjectsDto {

    private String id;
    private String projectName;
    private String fileName;
    private Date generationDate;

}
