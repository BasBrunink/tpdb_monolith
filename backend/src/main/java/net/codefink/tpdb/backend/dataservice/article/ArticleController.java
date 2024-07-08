package net.codefink.tpdb.backend.dataservice.article;

import net.codefink.tpdb.backend.model.Article;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController("/api/article")
public class ArticleController {

  private final ArticleService articleService;

  public ArticleController(ArticleService articleService) {
    this.articleService = articleService;
  }


  //Create a new article
  public Optional<Article> createArticle(Article article) {
    return articleService.createArticle(article);
  }

  //Read an article

  // Read by ID
  // Read all

  //Update an article

  //Delete an article
}
