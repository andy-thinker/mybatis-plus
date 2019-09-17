package com.thinker.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 安全检查-问题
 * </p>
 *
 * @author andy
	@email:andy_thinker@yeah.net
 * @since 2019-09-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TBaseCheckQuestion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 序号，默认最大+1
     */
    @TableField("sequ")
    private Integer sequ;

    /**
     * 问题类别
     */
    @TableField("question")
    private String question;


}
