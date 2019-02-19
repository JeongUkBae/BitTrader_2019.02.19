package dao;

import java.util.List;

import domain.CategoryDTO;

public interface CategoryDAO {
	public void insertCategory(CategoryDTO cat);
	
	public List<CategoryDTO> selectAllCategoriesList();
	public List<CategoryDTO> selectCategories(String searchWord);
	public CategoryDTO selectCategory(String searchWord);
	public int countCategory();
	public boolean existsCategory(String searchWord);
	
	public void updateCategory(CategoryDTO cat);
	public void deleteCategory(CategoryDTO cat);
}
