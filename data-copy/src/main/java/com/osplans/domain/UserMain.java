package com.osplans.domain;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class UserMain implements Serializable {

    private static final long serialVersionUID = -2897339658016366494L;

    private Integer userid;

    private String email;

    private String nickname;

    private String realname;

    private String idcardno;

    private String passwd;

    private String paypassword;

    private String mobile;

    private String city;

    private Date registertime;

    private Short roles;

    private BigDecimal cash;

    private BigDecimal frozenwithdrawcash;

    private BigDecimal frozenbiddingcash;

    private Short idverifylimit;

    private Integer portrait;

    private Short status;

    private Short forbidstatus;

    private Short albumcapacity;

    private Short securitylevel;

    private String weibouid;

    private String weiboaccesstoken;

    private String qquid;

    private String qqaccesstoken;

    private Short origin;

    private Integer staffid;

    private String usercode;

    private String referee;

    private String nicknamesj;

    private Integer vipgradeid;

    private Integer moldid;

    private Integer creditnum;

    private String blacklist;

    private Integer storeid;

    private Date usercodetime;

    private Integer isautopayment;

    private Integer isemailauth;

    private Integer currentstatus;

    private Short enterprisetype;

    private Integer canbetrade;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", email=").append(email);
        sb.append(", nickname=").append(nickname);
        sb.append(", realname=").append(realname);
        sb.append(", idcardno=").append(idcardno);
        sb.append(", passwd=").append(passwd);
        sb.append(", paypassword=").append(paypassword);
        sb.append(", mobile=").append(mobile);
        sb.append(", city=").append(city);
        sb.append(", registertime=").append(registertime);
        sb.append(", roles=").append(roles);
        sb.append(", cash=").append(cash);
        sb.append(", frozenwithdrawcash=").append(frozenwithdrawcash);
        sb.append(", frozenbiddingcash=").append(frozenbiddingcash);
        sb.append(", idverifylimit=").append(idverifylimit);
        sb.append(", portrait=").append(portrait);
        sb.append(", status=").append(status);
        sb.append(", forbidstatus=").append(forbidstatus);
        sb.append(", albumcapacity=").append(albumcapacity);
        sb.append(", securitylevel=").append(securitylevel);
        sb.append(", weibouid=").append(weibouid);
        sb.append(", weiboaccesstoken=").append(weiboaccesstoken);
        sb.append(", qquid=").append(qquid);
        sb.append(", qqaccesstoken=").append(qqaccesstoken);
        sb.append(", origin=").append(origin);
        sb.append(", staffid=").append(staffid);
        sb.append(", usercode=").append(usercode);
        sb.append(", referee=").append(referee);
        sb.append(", nicknamesj=").append(nicknamesj);
        sb.append(", vipgradeid=").append(vipgradeid);
        sb.append(", moldid=").append(moldid);
        sb.append(", creditnum=").append(creditnum);
        sb.append(", blacklist=").append(blacklist);
        sb.append(", storeid=").append(storeid);
        sb.append(", usercodetime=").append(usercodetime);
        sb.append(", isautopayment=").append(isautopayment);
        sb.append(", isemailauth=").append(isemailauth);
        sb.append(", currentstatus=").append(currentstatus);
        sb.append(", enterprisetype=").append(enterprisetype);
        sb.append(", canbetrade=").append(canbetrade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}