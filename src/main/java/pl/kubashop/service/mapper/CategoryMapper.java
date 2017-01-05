package pl.kubashop.service.mapper;

import pl.kubashop.domain.*;
import pl.kubashop.service.dto.CategoryDTO;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Category and its DTO CategoryDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface CategoryMapper {

    CategoryDTO categoryToCategoryDTO(Category category);

    List<CategoryDTO> categoriesToCategoryDTOs(List<Category> categories);

    @Mapping(target = "names", ignore = true)
    Category categoryDTOToCategory(CategoryDTO categoryDTO);

    List<Category> categoryDTOsToCategories(List<CategoryDTO> categoryDTOs);
}
