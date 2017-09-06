package com.osplans.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Loan implements Serializable {
    private Integer loanid;

    private BigDecimal amount;

    private String title;

    private Integer borrowerid;

    private String borrowernickname;

    private String borrowtype;

    private String description;

    private BigDecimal annualinterestrate;

    private BigDecimal maxannualinterestrate;

    private BigDecimal minannualinterestrate;

    private Short termcount;

    private Short termunit;

    private Integer mininvestunit;

    private Date nextrepaydate;

    private Short repayedtermcount;

    private BigDecimal biddingamount;

    private Short repaytype;

    private Date createtime;

    private Date submittime;

    private Date opentime;

    private Date openendtime;

    private Date fulltime;

    private Date releasetime;

    private Date endtime;

    private Boolean overdued;

    private Integer viewcount;

    private Short recommendweight;

    private Short status;

    private BigDecimal startfeerate;

    private BigDecimal monthfeerate;

    private BigDecimal interestfeerate;

    private Short albumcapacity;

    private Integer auditorid;

    private Integer loanportraitid;

    private String loanportraitpath;

    private Short productid;

    private String contractno;

    private Short dealstatus;

    private String loancode;

    private BigDecimal totalfee;

    private BigDecimal monthmoney;

    private Integer loantype;

    private BigDecimal loanamount;

    private BigDecimal beginamount;

    private BigDecimal increaseamount;

    private Integer loanproductid;

    private String creditdegree;

    private Integer assureid;

    private Integer recordnum;

    private Integer inputfrom;

    private BigDecimal limitMoney;

    private Integer loanClassify;

    private String redmoney;

    private String istransfer;

    private String transfertime;

    private String killres;

    private Date stoptime;

    private String rendmold;

    private String isway;

    private String investorcontract;

    private String debtcontract;

    private String mortgagetype;

    private Integer yearradix;

    private Date valuedate;

    private Date ceasedate;

    private Date arrivaldate;

    private Integer paytype;

    private BigDecimal guarateenrate;

    private Integer loanlevel;

    private BigDecimal financingrate;

    private Integer interestdays;

    private Integer interestprinciple;

    private Short feemode;

    private Short arrivalday;

    private Short monthcount;

    private Integer ceasetype;

    private Integer startinterestday;

    private Integer unfixedvaluedays;

    private BigDecimal salesrate;

    private Integer projectid;

    private String fulltitle;

    private String titlenum;

    private Short investtype;

    private Date lendingtime;

    private Date killtime;

    private Date projectbegintime;

    private Date readybegintime;

    private String releaseorderno;

    private Integer authinfo;

    private Integer restrictionnum;

    private String loanlabel;

    private static final long serialVersionUID = 1L;

    public Integer getLoanid() {
        return loanid;
    }

    public void setLoanid(Integer loanid) {
        this.loanid = loanid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getBorrowerid() {
        return borrowerid;
    }

    public void setBorrowerid(Integer borrowerid) {
        this.borrowerid = borrowerid;
    }

    public String getBorrowernickname() {
        return borrowernickname;
    }

    public void setBorrowernickname(String borrowernickname) {
        this.borrowernickname = borrowernickname == null ? null : borrowernickname.trim();
    }

    public String getBorrowtype() {
        return borrowtype;
    }

    public void setBorrowtype(String borrowtype) {
        this.borrowtype = borrowtype == null ? null : borrowtype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getAnnualinterestrate() {
        return annualinterestrate;
    }

    public void setAnnualinterestrate(BigDecimal annualinterestrate) {
        this.annualinterestrate = annualinterestrate;
    }

    public BigDecimal getMaxannualinterestrate() {
        return maxannualinterestrate;
    }

    public void setMaxannualinterestrate(BigDecimal maxannualinterestrate) {
        this.maxannualinterestrate = maxannualinterestrate;
    }

    public BigDecimal getMinannualinterestrate() {
        return minannualinterestrate;
    }

    public void setMinannualinterestrate(BigDecimal minannualinterestrate) {
        this.minannualinterestrate = minannualinterestrate;
    }

    public Short getTermcount() {
        return termcount;
    }

    public void setTermcount(Short termcount) {
        this.termcount = termcount;
    }

    public Short getTermunit() {
        return termunit;
    }

    public void setTermunit(Short termunit) {
        this.termunit = termunit;
    }

    public Integer getMininvestunit() {
        return mininvestunit;
    }

    public void setMininvestunit(Integer mininvestunit) {
        this.mininvestunit = mininvestunit;
    }

    public Date getNextrepaydate() {
        return nextrepaydate;
    }

    public void setNextrepaydate(Date nextrepaydate) {
        this.nextrepaydate = nextrepaydate;
    }

    public Short getRepayedtermcount() {
        return repayedtermcount;
    }

    public void setRepayedtermcount(Short repayedtermcount) {
        this.repayedtermcount = repayedtermcount;
    }

    public BigDecimal getBiddingamount() {
        return biddingamount;
    }

    public void setBiddingamount(BigDecimal biddingamount) {
        this.biddingamount = biddingamount;
    }

    public Short getRepaytype() {
        return repaytype;
    }

    public void setRepaytype(Short repaytype) {
        this.repaytype = repaytype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getSubmittime() {
        return submittime;
    }

    public void setSubmittime(Date submittime) {
        this.submittime = submittime;
    }

    public Date getOpentime() {
        return opentime;
    }

    public void setOpentime(Date opentime) {
        this.opentime = opentime;
    }

    public Date getOpenendtime() {
        return openendtime;
    }

    public void setOpenendtime(Date openendtime) {
        this.openendtime = openendtime;
    }

    public Date getFulltime() {
        return fulltime;
    }

    public void setFulltime(Date fulltime) {
        this.fulltime = fulltime;
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Boolean getOverdued() {
        return overdued;
    }

    public void setOverdued(Boolean overdued) {
        this.overdued = overdued;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Short getRecommendweight() {
        return recommendweight;
    }

    public void setRecommendweight(Short recommendweight) {
        this.recommendweight = recommendweight;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public BigDecimal getStartfeerate() {
        return startfeerate;
    }

    public void setStartfeerate(BigDecimal startfeerate) {
        this.startfeerate = startfeerate;
    }

    public BigDecimal getMonthfeerate() {
        return monthfeerate;
    }

    public void setMonthfeerate(BigDecimal monthfeerate) {
        this.monthfeerate = monthfeerate;
    }

    public BigDecimal getInterestfeerate() {
        return interestfeerate;
    }

    public void setInterestfeerate(BigDecimal interestfeerate) {
        this.interestfeerate = interestfeerate;
    }

    public Short getAlbumcapacity() {
        return albumcapacity;
    }

    public void setAlbumcapacity(Short albumcapacity) {
        this.albumcapacity = albumcapacity;
    }

    public Integer getAuditorid() {
        return auditorid;
    }

    public void setAuditorid(Integer auditorid) {
        this.auditorid = auditorid;
    }

    public Integer getLoanportraitid() {
        return loanportraitid;
    }

    public void setLoanportraitid(Integer loanportraitid) {
        this.loanportraitid = loanportraitid;
    }

    public String getLoanportraitpath() {
        return loanportraitpath;
    }

    public void setLoanportraitpath(String loanportraitpath) {
        this.loanportraitpath = loanportraitpath == null ? null : loanportraitpath.trim();
    }

    public Short getProductid() {
        return productid;
    }

    public void setProductid(Short productid) {
        this.productid = productid;
    }

    public String getContractno() {
        return contractno;
    }

    public void setContractno(String contractno) {
        this.contractno = contractno == null ? null : contractno.trim();
    }

    public Short getDealstatus() {
        return dealstatus;
    }

    public void setDealstatus(Short dealstatus) {
        this.dealstatus = dealstatus;
    }

    public String getLoancode() {
        return loancode;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode == null ? null : loancode.trim();
    }

    public BigDecimal getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(BigDecimal totalfee) {
        this.totalfee = totalfee;
    }

    public BigDecimal getMonthmoney() {
        return monthmoney;
    }

    public void setMonthmoney(BigDecimal monthmoney) {
        this.monthmoney = monthmoney;
    }

    public Integer getLoantype() {
        return loantype;
    }

    public void setLoantype(Integer loantype) {
        this.loantype = loantype;
    }

    public BigDecimal getLoanamount() {
        return loanamount;
    }

    public void setLoanamount(BigDecimal loanamount) {
        this.loanamount = loanamount;
    }

    public BigDecimal getBeginamount() {
        return beginamount;
    }

    public void setBeginamount(BigDecimal beginamount) {
        this.beginamount = beginamount;
    }

    public BigDecimal getIncreaseamount() {
        return increaseamount;
    }

    public void setIncreaseamount(BigDecimal increaseamount) {
        this.increaseamount = increaseamount;
    }

    public Integer getLoanproductid() {
        return loanproductid;
    }

    public void setLoanproductid(Integer loanproductid) {
        this.loanproductid = loanproductid;
    }

    public String getCreditdegree() {
        return creditdegree;
    }

    public void setCreditdegree(String creditdegree) {
        this.creditdegree = creditdegree == null ? null : creditdegree.trim();
    }

    public Integer getAssureid() {
        return assureid;
    }

    public void setAssureid(Integer assureid) {
        this.assureid = assureid;
    }

    public Integer getRecordnum() {
        return recordnum;
    }

    public void setRecordnum(Integer recordnum) {
        this.recordnum = recordnum;
    }

    public Integer getInputfrom() {
        return inputfrom;
    }

    public void setInputfrom(Integer inputfrom) {
        this.inputfrom = inputfrom;
    }

    public BigDecimal getLimitMoney() {
        return limitMoney;
    }

    public void setLimitMoney(BigDecimal limitMoney) {
        this.limitMoney = limitMoney;
    }

    public Integer getLoanClassify() {
        return loanClassify;
    }

    public void setLoanClassify(Integer loanClassify) {
        this.loanClassify = loanClassify;
    }

    public String getRedmoney() {
        return redmoney;
    }

    public void setRedmoney(String redmoney) {
        this.redmoney = redmoney == null ? null : redmoney.trim();
    }

    public String getIstransfer() {
        return istransfer;
    }

    public void setIstransfer(String istransfer) {
        this.istransfer = istransfer == null ? null : istransfer.trim();
    }

    public String getTransfertime() {
        return transfertime;
    }

    public void setTransfertime(String transfertime) {
        this.transfertime = transfertime == null ? null : transfertime.trim();
    }

    public String getKillres() {
        return killres;
    }

    public void setKillres(String killres) {
        this.killres = killres == null ? null : killres.trim();
    }

    public Date getStoptime() {
        return stoptime;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }

    public String getRendmold() {
        return rendmold;
    }

    public void setRendmold(String rendmold) {
        this.rendmold = rendmold == null ? null : rendmold.trim();
    }

    public String getIsway() {
        return isway;
    }

    public void setIsway(String isway) {
        this.isway = isway == null ? null : isway.trim();
    }

    public String getInvestorcontract() {
        return investorcontract;
    }

    public void setInvestorcontract(String investorcontract) {
        this.investorcontract = investorcontract == null ? null : investorcontract.trim();
    }

    public String getDebtcontract() {
        return debtcontract;
    }

    public void setDebtcontract(String debtcontract) {
        this.debtcontract = debtcontract == null ? null : debtcontract.trim();
    }

    public String getMortgagetype() {
        return mortgagetype;
    }

    public void setMortgagetype(String mortgagetype) {
        this.mortgagetype = mortgagetype == null ? null : mortgagetype.trim();
    }

    public Integer getYearradix() {
        return yearradix;
    }

    public void setYearradix(Integer yearradix) {
        this.yearradix = yearradix;
    }

    public Date getValuedate() {
        return valuedate;
    }

    public void setValuedate(Date valuedate) {
        this.valuedate = valuedate;
    }

    public Date getCeasedate() {
        return ceasedate;
    }

    public void setCeasedate(Date ceasedate) {
        this.ceasedate = ceasedate;
    }

    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getGuarateenrate() {
        return guarateenrate;
    }

    public void setGuarateenrate(BigDecimal guarateenrate) {
        this.guarateenrate = guarateenrate;
    }

    public Integer getLoanlevel() {
        return loanlevel;
    }

    public void setLoanlevel(Integer loanlevel) {
        this.loanlevel = loanlevel;
    }

    public BigDecimal getFinancingrate() {
        return financingrate;
    }

    public void setFinancingrate(BigDecimal financingrate) {
        this.financingrate = financingrate;
    }

    public Integer getInterestdays() {
        return interestdays;
    }

    public void setInterestdays(Integer interestdays) {
        this.interestdays = interestdays;
    }

    public Integer getInterestprinciple() {
        return interestprinciple;
    }

    public void setInterestprinciple(Integer interestprinciple) {
        this.interestprinciple = interestprinciple;
    }

    public Short getFeemode() {
        return feemode;
    }

    public void setFeemode(Short feemode) {
        this.feemode = feemode;
    }

    public Short getArrivalday() {
        return arrivalday;
    }

    public void setArrivalday(Short arrivalday) {
        this.arrivalday = arrivalday;
    }

    public Short getMonthcount() {
        return monthcount;
    }

    public void setMonthcount(Short monthcount) {
        this.monthcount = monthcount;
    }

    public Integer getCeasetype() {
        return ceasetype;
    }

    public void setCeasetype(Integer ceasetype) {
        this.ceasetype = ceasetype;
    }

    public Integer getStartinterestday() {
        return startinterestday;
    }

    public void setStartinterestday(Integer startinterestday) {
        this.startinterestday = startinterestday;
    }

    public Integer getUnfixedvaluedays() {
        return unfixedvaluedays;
    }

    public void setUnfixedvaluedays(Integer unfixedvaluedays) {
        this.unfixedvaluedays = unfixedvaluedays;
    }

    public BigDecimal getSalesrate() {
        return salesrate;
    }

    public void setSalesrate(BigDecimal salesrate) {
        this.salesrate = salesrate;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getFulltitle() {
        return fulltitle;
    }

    public void setFulltitle(String fulltitle) {
        this.fulltitle = fulltitle == null ? null : fulltitle.trim();
    }

    public String getTitlenum() {
        return titlenum;
    }

    public void setTitlenum(String titlenum) {
        this.titlenum = titlenum == null ? null : titlenum.trim();
    }

    public Short getInvesttype() {
        return investtype;
    }

    public void setInvesttype(Short investtype) {
        this.investtype = investtype;
    }

    public Date getLendingtime() {
        return lendingtime;
    }

    public void setLendingtime(Date lendingtime) {
        this.lendingtime = lendingtime;
    }

    public Date getKilltime() {
        return killtime;
    }

    public void setKilltime(Date killtime) {
        this.killtime = killtime;
    }

    public Date getProjectbegintime() {
        return projectbegintime;
    }

    public void setProjectbegintime(Date projectbegintime) {
        this.projectbegintime = projectbegintime;
    }

    public Date getReadybegintime() {
        return readybegintime;
    }

    public void setReadybegintime(Date readybegintime) {
        this.readybegintime = readybegintime;
    }

    public String getReleaseorderno() {
        return releaseorderno;
    }

    public void setReleaseorderno(String releaseorderno) {
        this.releaseorderno = releaseorderno == null ? null : releaseorderno.trim();
    }

    public Integer getAuthinfo() {
        return authinfo;
    }

    public void setAuthinfo(Integer authinfo) {
        this.authinfo = authinfo;
    }

    public Integer getRestrictionnum() {
        return restrictionnum;
    }

    public void setRestrictionnum(Integer restrictionnum) {
        this.restrictionnum = restrictionnum;
    }

    public String getLoanlabel() {
        return loanlabel;
    }

    public void setLoanlabel(String loanlabel) {
        this.loanlabel = loanlabel == null ? null : loanlabel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loanid=").append(loanid);
        sb.append(", amount=").append(amount);
        sb.append(", title=").append(title);
        sb.append(", borrowerid=").append(borrowerid);
        sb.append(", borrowernickname=").append(borrowernickname);
        sb.append(", borrowtype=").append(borrowtype);
        sb.append(", description=").append(description);
        sb.append(", annualinterestrate=").append(annualinterestrate);
        sb.append(", maxannualinterestrate=").append(maxannualinterestrate);
        sb.append(", minannualinterestrate=").append(minannualinterestrate);
        sb.append(", termcount=").append(termcount);
        sb.append(", termunit=").append(termunit);
        sb.append(", mininvestunit=").append(mininvestunit);
        sb.append(", nextrepaydate=").append(nextrepaydate);
        sb.append(", repayedtermcount=").append(repayedtermcount);
        sb.append(", biddingamount=").append(biddingamount);
        sb.append(", repaytype=").append(repaytype);
        sb.append(", createtime=").append(createtime);
        sb.append(", submittime=").append(submittime);
        sb.append(", opentime=").append(opentime);
        sb.append(", openendtime=").append(openendtime);
        sb.append(", fulltime=").append(fulltime);
        sb.append(", releasetime=").append(releasetime);
        sb.append(", endtime=").append(endtime);
        sb.append(", overdued=").append(overdued);
        sb.append(", viewcount=").append(viewcount);
        sb.append(", recommendweight=").append(recommendweight);
        sb.append(", status=").append(status);
        sb.append(", startfeerate=").append(startfeerate);
        sb.append(", monthfeerate=").append(monthfeerate);
        sb.append(", interestfeerate=").append(interestfeerate);
        sb.append(", albumcapacity=").append(albumcapacity);
        sb.append(", auditorid=").append(auditorid);
        sb.append(", loanportraitid=").append(loanportraitid);
        sb.append(", loanportraitpath=").append(loanportraitpath);
        sb.append(", productid=").append(productid);
        sb.append(", contractno=").append(contractno);
        sb.append(", dealstatus=").append(dealstatus);
        sb.append(", loancode=").append(loancode);
        sb.append(", totalfee=").append(totalfee);
        sb.append(", monthmoney=").append(monthmoney);
        sb.append(", loantype=").append(loantype);
        sb.append(", loanamount=").append(loanamount);
        sb.append(", beginamount=").append(beginamount);
        sb.append(", increaseamount=").append(increaseamount);
        sb.append(", loanproductid=").append(loanproductid);
        sb.append(", creditdegree=").append(creditdegree);
        sb.append(", assureid=").append(assureid);
        sb.append(", recordnum=").append(recordnum);
        sb.append(", inputfrom=").append(inputfrom);
        sb.append(", limitMoney=").append(limitMoney);
        sb.append(", loanClassify=").append(loanClassify);
        sb.append(", redmoney=").append(redmoney);
        sb.append(", istransfer=").append(istransfer);
        sb.append(", transfertime=").append(transfertime);
        sb.append(", killres=").append(killres);
        sb.append(", stoptime=").append(stoptime);
        sb.append(", rendmold=").append(rendmold);
        sb.append(", isway=").append(isway);
        sb.append(", investorcontract=").append(investorcontract);
        sb.append(", debtcontract=").append(debtcontract);
        sb.append(", mortgagetype=").append(mortgagetype);
        sb.append(", yearradix=").append(yearradix);
        sb.append(", valuedate=").append(valuedate);
        sb.append(", ceasedate=").append(ceasedate);
        sb.append(", arrivaldate=").append(arrivaldate);
        sb.append(", paytype=").append(paytype);
        sb.append(", guarateenrate=").append(guarateenrate);
        sb.append(", loanlevel=").append(loanlevel);
        sb.append(", financingrate=").append(financingrate);
        sb.append(", interestdays=").append(interestdays);
        sb.append(", interestprinciple=").append(interestprinciple);
        sb.append(", feemode=").append(feemode);
        sb.append(", arrivalday=").append(arrivalday);
        sb.append(", monthcount=").append(monthcount);
        sb.append(", ceasetype=").append(ceasetype);
        sb.append(", startinterestday=").append(startinterestday);
        sb.append(", unfixedvaluedays=").append(unfixedvaluedays);
        sb.append(", salesrate=").append(salesrate);
        sb.append(", projectid=").append(projectid);
        sb.append(", fulltitle=").append(fulltitle);
        sb.append(", titlenum=").append(titlenum);
        sb.append(", investtype=").append(investtype);
        sb.append(", lendingtime=").append(lendingtime);
        sb.append(", killtime=").append(killtime);
        sb.append(", projectbegintime=").append(projectbegintime);
        sb.append(", readybegintime=").append(readybegintime);
        sb.append(", releaseorderno=").append(releaseorderno);
        sb.append(", authinfo=").append(authinfo);
        sb.append(", restrictionnum=").append(restrictionnum);
        sb.append(", loanlabel=").append(loanlabel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}