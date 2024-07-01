package net.codefink.tpdb.backend;

import net.codefink.tpdb.backend.dataservice.article.ArticleRepository;
import net.codefink.tpdb.backend.dataservice.park.ParkRepository;
import net.codefink.tpdb.backend.dataservice.resort.ResortRepository;
import net.codefink.tpdb.backend.model.Article;
import net.codefink.tpdb.backend.model.Park;
import net.codefink.tpdb.backend.model.Resort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

  public BackendApplication(ParkRepository parkRepository, ArticleRepository articleRepository, ResortRepository resortRepository) {
    this.parkRepository = parkRepository;
    this.articleRepository = articleRepository;
    this.resortRepository = resortRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(BackendApplication.class, args);
  }

  private final ParkRepository parkRepository;
  private final ArticleRepository articleRepository;
  private final ResortRepository resortRepository;

  @Override
  public void run(String... args) throws Exception {
    Park park = Park.builder()
        .name("Europa Park")
        .build();
    Park saveParks = parkRepository.save(park);
    Resort resort = Resort.builder()
        .name("Europa Resort")
        .build();
    Resort saveResort = resortRepository.save(resort);
    Article article = Article.builder()
        .title("First Article on Europa Park")
        .build();
    article.setSubject(saveParks);
    articleRepository.save(article);

    article = Article.builder()
        .title("Article on Europa Resort")
        .build();
    article.setSubject(resort);
    articleRepository.save(article);

  }
}
