package com.myblog.myblog14.repository;

import com.myblog.myblog14.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comment,Long> {

}
