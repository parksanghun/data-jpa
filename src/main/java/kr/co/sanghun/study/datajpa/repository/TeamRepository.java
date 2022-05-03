package kr.co.sanghun.study.datajpa.repository;

import kr.co.sanghun.study.datajpa.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
