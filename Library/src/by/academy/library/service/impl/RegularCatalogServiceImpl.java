package by.academy.library.service.impl;

import java.util.Date;
import java.util.List;

import by.academy.library.dao.LibraryDao;
import by.academy.library.dao.collection.LibraryDaoCollectionImple;
import by.academy.library.ds.Library;
import by.academy.library.entity.Author;
import by.academy.library.entity.Book;
import by.academy.library.service.CatalogService;

public class RegularCatalogServiceImpl implements CatalogService {
	private LibraryDao libraryDao;

	public RegularCatalogServiceImpl(Library library) {
		this.libraryDao = new LibraryDaoCollectionImple(library);
	}

	@Override
	public List<Book> listBooks() {
		List<Book> books = libraryDao.getBooks();
		return books;
	}

	@Override
	public List<Author> listAuthors() {
		List<Author> authors = libraryDao.getAuthors();
		return authors;
	}

	@Override
	public void addBook(String author, String title) {
		libraryDao.addBook(author, title);

	}

}
