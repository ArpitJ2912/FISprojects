package com.example.commentsservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.commentsservice.model.Comments;
import com.example.commentsservice.repo.CommentsDao;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	CommentsDao dao;

	@Override
	public List<Comments> getAllComments() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Comments insertComment(Comments comment) {
		// TODO Auto-generated method stub
		return dao.save(comment);
	}

	@Override
	public String deleteComment(Comments comment) {
		// TODO Auto-generated method stub
		dao.delete(comment);
		return "Comment deleted";
	}

	@Override
	public Optional<Comments> findByCommentId(int cid) {
		// TODO Auto-generated method stub
		return dao.findById(cid);
	}

	@Override
	public List<Comments> findCommentsByPostId(int pid) {
		// TODO Auto-generated method stub
		return dao.findCommentsByPid(pid);
	}

	
}
