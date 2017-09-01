package com.osplans.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanInvestor implements Serializable {

    private static final long serialVersionUID = -6241040041489322341L;

    private Integer id;

    private Integer loanid;

    private Integer investoruserid;

    private String investornickname;

    private Integer lastinvestoruserid;

    private String lastinvestornickname;

    private BigDecimal investamount;

    private Date investtime;

    private Short borrowercreditpoint;

    private BigDecimal termreturnamount;

    private BigDecimal lasttermprincipalcompensation;

    private Short lefttermcount;

    private BigDecimal tobecollectedprincipal;

    private BigDecimal tobecollectedinterest;

    private BigDecimal collectedprincipal;

    private BigDecimal collectedinterest;

    private BigDecimal nextphaseprincipal;

    private BigDecimal nextphaseinterest;

    private Date lastrepaydate;

    private Date nextrepaydate;

    private Boolean autoinvest;

    private Short status;

    private BigDecimal soldprice;

    private Date solddate;

    private Short soldphasenum;

    private Short overduedays;

    private BigDecimal overdueinterest;

    private BigDecimal solddiscountrate;

    private BigDecimal soldcommission;

    private String contractno;

    private String serialnumber;

    private Integer inputfrom;

    private String redMoneyId;

    private BigDecimal tobecollectedredmoneyinterest;

    private BigDecimal collectedredmoneyinterest;

    private Boolean bear;

    private String soldorderno;

    private String contract;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loanid=").append(loanid);
        sb.append(", investoruserid=").append(investoruserid);
        sb.append(", investornickname=").append(investornickname);
        sb.append(", lastinvestoruserid=").append(lastinvestoruserid);
        sb.append(", lastinvestornickname=").append(lastinvestornickname);
        sb.append(", investamount=").append(investamount);
        sb.append(", investtime=").append(investtime);
        sb.append(", borrowercreditpoint=").append(borrowercreditpoint);
        sb.append(", termreturnamount=").append(termreturnamount);
        sb.append(", lasttermprincipalcompensation=").append(lasttermprincipalcompensation);
        sb.append(", lefttermcount=").append(lefttermcount);
        sb.append(", tobecollectedprincipal=").append(tobecollectedprincipal);
        sb.append(", tobecollectedinterest=").append(tobecollectedinterest);
        sb.append(", collectedprincipal=").append(collectedprincipal);
        sb.append(", collectedinterest=").append(collectedinterest);
        sb.append(", nextphaseprincipal=").append(nextphaseprincipal);
        sb.append(", nextphaseinterest=").append(nextphaseinterest);
        sb.append(", lastrepaydate=").append(lastrepaydate);
        sb.append(", nextrepaydate=").append(nextrepaydate);
        sb.append(", autoinvest=").append(autoinvest);
        sb.append(", status=").append(status);
        sb.append(", soldprice=").append(soldprice);
        sb.append(", solddate=").append(solddate);
        sb.append(", soldphasenum=").append(soldphasenum);
        sb.append(", overduedays=").append(overduedays);
        sb.append(", overdueinterest=").append(overdueinterest);
        sb.append(", solddiscountrate=").append(solddiscountrate);
        sb.append(", soldcommission=").append(soldcommission);
        sb.append(", contractno=").append(contractno);
        sb.append(", serialnumber=").append(serialnumber);
        sb.append(", inputfrom=").append(inputfrom);
        sb.append(", redMoneyId=").append(redMoneyId);
        sb.append(", tobecollectedredmoneyinterest=").append(tobecollectedredmoneyinterest);
        sb.append(", collectedredmoneyinterest=").append(collectedredmoneyinterest);
        sb.append(", bear=").append(bear);
        sb.append(", soldorderno=").append(soldorderno);
        sb.append(", contract=").append(contract);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}