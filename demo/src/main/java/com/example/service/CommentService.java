package com.example.service;

import com.example.entity.Comment;
import com.example.payload.CommentDto;

import java.util.List;

public interface CommentService {
   CommentDto createComment(long postId, CommentDto commentDto);
    List<CommentDto> getCommentsByPostId(long postId);
     CommentDto getCommentById(long postId,long commentId);

    CommentDto updateComment(long postId, long id, CommentDto commentDto);

    void deleteComment(long postId, long id);
}
