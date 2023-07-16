package com.akash.joblisting.repository;

import com.akash.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);

}
