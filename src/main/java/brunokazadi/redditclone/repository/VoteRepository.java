package brunokazadi.redditclone.repository;

import brunokazadi.redditclone.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote,Long> {

}