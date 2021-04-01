/*
 * @Author: clingxin
 * @Date: 2021-04-01 12:55:54
 * @LastEditTime: 2021-04-01 13:52:35
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /springboot_youtube_mahesh/backend/src/main/java/io/clingxin/backend/User.java
 */
package io.clingxin.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String Name;
    private String Email;
    private String Password;
}
