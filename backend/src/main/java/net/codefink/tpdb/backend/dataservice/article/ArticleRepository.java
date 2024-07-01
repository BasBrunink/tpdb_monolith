package net.codefink.tpdb.backend.dataservice.article;

import net.codefink.tpdb.backend.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ArticleRepository extends JpaRepository<Article, UUID> {
}
