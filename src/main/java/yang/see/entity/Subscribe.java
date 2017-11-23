/**
 * 
 */
package yang.see.entity;

/**
 * @title
 * @description
 *              <p>
 *              CREATE TABLE `see_site` ( `id` int(11) unsigned NOT NULL
 *              AUTO_INCREMENT, `domain_url` varchar(256) NOT NULL COMMENT
 *              '域名url', `path` varchar(256) NOT NULL DEFAULT '' COMMENT
 *              '域名后的路径', `type` int(11) unsigned NOT NULL COMMENT
 *              '网站类型：暂用枚举类型表示，具体值参见程序代码', `parent_id` int(11) NOT NULL DEFAULT
 *              '-1' COMMENT '网站的层级结构，存在父节点', PRIMARY KEY (`id`), KEY
 *              `parent_id` (`parent_id`), KEY `type` (`type`) ) ENGINE=InnoDB
 *              DEFAULT CHARSET=utf8 COMMENT='网站表'
 * @author lvzhaoyang
 * @date 2017年11月2日下午4:36:04
 */
public class Subscribe {

}
