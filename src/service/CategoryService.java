package service;

import java.util.List;

import domain.CategoryDTO;

public interface CategoryService {
	public void registCategory(CategoryDTO cat);
	
	public List<CategoryDTO> bringAllCategoriesList();
	public List<CategoryDTO> retrieveCategories(String searchWord);
	public CategoryDTO retrieveCategory(String searchWord);
	public int countCategory();
	public boolean existsCategory(String searchWord);
	
	public void modifyCategory(CategoryDTO cat);
	public void removeCategory(CategoryDTO cat);
}
