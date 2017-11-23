/**
 * 
 */
package yang.see.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @title
 * @description user-news
 *              <p>
 *              CREATE TABLE `see_favorite` ( `id` int(11) unsigned NOT NULL
 *              AUTO_INCREMENT, `user_id` int(11) NOT NULL, `news_id` int(11)
 *              NOT NULL, `tags` tinytext COMMENT '新闻标签，目前未用到，后续可用于相似推荐，订阅等',
 *              PRIMARY KEY (`id`), KEY `user_id` (`user_id`) ) ENGINE=InnoDB
 *              DEFAULT CHARSET=utf8 COMMENT='收藏夹'
 * @author lvzhaoyang
 * @date 2017年11月2日下午4:36:16
 */
@Entity(name = "favorite")
@Table(name = "see_favorite")
public class Favorite {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private Long userId;
	@Column
	private Long newsId;
	@Column
	private String tags;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getNewsId() {
		return newsId;
	}

	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
