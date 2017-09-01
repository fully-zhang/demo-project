package com.osplans.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class Loan implements Serializable {

    private static final long serialVersionUID = 8291489884153860700L;

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