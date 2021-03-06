package com.example.exercisexmlprocessing.models.dtos.categoriesByProductsCount;

import com.example.exercisexmlprocessing.models.dtos.categoriesByProductsCount.CategoryProductsCountDto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "categories")
@XmlAccessorType(XmlAccessType.FIELD)
public class CategoryProductsCountRootDto {

    @XmlElement(name = "category")
    private List<CategoryProductsCountDto> categories;

    public List<CategoryProductsCountDto> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryProductsCountDto> categories) {
        this.categories = categories;
    }
}
