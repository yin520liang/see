/**
 * 
 */
package yang.see.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @title
 * @description
 *              <p>
 *              CREATE TABLE `see_news` ( `id` int(11) unsigned NOT NULL
 *              AUTO_INCREMENT, `url` varchar(256) NOT NULL COMMENT '新闻url',
 *              `hashed_url` varchar(64) NOT NULL COMMENT '哈希处理后的url', `title`
 *              varchar(256) NOT NULL COMMENT '新闻标题', `file_path` varchar(256)
 *              NOT NULL COMMENT '文件路径', `img_dir_path` varchar(256) NOT NULL
 *              DEFAULT '' COMMENT '图片路径：每个新闻图片对应一个文件夹，若没有图片则此列为空', `site_id`
 *              int(11) NOT NULL COMMENT '所属site id', `up_date` date NOT NULL
 *              COMMENT '新闻日期，用于分区', `up_time` time NOT NULL COMMENT '具体时间',
 *              PRIMARY KEY (`id`) ) ENGINE=InnoDB DEFAULT CHARSET=utf8
 *              COMMENT='新闻表'
 * @author lvzhaoyang
 * @date 2017年11月2日下午4:36:09
 */
@Entity(name = "news")
@Table(name = "see_news")
public class News {
	private Long id;
	private String url;
	private String hashedUrl;
	private String title;
	private String filePath;
	private String imgDirPath;
	private Long siteId;
	private LocalDate upDate;
	private LocalTime upTime;
	
}
