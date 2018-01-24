package com.bin.domain;

import java.io.Serializable;
import java.util.Date;

public class TProductUser implements Serializable {
    /**
     * ��������
     */
    private String pseqid;

    /**
     * ��ƷSPU
     */
    private String spu;

    /**
     * ������
     */
    private String orderid;

    /**
     * ƽ̨�ͻ���
     */
    private String cusmerid;

    /**
     * �ֻ���
     */
    private String mobileno;

    /**
     * ����
     */
    private String cardno;

    /**
     * ����
     */
    private String name;

    /**
     * ��������
     */
    private String title;

    /**
     * ͼƬ��Ĭ��ͼƬ�� ��ƱչʾͼƬ
     */
    private String image;

    /**
     * ״̬ 0��δʹ��
	 * <p>
	 * 1��ʹ���У����־�����ʹ�ã�
	 * <p>
	 * 2�����˻�
	 * <p>
	 * 3���ѹ���
	 * <p>
	 * 4����ʹ��
     */
    private Integer status;

    /**
     * ���� ��Ʊ����
     */
    private String productdesc;

    /**
     * ���� ��Ʊ���ۼ�
     */
    private Integer priceCurrent;

    /**
     * ԭ�� ��Ʊ�г��ۣ�һ�������Ʊ���ۼۣ��̳�չʾ��
     */
    private Integer priceOriginal;

    /**
     * ��Ʒ���� ��ƱƱ����
     */
    private String goodsNo;

    /**
     * ��Ʒ��Чʱ��
     */
    private String effectTime;

    /**
     * ��ƷʧЧʱ��
     */
    private String expireTime;

    /**
     * ��Ʊ��ʹ�ô���
     */
    private Integer usetimes;

    /**
     * ��Ʊ�Ǵ��ܴ���
     */
    private Integer alltimes;

    /**
     * ����������
     */
    private String channleid;

    /**
     * �����̻���
     */
    private String merid;

    /**
     * ����ʱ��
     */
    private Date createTime;

    /**
     * ����ʱ��
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * ��ȡ ��������
     */
    public String getPseqid() {
        return pseqid;
    }

    /**
     * ����   ��������
     */
    public void setPseqid(String pseqid) {
        this.pseqid = pseqid;
    }

    /**
     * ��ȡ ��ƷSPU
     */
    public String getSpu() {
        return spu;
    }

    /**
     * ����   ��ƷSPU
     */
    public void setSpu(String spu) {
        this.spu = spu;
    }

    /**
     * ��ȡ ������
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * ����   ������
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * ��ȡ ƽ̨�ͻ���
     */
    public String getCusmerid() {
        return cusmerid;
    }

    /**
     * ����   ƽ̨�ͻ���
     */
    public void setCusmerid(String cusmerid) {
        this.cusmerid = cusmerid;
    }

    /**
     * ��ȡ �ֻ���
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * ����   �ֻ���
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * ��ȡ ����
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * ����   ����
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * ��ȡ ����
     */
    public String getName() {
        return name;
    }

    /**
     * ����   ����
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ ��������
     */
    public String getTitle() {
        return title;
    }

    /**
     * ����   ��������
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * ��ȡ ͼƬ��Ĭ��ͼƬ�� ��ƱչʾͼƬ
     */
    public String getImage() {
        return image;
    }

    /**
     * ����   ͼƬ��Ĭ��ͼƬ�� ��ƱչʾͼƬ
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * ��ȡ ״̬ 0��δʹ��
	 * <p>
	 * 1��ʹ���У����־�����ʹ�ã�
	 * <p>
	 * 2�����˻�
	 * <p>
	 * 3���ѹ���
	 * <p>
	 * 4����ʹ��
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * ����   ״̬ 0��δʹ��
	 * <p>
	 * 1��ʹ���У����־�����ʹ�ã�
	 * <p>
	 * 2�����˻�
	 * <p>
	 * 3���ѹ���
	 * <p>
	 * 4����ʹ��
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * ��ȡ ���� ��Ʊ����
     */
    public String getProductdesc() {
        return productdesc;
    }

    /**
     * ����   ���� ��Ʊ����
     */
    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    /**
     * ��ȡ ���� ��Ʊ���ۼ�
     */
    public Integer getPriceCurrent() {
        return priceCurrent;
    }

    /**
     * ����   ���� ��Ʊ���ۼ�
     */
    public void setPriceCurrent(Integer priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    /**
     * ��ȡ ԭ�� ��Ʊ�г��ۣ�һ�������Ʊ���ۼۣ��̳�չʾ��
     */
    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    /**
     * ����   ԭ�� ��Ʊ�г��ۣ�һ�������Ʊ���ۼۣ��̳�չʾ��
     */
    public void setPriceOriginal(Integer priceOriginal) {
        this.priceOriginal = priceOriginal;
    }

    /**
     * ��ȡ ��Ʒ���� ��ƱƱ����
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * ����   ��Ʒ���� ��ƱƱ����
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    /**
     * ��ȡ ��Ʒ��Чʱ��
     */
    public String getEffectTime() {
        return effectTime;
    }

    /**
     * ����   ��Ʒ��Чʱ��
     */
    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * ��ȡ ��ƷʧЧʱ��
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * ����   ��ƷʧЧʱ��
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * ��ȡ ��Ʊ��ʹ�ô���
     */
    public Integer getUsetimes() {
        return usetimes;
    }

    /**
     * ����   ��Ʊ��ʹ�ô���
     */
    public void setUsetimes(Integer usetimes) {
        this.usetimes = usetimes;
    }

    /**
     * ��ȡ ��Ʊ�Ǵ��ܴ���
     */
    public Integer getAlltimes() {
        return alltimes;
    }

    /**
     * ����   ��Ʊ�Ǵ��ܴ���
     */
    public void setAlltimes(Integer alltimes) {
        this.alltimes = alltimes;
    }

    /**
     * ��ȡ ����������
     */
    public String getChannleid() {
        return channleid;
    }

    /**
     * ����   ����������
     */
    public void setChannleid(String channleid) {
        this.channleid = channleid;
    }

    /**
     * ��ȡ �����̻���
     */
    public String getMerid() {
        return merid;
    }

    /**
     * ����   �����̻���
     */
    public void setMerid(String merid) {
        this.merid = merid;
    }

    /**
     * ��ȡ ����ʱ��
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * ����   ����ʱ��
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * ��ȡ ����ʱ��
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * ����   ����ʱ��
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}