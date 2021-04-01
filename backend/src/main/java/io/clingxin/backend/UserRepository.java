/*
 * @Author: clingxin
 * @Date: 2021-04-01 13:00:21
 * @LastEditTime: 2021-04-01 13:03:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /springboot_youtube_mahesh/backend/src/main/java/io/clingxin/backend/UserRepository.java
 */

package io.clingxin.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
}

