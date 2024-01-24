package brunokazadi.redditclone.repository;

import brunokazadi.redditclone.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

}