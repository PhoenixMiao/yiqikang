package com.phoenix.yiqikang.dto;

import com.phoenix.yiqikang.common.CommonErrorCode;
import com.phoenix.yiqikang.entity.User;
import com.phoenix.yiqikang.util.AssertUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * session缓存实体
 * @author yan on 2020-02-27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("SessionData 会话实体")
public class SessionData implements Serializable {

    /**
     * {@link User}
     */
    @ApiModelProperty("用户id")
    private Long id;
    @ApiModelProperty("注册时间")
    private String createTime;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("联系方式")
    private String telephone;
    @ApiModelProperty("电子邮箱")
    private String email;
    @ApiModelProperty("头像")
    private String portrait;

    public SessionData(User user){
        AssertUtil.notNull(user, CommonErrorCode.USER_NOT_EXIST);
//        if(user == null){
//            create_time = TimeUtil.getCurrentTimestamp();
//            nickname = "易启康用户";
//            gender = 0;
//            campus = CampusEnum.ZHONG_BEI.getName();
//            signature = "ta很懒，还没有签名哦~";
//            schoolAuth = 0;
//            return;
//        }

        id = user.getId();
        createTime = user.getCreateTime();
        username = user.getUsername();
        portrait = user.getPortrait();
        telephone = user.getTelephone();
        email = user.getEmail();
    }
}
