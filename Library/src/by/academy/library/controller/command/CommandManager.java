package by.academy.library.controller.command;

import by.academy.library.controller.command.impl.AddNewBook;
import by.academy.library.controller.command.impl.DefaultCommand;
import by.academy.library.controller.command.impl.FindBookByTitle;
import by.academy.library.controller.command.impl.ViewAuthorCatalogCommand;
import by.academy.library.controller.command.impl.ViewBookCatalogCommand;

public class CommandManager {
	private static BasicCommand command = new DefaultCommand();

	public static BasicCommand defineCommand(String action) {
		switch (action) {
		case "view_books":
			command = new ViewBookCatalogCommand();
			break;
		case "view_authors":
			command = new ViewAuthorCatalogCommand();
			break;
		case "find_book":
			command = new FindBookByTitle();
			break;
		case "add_new_book":
			command = new AddNewBook();
			break;
		}
		return command;
	}

}
