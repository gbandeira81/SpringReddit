package com.guilherme.SpringReddit;

import com.guilherme.SpringReddit.domain.Comment;
import com.guilherme.SpringReddit.repository.CommentRepository;
import com.guilherme.SpringReddit.repository.LinkRepository;
import com.guilherme.SpringReddit.domain.Link;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringRedditApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRedditApplication.class, args);
	}



	//@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
		return args -> {
			Link link = new Link("Getting Started with Sprinb Boot 2","https://google.com");
			linkRepository.save(link);

			Comment comment = new Comment("This link is awesome!", link);
			commentRepository.save(comment);

			System.out.println(link.toString());
			System.out.println(link.getComments());

			Link firstLink = linkRepository.findByTitle("Getting Started with Sprinb Boot 2");
			System.out.println(firstLink.getTitle());


		};
	}


}
