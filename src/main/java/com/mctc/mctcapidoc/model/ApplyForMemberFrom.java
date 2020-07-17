package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:48$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:48$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "ApplyForMemberFrom", description = "入会申请表单,这里的参数是全量具体提交参考表单字段定制")
public class ApplyForMemberFrom {

    @ApiModelProperty(value = "姓名", name = "name", dataType = "String")
    private String name;

    @ApiModelProperty(value = "性别", name = "sex", dataType = "String")
    private String sex;

    @ApiModelProperty(value = "出生日期", name = "birthdate", dataType = "String")
    private String birthdate;

    @ApiModelProperty(value = "手机号", name = "PhoneNumber", dataType = "String")
    private String PhoneNumber;

    @ApiModelProperty(value = "邮箱", name = "mailAddress", dataType = "String")
    private String mailAddress;

    @ApiModelProperty(value = "公司名", name = "company", dataType = "String")
    private String company;

    @ApiModelProperty(value = "职位", name = "jobTitle", dataType = "String")
    private String jobTitle;

    @ApiModelProperty(value = "职位", name = "所在地区", dataType = "String")
    private String region;

    @ApiModelProperty(value = "detailedAddress", name = "详细地址", dataType = "String")
    private String detailedAddress;

    @ApiModelProperty(value = "affectiveState", name = "情感状态", dataType = "String")
    private String affectiveState;

    @ApiModelProperty(value = "hobbies", name = "兴趣爱好", dataType = "List<String>")
    private List<String> hobbies;

    @ApiModelProperty(value = "selfIntroduction", name = "自我介绍", dataType = "String")
    private String selfIntroduction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getAffectiveState() {
        return affectiveState;
    }

    public void setAffectiveState(String affectiveState) {
        this.affectiveState = affectiveState;
    }


    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
