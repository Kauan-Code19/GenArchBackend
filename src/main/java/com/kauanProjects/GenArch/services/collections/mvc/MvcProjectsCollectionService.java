package com.kauanProjects.GenArch.services.collections.mvc;

import com.kauanProjects.GenArch.domain.collections.mvc.MvcProjectsCollection;
import com.kauanProjects.GenArch.domain.collections.mvc.OptionsMvc;
import com.kauanProjects.GenArch.dtos.collections.mvc.MvcProjectsCollectionDto;
import com.kauanProjects.GenArch.repositories.collections.mvc.MvcProjectsCollectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MvcProjectsCollectionService {

    private final MvcProjectsCollectionRepository mvcProjectsCollectionRepository;

    @Autowired
    public MvcProjectsCollectionService(MvcProjectsCollectionRepository mvcProjectsCollectionRepository) {
        this.mvcProjectsCollectionRepository = mvcProjectsCollectionRepository;
    }

    /**
     * Registers a new MVC project.
     *
     * @param mvcProjectsCollectionDto the DTO containing the project's information
     */
    public void registerMvcProject(MvcProjectsCollectionDto mvcProjectsCollectionDto) {
        // Create an instance of MvcProjectsCollection from the provided DTO
        MvcProjectsCollection mvcProjectsCollection = createMvcProjectsCollection(mvcProjectsCollectionDto);

        // Save the MvcProjectsCollection instance to the repository
        mvcProjectsCollectionRepository.save(mvcProjectsCollection);
    }

    /**
     * Creates and configures an MvcProjectsCollection from the provided DTO.
     *
     * @param mvcProjectsCollectionDto the DTO containing the project's information
     * @return a configured MvcProjectsCollection instance
     */
    private MvcProjectsCollection createMvcProjectsCollection(MvcProjectsCollectionDto mvcProjectsCollectionDto) {
        MvcProjectsCollection mvcProjectsCollection = new MvcProjectsCollection();

        // Set project details from the DTO
        mvcProjectsCollection.setProjectName(mvcProjectsCollectionDto.getProjectName());
        mvcProjectsCollection.setFileName(mvcProjectsCollectionDto.getFileName());
        mvcProjectsCollection.setGenerationDate(mvcProjectsCollectionDto.getGenerationDate());

        // Create and set options for the project
        mvcProjectsCollection.setOptions(createOptions(mvcProjectsCollectionDto));

        return mvcProjectsCollection;
    }

    /**
     * Creates and configures OptionsMvc from the provided DTO.
     *
     * @param mvcProjectsCollectionDto the DTO containing the project's options information
     * @return a configured OptionsMvc instance
     */
    private OptionsMvc createOptions(MvcProjectsCollectionDto mvcProjectsCollectionDto) {
        OptionsMvc options = new OptionsMvc();

        // Set options details from the DTO
        options.setArchitecture(mvcProjectsCollectionDto.getOptions().getArchitecture());
        options.setControllerCount(mvcProjectsCollectionDto.getOptions().getControllerCount());
        options.setServiceCount(mvcProjectsCollectionDto.getOptions().getServiceCount());
        options.setDtoCount(mvcProjectsCollectionDto.getOptions().getDtoCount());
        options.setRepositoryCount(mvcProjectsCollectionDto.getOptions().getRepositoryCount());
        options.setDomainCount(mvcProjectsCollectionDto.getOptions().getDomainCount());
        options.setConfigCount(mvcProjectsCollectionDto.getOptions().getConfigCount());
        options.setExceptionCount(mvcProjectsCollectionDto.getOptions().getExceptionCount());
        options.setAnnotations(mvcProjectsCollectionDto.getOptions().getAnnotations());

        return options;
    }

}
