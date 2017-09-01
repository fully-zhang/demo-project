package com.osplans.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class LoanData implements Serializable {

    private static final long serialVersionUID = -8660503643548629143L;

    private Integer loanid;

    private BigDecimal amount;

    private String title;

    private String borrowerid;

    private String description;

    private BigDecimal annualinterestrate;

    private Short termcount;

    private Short termunit;

    private Date nextrepaydate;

    private Date endtime;

    private Short status;

    private Integer loantype;

    private Date valuedate;

    private Date ceasedate;

    private Date arrivaldate;

    private BigDecimal financingrate;

    private Integer interestdays;

    private String fulltitle;

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
        sb.append(", description=").append(description);
        sb.append(", annualinterestrate=").append(annualinterestrate);
        sb.append(", termcount=").append(termcount);
        sb.append(", termunit=").append(termunit);
        sb.append(", nextrepaydate=").append(nextrepaydate);
        sb.append(", endtime=").append(endtime);
        sb.append(", status=").append(status);
        sb.append(", loantype=").append(loantype);
        sb.append(", valuedate=").append(valuedate);
        sb.append(", ceasedate=").append(ceasedate);
        sb.append(", arrivaldate=").append(arrivaldate);
        sb.append(", financingrate=").append(financingrate);
        sb.append(", interestdays=").append(interestdays);
        sb.append(", fulltitle=").append(fulltitle);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}