package com.rs.springframework.demomapstruct.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {

    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(source = "id", target = "id")
    CategoryDTO categoryToCategoryDTO(Category category);

    @Mapping(source = "s", target = "name")
    CategoryDTO testInptString(String s);

    @Mapping(source = "s1", target = "id")
    @Mapping(source = "s2", target = "name")
    CategoryDTO testInptString(Long s1, String s2);
}