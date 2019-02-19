package service;

import java.util.List;

import domain.CategoryDTO;

public class CategoryServiceImpl implements CategoryService{
	private static CategoryServiceImpl instance = new CategoryServiceImpl();
	private CategoryServiceImpl() {}
	public static CategoryServiceImpl getInstance() {return instance;}
	

	@Override
	public void registCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CategoryDTO> bringAllCategoriesList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CategoryDTO> retrieveCategories(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryDTO retrieveCategory(String searchWord) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countCategory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existsCategory(String searchWord) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void modifyCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCategory(CategoryDTO cat) {
		// TODO Auto-generated method stub
		
	}


}
