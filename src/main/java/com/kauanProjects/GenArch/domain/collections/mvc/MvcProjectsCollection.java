package com.kauanProjects.GenArch.domain.collections.mvc;

import com.kauanProjects.GenArch.domain.collections.Projects;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Document(collection = "mvc_projects")
public class MvcProjectsCollection extends Projects {

    private OptionsMvc options;  // Contains configuration options for the project

}
