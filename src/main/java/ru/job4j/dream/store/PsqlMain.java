package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.City;
import ru.job4j.dream.model.Post;

import java.sql.SQLException;

public class PsqlMain {
    public static void main(String[] args) throws SQLException {
        Store store = PsqlStore.instOf();
        store.save(new Post(0, "Java Job"));
        store.save(new Post(0, "C Job"));
        store.save(new Post(0, "C++ Job"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println();
        store.save(new Candidate(0, "Junior Java", new City(1, "null")));
        store.save(new Candidate(0, "Middle Java", new City(2, "null")));
        store.save(new Candidate(0, "Senior Java", new City(3, "null")));
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
        System.out.println();
        store.save(new Post(2, "C Job изменено"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println();
        for (Candidate candidate : store.findAllCandidates()) {
            System.out.println(candidate.getId() + " " + candidate.getName());
        }
        System.out.println();
        System.out.println(store.findByIdPost(2).getName());
        System.out.println(store.findByIdCandidate(1).getName());
    }
}