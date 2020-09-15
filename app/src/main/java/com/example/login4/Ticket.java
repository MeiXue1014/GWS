package com.example.login4;

public class Ticket {
    public String ticketName;
    public String ticketDetail;
    public String code;

    public Ticket(String ticketName, String ticketDetail, String code) {
        this.ticketName = ticketName;
        this.ticketDetail = ticketDetail;
        this.code = code;
    }

    public String getTicketName() {
        return ticketName;
    }

    public void setTicketName(String ticketName) {
        this.ticketName = ticketName;
    }

    public String getTicketDetail() {
        return ticketDetail;
    }

    public void setTicketDetail(String ticketDetail) {
        this.ticketDetail = ticketDetail;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Ticket() {

    }
}
