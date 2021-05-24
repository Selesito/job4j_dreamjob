package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.City;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

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

    void addUser(User user);

    User searchEmail(String email);

    Collection<City> findAllCities();

    City findByIdCity(int id) throws SQLException;

}