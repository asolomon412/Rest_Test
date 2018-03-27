package com.test.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> listAllBooks() {
		return Arrays.asList(new Book(1l, "Antonella Solomon", "Jackson 5"), new Book(1l, "Torrie Solomon", "Jacks 5"));
	}

}
