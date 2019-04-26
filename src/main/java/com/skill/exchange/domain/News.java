package com.skill.exchange.domain;

import java.util.Date;

public class News {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.title
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.content
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column news.create_time
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.id
     *
     * @return the value of news.id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.id
     *
     * @param id the value for news.id
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.title
     *
     * @return the value of news.title
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.title
     *
     * @param title the value for news.title
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.content
     *
     * @return the value of news.content
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.content
     *
     * @param content the value for news.content
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column news.create_time
     *
     * @return the value of news.create_time
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column news.create_time
     *
     * @param createTime the value for news.create_time
     *
     * @mbg.generated Fri Apr 19 11:32:55 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table news
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
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}