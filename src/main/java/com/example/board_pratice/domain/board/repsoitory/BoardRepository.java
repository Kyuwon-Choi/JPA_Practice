package com.example.board_pratice.domain.board.repsoitory;

import com.example.board_pratice.domain.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>{
    Page<Board> findByDeletedFalse(Pageable pageable);
}
