package com.bin.domain;

import java.io.Serializable;
import java.util.Date;

public class TProductUser implements Serializable {
    /**
     * 自增主键
     */
    private String pseqid;

    /**
     * 商品SPU
     */
    private String spu;

    /**
     * 订单号
     */
    private String orderid;

    /**
     * 平台客户号
     */
    private String cusmerid;

    /**
     * 手机号
     */
    private String mobileno;

    /**
     * 卡号
     */
    private String cardno;

    /**
     * 名称
     */
    private String name;

    /**
     * 补充描述
     */
    private String title;

    /**
     * 图片（默认图片） 套票展示图片
     */
    private String image;

    /**
     * 状态 0：未使用
	 * <p>
	 * 1：使用中（部分景点已使用）
	 * <p>
	 * 2：已退货
	 * <p>
	 * 3：已过期
	 * <p>
	 * 4：已使用
     */
    private Integer status;

    /**
     * 描述 套票描述
     */
    private String productdesc;

    /**
     * 单价 套票销售价
     */
    private Integer priceCurrent;

    /**
     * 原价 套票市场价，一般高于套票销售价，商城展示用
     */
    private Integer priceOriginal;

    /**
     * 商品货号 套票票面码
     */
    private String goodsNo;

    /**
     * 商品生效时间
     */
    private String effectTime;

    /**
     * 商品失效时间
     */
    private String expireTime;

    /**
     * 套票已使用次数
     */
    private Integer usetimes;

    /**
     * 套票记次总次数
     */
    private Integer alltimes;

    /**
     * 接入渠道号
     */
    private String channleid;

    /**
     * 接入商户号
     */
    private String merid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取 自增主键
     */
    public String getPseqid() {
        return pseqid;
    }

    /**
     * 设置   自增主键
     */
    public void setPseqid(String pseqid) {
        this.pseqid = pseqid;
    }

    /**
     * 获取 商品SPU
     */
    public String getSpu() {
        return spu;
    }

    /**
     * 设置   商品SPU
     */
    public void setSpu(String spu) {
        this.spu = spu;
    }

    /**
     * 获取 订单号
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * 设置   订单号
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    /**
     * 获取 平台客户号
     */
    public String getCusmerid() {
        return cusmerid;
    }

    /**
     * 设置   平台客户号
     */
    public void setCusmerid(String cusmerid) {
        this.cusmerid = cusmerid;
    }

    /**
     * 获取 手机号
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * 设置   手机号
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * 获取 卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置   卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * 获取 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置   名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 补充描述
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置   补充描述
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取 图片（默认图片） 套票展示图片
     */
    public String getImage() {
        return image;
    }

    /**
     * 设置   图片（默认图片） 套票展示图片
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取 状态 0：未使用
	 * <p>
	 * 1：使用中（部分景点已使用）
	 * <p>
	 * 2：已退货
	 * <p>
	 * 3：已过期
	 * <p>
	 * 4：已使用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置   状态 0：未使用
	 * <p>
	 * 1：使用中（部分景点已使用）
	 * <p>
	 * 2：已退货
	 * <p>
	 * 3：已过期
	 * <p>
	 * 4：已使用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取 描述 套票描述
     */
    public String getProductdesc() {
        return productdesc;
    }

    /**
     * 设置   描述 套票描述
     */
    public void setProductdesc(String productdesc) {
        this.productdesc = productdesc;
    }

    /**
     * 获取 单价 套票销售价
     */
    public Integer getPriceCurrent() {
        return priceCurrent;
    }

    /**
     * 设置   单价 套票销售价
     */
    public void setPriceCurrent(Integer priceCurrent) {
        this.priceCurrent = priceCurrent;
    }

    /**
     * 获取 原价 套票市场价，一般高于套票销售价，商城展示用
     */
    public Integer getPriceOriginal() {
        return priceOriginal;
    }

    /**
     * 设置   原价 套票市场价，一般高于套票销售价，商城展示用
     */
    public void setPriceOriginal(Integer priceOriginal) {
        this.priceOriginal = priceOriginal;
    }

    /**
     * 获取 商品货号 套票票面码
     */
    public String getGoodsNo() {
        return goodsNo;
    }

    /**
     * 设置   商品货号 套票票面码
     */
    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    /**
     * 获取 商品生效时间
     */
    public String getEffectTime() {
        return effectTime;
    }

    /**
     * 设置   商品生效时间
     */
    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }

    /**
     * 获取 商品失效时间
     */
    public String getExpireTime() {
        return expireTime;
    }

    /**
     * 设置   商品失效时间
     */
    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * 获取 套票已使用次数
     */
    public Integer getUsetimes() {
        return usetimes;
    }

    /**
     * 设置   套票已使用次数
     */
    public void setUsetimes(Integer usetimes) {
        this.usetimes = usetimes;
    }

    /**
     * 获取 套票记次总次数
     */
    public Integer getAlltimes() {
        return alltimes;
    }

    /**
     * 设置   套票记次总次数
     */
    public void setAlltimes(Integer alltimes) {
        this.alltimes = alltimes;
    }

    /**
     * 获取 接入渠道号
     */
    public String getChannleid() {
        return channleid;
    }

    /**
     * 设置   接入渠道号
     */
    public void setChannleid(String channleid) {
        this.channleid = channleid;
    }

    /**
     * 获取 接入商户号
     */
    public String getMerid() {
        return merid;
    }

    /**
     * 设置   接入商户号
     */
    public void setMerid(String merid) {
        this.merid = merid;
    }

    /**
     * 获取 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置   创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置   更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}