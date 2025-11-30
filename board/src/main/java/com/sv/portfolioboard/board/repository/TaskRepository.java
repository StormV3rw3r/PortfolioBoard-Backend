package com.sv.portfolioboard.board.repository;

import com.sv.portfolioboard.board.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    // You can add custom query methods here, e.g.
    // List<Task> findByStatus(String status);
}
