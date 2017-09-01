package com.osplans.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanInvestorData implements Serializable {

    private static final long serialVersionUID = 3279169577034050079L;

    private Integer loanid;

    private String investoruserid;

    private BigDecimal investamount;

    private Date investtime;

    private Short lefttermcount;

    private BigDecimal tobecollectedprincipal;

    private BigDecimal tobecollectedinterest;

    private BigDecimal collectedprincipal;

    private BigDecimal collectedinterest;

    private BigDecimal nextphaseprincipal;

    private BigDecimal nextphaseinterest;

    private Date nextrepaydate;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", loanid=").append(loanid);
        sb.append(", investoruserid=").append(investoruserid);
        sb.append(", investamount=").append(investamount);
        sb.append(", investtime=").append(investtime);
        sb.append(", lefttermcount=").append(lefttermcount);
        sb.append(", tobecollectedprincipal=").append(tobecollectedprincipal);
        sb.append(", tobecollectedinterest=").append(tobecollectedinterest);
        sb.append(", collectedprincipal=").append(collectedprincipal);
        sb.append(", collectedinterest=").append(collectedinterest);
        sb.append(", nextphaseprincipal=").append(nextphaseprincipal);
        sb.append(", nextphaseinterest=").append(nextphaseinterest);
        sb.append(", nextrepaydate=").append(nextrepaydate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}