package com.studygo.dao;

import java.util.List;

import com.studygo.bean.Ranking;
import com.studygo.bean.User;
import org.apache.ibatis.annotations.Param;

public interface RankingMapper {

    int insert(User user);

    int deleteByPrimaryKey(Integer userid);

    int updatePostnumByPrimaryKey(Integer userid);

    int updateFavoritenumByPrimaryKey(Integer userid);

    int updateFollownumByPrimaryKey(Integer beuserid);

    int updateLevelByPrimaryKey(@Param("level") Integer level, @Param("userid") Integer userid);

    int updateTimeByPrimaryKey(@Param("time") Double time, @Param("userid") Integer userid);

    int updateTotalByPrimaryKey(@Param("total") Double total, @Param("userid") Integer userid);

    int updateUsernameByPrimaryKey(@Param("username") String username, @Param("userid") Integer userid);

    List<Ranking> selectByRankingAll();

    Double selectByRankingTotal(int userid);
}
