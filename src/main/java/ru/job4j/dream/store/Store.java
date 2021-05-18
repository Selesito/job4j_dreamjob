package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

import java.sql.SQLException;
import java.util.Collection;

public interface Store {
    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    void save(Post post);

    Post findByIdPost(int id) throws SQLException;

    void save(Candidate candidate);

    Candidate findByIdCandidate(int id) throws SQLException;

    void delete(int id);
}