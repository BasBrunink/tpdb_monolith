package net.codefink.tpdb.backend.dataservice.article;
import net.codefink.tpdb.backend.model.Article;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.Optional;


@Service
public class ArticleService {

  private final ArticleRepository articleRepository;

  public ArticleService(ArticleRepository articleRepository) {
    this.articleRepository = articleRepository;
  }


  //Create a new article

  public Optional<Article> createArticle(Article article) {
    return Optional.of(articleRepository.save(article));
  }
  //Read an article
  // Read by ID
  public Optional<Article> getArticle(UUID id) {
    return articleRepository.findById(id);
  }
  // Read all
  public Iterable<Article> getArticles() {
    return articleRepository.findAll();
  }

  //Update an article
  public Optional<Article> updateArticle(UUID id, Article article) {
    Optional<Article> articleOptional = articleRepository.findById(id);
    if (articleOptional.isPresent()) {
      Article articleToUpdate = articleOptional.get();
      //set the article attributes
      return Optional.of(articleRepository.save(articleToUpdate));
    }
    return Optional.empty();
  }

  //Delete an article
  public void deleteArticle(UUID id) {
    articleRepository.deleteById(id);
  }
}
