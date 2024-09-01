package com.kauanProjects.GenArch.domain.collections;

import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class Projects {

    @Id
    private String id;
    private String projectName;
    private String fileName;
    private Date generationDate;

}
