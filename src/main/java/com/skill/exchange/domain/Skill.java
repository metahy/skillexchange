package com.skill.exchange.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Skill {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.student_id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private Integer studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.student_num
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String studentNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.student_real_name
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String studentRealName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.title
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.img
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String img;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.content
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.ask_for
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String askFor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.create_time
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column skill.state
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private boolean state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.id
     *
     * @return the value of skill.id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.id
     *
     * @param id the value for skill.id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.student_id
     *
     * @return the value of skill.student_id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.student_id
     *
     * @param studentId the value for skill.student_id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.student_num
     *
     * @return the value of skill.student_num
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getStudentNum() {
        return studentNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.student_num
     *
     * @param studentNum the value for skill.student_num
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum == null ? null : studentNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.student_real_name
     *
     * @return the value of skill.student_real_name
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getStudentRealName() {
        return studentRealName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.student_real_name
     *
     * @param studentRealName the value for skill.student_real_name
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setStudentRealName(String studentRealName) {
        this.studentRealName = studentRealName == null ? null : studentRealName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.title
     *
     * @return the value of skill.title
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.title
     *
     * @param title the value for skill.title
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.img
     *
     * @return the value of skill.img
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.img
     *
     * @param img the value for skill.img
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.content
     *
     * @return the value of skill.content
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.content
     *
     * @param content the value for skill.content
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.ask_for
     *
     * @return the value of skill.ask_for
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getAskFor() {
        return askFor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.ask_for
     *
     * @param askFor the value for skill.ask_for
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setAskFor(String askFor) {
        this.askFor = askFor == null ? null : askFor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.create_time
     *
     * @return the value of skill.create_time
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.create_time
     *
     * @param createTime the value for skill.create_time
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    @DateTimeFormat(pattern = "yy-MM-dd HH:mm:ss")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column skill.state
     *
     * @return the value of skill.state
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public boolean isState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column skill.state
     *
     * @param state the value for skill.state
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setState(boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table skill
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", studentId=").append(studentId);
        sb.append(", studentNum=").append(studentNum);
        sb.append(", studentRealName=").append(studentRealName);
        sb.append(", title=").append(title);
        sb.append(", img=").append(img);
        sb.append(", content=").append(content);
        sb.append(", askFor=").append(askFor);
        sb.append(", createTime=").append(createTime);
        sb.append(", state=").append(state);
        sb.append("]");
        return sb.toString();
    }
}