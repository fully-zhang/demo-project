package com.osplans.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class UserStatistic implements Serializable {

    private static final long serialVersionUID = -5595242046102103203L;

    private Integer id;

    private Integer userid;

    private BigDecimal totalcharge;

    private BigDecimal totalwithdraw;

    private BigDecimal totalassert;

    private BigDecimal totalearnedinterest;

    private BigDecimal totalearnedpunitiveinterest;

    private BigDecimal weightedrateofreturn;

    private Integer investcount;

    private BigDecimal totalinvestamout;

    private BigDecimal investamoutinthismonth;

    private BigDecimal returnedamountinthismonth;

    private BigDecimal tocollectprincipal;

    private BigDecimal tocollectinterest;

    private BigDecimal totalreturnedprincipal;

    private BigDecimal totalplatformpayed;

    private BigDecimal boughtcreditrights;

    private BigDecimal soldcreditrights;

    private Short requestloancount;

    private Short permittedloancount;

    private Short finishedloancount;

    private Short overduecount;

    private Short badloancount;

    private BigDecimal totalpermittedamount;

    private BigDecimal totaltorepayamount;

    private BigDecimal totaloverdueamount;

    private BigDecimal actualloanamount;

    private BigDecimal servicefees;

    private BigDecimal riskmargin;

    private BigDecimal alreadypayinterest;

    private BigDecimal totalinterest;

    private BigDecimal alreadyrepayment;

    private BigDecimal residualrepayment;

    private BigDecimal totalrepaiedprincipal;

    private BigDecimal totalrepaiedinterest;

    private Integer boughtcreditrightscount;

    private Integer soldcreditrightscount;

    private BigDecimal boughtcreditrightspaidinterest;

    private BigDecimal boughtcreditrightsearneddiscount;

    private BigDecimal soldcreditrightsearnedinterest;

    private BigDecimal soldcreditrightspaiddiscount;

    private BigDecimal commissionfees;

    private BigDecimal activitybonus;

    private BigDecimal rewardMoney;

    private BigDecimal tocollectredmoneyinterest;

    private BigDecimal totalearnedredmoneyinterest;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", totalcharge=").append(totalcharge);
        sb.append(", totalwithdraw=").append(totalwithdraw);
        sb.append(", totalassert=").append(totalassert);
        sb.append(", totalearnedinterest=").append(totalearnedinterest);
        sb.append(", totalearnedpunitiveinterest=").append(totalearnedpunitiveinterest);
        sb.append(", weightedrateofreturn=").append(weightedrateofreturn);
        sb.append(", investcount=").append(investcount);
        sb.append(", totalinvestamout=").append(totalinvestamout);
        sb.append(", investamoutinthismonth=").append(investamoutinthismonth);
        sb.append(", returnedamountinthismonth=").append(returnedamountinthismonth);
        sb.append(", tocollectprincipal=").append(tocollectprincipal);
        sb.append(", tocollectinterest=").append(tocollectinterest);
        sb.append(", totalreturnedprincipal=").append(totalreturnedprincipal);
        sb.append(", totalplatformpayed=").append(totalplatformpayed);
        sb.append(", boughtcreditrights=").append(boughtcreditrights);
        sb.append(", soldcreditrights=").append(soldcreditrights);
        sb.append(", requestloancount=").append(requestloancount);
        sb.append(", permittedloancount=").append(permittedloancount);
        sb.append(", finishedloancount=").append(finishedloancount);
        sb.append(", overduecount=").append(overduecount);
        sb.append(", badloancount=").append(badloancount);
        sb.append(", totalpermittedamount=").append(totalpermittedamount);
        sb.append(", totaltorepayamount=").append(totaltorepayamount);
        sb.append(", totaloverdueamount=").append(totaloverdueamount);
        sb.append(", actualloanamount=").append(actualloanamount);
        sb.append(", servicefees=").append(servicefees);
        sb.append(", riskmargin=").append(riskmargin);
        sb.append(", alreadypayinterest=").append(alreadypayinterest);
        sb.append(", totalinterest=").append(totalinterest);
        sb.append(", alreadyrepayment=").append(alreadyrepayment);
        sb.append(", residualrepayment=").append(residualrepayment);
        sb.append(", totalrepaiedprincipal=").append(totalrepaiedprincipal);
        sb.append(", totalrepaiedinterest=").append(totalrepaiedinterest);
        sb.append(", boughtcreditrightscount=").append(boughtcreditrightscount);
        sb.append(", soldcreditrightscount=").append(soldcreditrightscount);
        sb.append(", boughtcreditrightspaidinterest=").append(boughtcreditrightspaidinterest);
        sb.append(", boughtcreditrightsearneddiscount=").append(boughtcreditrightsearneddiscount);
        sb.append(", soldcreditrightsearnedinterest=").append(soldcreditrightsearnedinterest);
        sb.append(", soldcreditrightspaiddiscount=").append(soldcreditrightspaiddiscount);
        sb.append(", commissionfees=").append(commissionfees);
        sb.append(", activitybonus=").append(activitybonus);
        sb.append(", rewardMoney=").append(rewardMoney);
        sb.append(", tocollectredmoneyinterest=").append(tocollectredmoneyinterest);
        sb.append(", totalearnedredmoneyinterest=").append(totalearnedredmoneyinterest);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}