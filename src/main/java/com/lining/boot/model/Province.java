package com.lining.boot.model;

public class Province {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_province.area_id
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    private Long areaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_province.province_code
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    private String provinceCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_province.province_name
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    private String provinceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_province.area_id
     *
     * @return the value of t_province.area_id
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    public Long getAreaId() {
        return areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_province.area_id
     *
     * @param areaId the value for t_province.area_id
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_province.province_code
     *
     * @return the value of t_province.province_code
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    public String getProvinceCode() {
        return provinceCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_province.province_code
     *
     * @param provinceCode the value for t_province.province_code
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_province.province_name
     *
     * @return the value of t_province.province_name
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    public String getProvinceName() {
        return provinceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_province.province_name
     *
     * @param provinceName the value for t_province.province_name
     *
     * @mbg.generated Mon May 14 15:48:59 GMT+08:00 2018
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName == null ? null : provinceName.trim();
    }
}