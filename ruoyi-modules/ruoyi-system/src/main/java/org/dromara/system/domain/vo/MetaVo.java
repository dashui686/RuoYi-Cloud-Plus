package org.dromara.system.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 路由显示信息
 *
 * @author ruoyi
 */

@Data
public class MetaVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /** 路由标题 */
    private String title;
    /** 路由图标 */
    private String icon;
    /** 是否不缓存 */
    private Boolean noCache;
    /** 外链地址 */
    private String link;
    /** 激活图标 */
    private String activeIcon;
    /** 激活路径（菜单高亮） */
    private String activePath;
    /** 是否固定标签页 */
    private Boolean affixTab;
    /** 固定标签页排序 */
    private Integer affixTabOrder;
    /** 徽标内容 */
    private String badge;
    /** 徽标类型（dot/normal） */
    private String badgeType;
    /** 徽标颜色 */
    private String badgeVariants;
    /** 是否隐藏子菜单 */
    private Boolean hideChildrenInMenu;
    /** 是否隐藏面包屑 */
    private Boolean hideInBreadcrumb;
    /** 是否隐藏标签栏 */
    private Boolean hideInTab;
    /** 内嵌页面地址 */
    private String iframeSrc;
    /** 最大打开标签数 */
    private Integer maxNumOfOpenTab;
    /** 是否在菜单中隐藏 */
    private Boolean hideInMenu;
    /** 菜单排序 */
    private Integer order;

    public MetaVo() {
    }
}
