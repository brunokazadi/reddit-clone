package brunokazadi.redditclone.repository;


import brunokazadi.redditclone.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}